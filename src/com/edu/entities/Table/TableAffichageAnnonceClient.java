package com.edu.entities.Table;

import com.edu.entities.Annonce;
import com.edu.DAO.AnnonceDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wassim
 */
public class TableAffichageAnnonceClient extends AbstractTableModel  {
 public List<Annonce> listStock = new ArrayList<>();
    String []header = {"Numero Annonce","Date","Date de création","Circuit","Places","Hotel","Prix","Contact"};

    public TableAffichageAnnonceClient() { //remplissage de la liste des stocks
        listStock=new AnnonceDAO().DisplayAllAnnonce();
    }
    
 @Override
    public int getRowCount() { //nombre de lignes de la table
        return listStock.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return listStock.get(rowIndex).getIdAnnonce();
            case 1:
                return listStock.get(rowIndex).getDatean();
            case 2:
                return listStock.get(rowIndex).getDatecreation();
            case 3:
                return listStock.get(rowIndex).getCircuit();
            case 4:
                return listStock.get(rowIndex).getNbrplace();
            case 5:
                return listStock.get(rowIndex).getHotel();
            case 6:
                return listStock.get(rowIndex).getPrix();
            case 7:
                return listStock.get(rowIndex).getEmailR();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}

