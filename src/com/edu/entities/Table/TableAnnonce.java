/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;

import com.edu.DAO.AnnonceDAO;
import com.edu.DAO.DestinationDAO;
import com.edu.entities.Annonce;
import com.edu.entities.Destination;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LENOVO
 */
public class TableAnnonce  extends AbstractTableModel 
        {

    public List<Annonce> listAnnonce = new ArrayList<>();
    String []header;

    public TableAnnonce() { 
        this.header = new String[]{"ID_Annonce", "Date_annonce", "Date_creation", "Circuit", "Nombre_place", "Hotel_annonce", "Prix_annonce", "Email_R"};
        listAnnonce=new AnnonceDAO().DisplayAllAnnonce();
    }
    
    @Override
    public int getRowCount() {
        return listAnnonce.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listAnnonce.get(rowIndex).getIdAnnonce();
            case 1:
                return listAnnonce.get(rowIndex).getDatean();
            case 2:
                return listAnnonce.get(rowIndex).getDatecreation();
            case 3:
                return listAnnonce.get(rowIndex).getCircuit();
            case 4:
                return listAnnonce.get(rowIndex).getNbrplace();
            case 5:
                return listAnnonce.get(rowIndex).getHotel();
            case 6:
                return listAnnonce.get(rowIndex).getPrix();
            case 7:
                return listAnnonce.get(rowIndex).getEmailR();
                
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}



    

