package com.edu.gui;

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
 List<Annonce> listStock = new ArrayList<>();
    String []header = {"Date","Trajet","Hotel","Prix"};

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
                return listStock.get(rowIndex).getDatean();
            case 1://colonne type_vetement
                return listStock.get(rowIndex).getTrajet();
            case 2://colonne quantité
                return listStock.get(rowIndex).getHotel();
            case 3://colonne adresse depot
                return listStock.get(rowIndex).getPrix();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}

