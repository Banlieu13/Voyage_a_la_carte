/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;



import com.edu.DAO.DestinationDAO;
import com.edu.entities.Destination;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableDestination extends AbstractTableModel {

    public List<Destination> listDestination = new ArrayList<>();
    String []header = {"Numéro Destination","Trajet","Hebergement","Programme","Moy_transport","Budget","Contact"};

    public TableDestination() { 
        listDestination=new DestinationDAO().DisplayAllDestination();
    }
    
    @Override
    public int getRowCount() {
        return listDestination.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listDestination.get(rowIndex).getIdDest();
            case 1:
                return listDestination.get(rowIndex).getTrajetD();
            case 2:
                return listDestination.get(rowIndex).getHebergement();
            case 3:
                return listDestination.get(rowIndex).getProgramme();
            case 4:
                return listDestination.get(rowIndex).getMoyTransp();
            case 5:
                return listDestination.get(rowIndex).getBudget();
            case 6:
                return listDestination.get(rowIndex).getE_mail();
                
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}


