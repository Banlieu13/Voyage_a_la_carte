/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;


import com.edu.DAO.ClientDAO;
import com.edu.DAO.DestinationDAO;
import com.edu.entities.Client;
import com.edu.entities.Destination;
import com.edu.gui.authentification;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableMesDestination extends AbstractTableModel {

    public List<Destination> listDest = new ArrayList<>();
    String []header = {"Num Destination","trajetD","Hebergement","Moy_Transport","Budget","Contact"};

    public TableMesDestination() { 
        listDest=new DestinationDAO().DisplayMyDestination(new authentification().identifiant);
    }
    
    @Override
    public int getRowCount() {
        return listDest.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listDest.get(rowIndex).getIdDest();
            case 1:
                return listDest.get(rowIndex).getTrajetD();
            case 2:
                return listDest.get(rowIndex).getHebergement();
            case 3:
                return listDest.get(rowIndex).getMoyTransp();
            case 4:
                return listDest.get(rowIndex).getBudget();
            case 5:
                return listDest.get(rowIndex).getE_mail();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}

