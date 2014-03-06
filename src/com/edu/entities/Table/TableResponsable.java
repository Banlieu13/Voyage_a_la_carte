/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;

import com.edu.DAO.ResponsableDAO;
import com.edu.entities.Responsable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MrBenrhouma
 */
public class TableResponsable extends AbstractTableModel{
    
    public List<Responsable> listResponsable = new ArrayList<>();
    String []header = {"E_mail","CIN","Nom","Prénom","Ville","Mot de passe","Numéro de l'Agence"};

    public TableResponsable() { 
        listResponsable=new ResponsableDAO().AfficherResponsable();
    }
    
    @Override
    public int getRowCount() {
        return listResponsable.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listResponsable.get(rowIndex).getEmail();
            case 1:
                return listResponsable.get(rowIndex).getCin();
            case 2:
                return listResponsable.get(rowIndex).getNom();
            case 3:
                return listResponsable.get(rowIndex).getPrenom();
            case 4:
                return listResponsable.get(rowIndex).getVille();
            case 5:
                return listResponsable.get(rowIndex).getPassword();
            case 6:
                return listResponsable.get(rowIndex).getMatAgence();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    
}
