/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;


import com.edu.DAO.ReservationDAO;
import com.edu.entities.Client;
import com.edu.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableReservation extends AbstractTableModel {

    public List<Client> listClientt = new ArrayList<>();
    String []header = {"ID","Date_Creation","Client","Type_Carte","Num_Carte","Date de Validité","IDOffre"};
    public List<Reservation> listeRes;

    public TableReservation() { 
        listeRes=new ReservationDAO().DisplayAllReservation();
    }
    
    @Override
    public int getRowCount() {
        return listeRes.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listeRes.get(rowIndex).getIdRes();
            case 1:
                return listeRes.get(rowIndex).getDate();
            case 2:
                return listeRes.get(rowIndex).getE_mail();
            case 3:
                return listeRes.get(rowIndex).getTypeDeCarte();
            case 4:
                return listeRes.get(rowIndex).getNumCarte();
            case 5:
                return listeRes.get(rowIndex).getDateValidité();
             case 6:
                return listeRes.get(rowIndex).getCryptogrammevisuel();
            case 7:
                return listeRes.get(rowIndex).getId_offre();
                case 8:
                return listeRes.get(rowIndex).getId_annonce();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}


