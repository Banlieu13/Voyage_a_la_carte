/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;


import com.edu.DAO.offreDAO;
import com.edu.entities.Offre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableOffre extends AbstractTableModel {

    public List<Offre> listOffre = new ArrayList<>();
    String []header = {"Numéro Offre","Date","Date de Création","Circuit","Places","Hotel","Prix","Responsable"};

    public TableOffre() { 
        listOffre=new offreDAO().DisplayAllOffre();
    }
    
    @Override
    public int getRowCount() {
        return listOffre.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listOffre.get(rowIndex).getIdOffre();
            case 1:
                return listOffre.get(rowIndex).getDate();
            case 2:
                return listOffre.get(rowIndex).getDateCreation();
            case 3:
                return listOffre.get(rowIndex).getCircuit();
            case 4:
                return listOffre.get(rowIndex).getPlaces();
            case 5:
                return listOffre.get(rowIndex).getHotel();
            case 6:
                return listOffre.get(rowIndex).getPrix();
            case 7:
                return listOffre.get(rowIndex).getE_mailR();
          
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}

