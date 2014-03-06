/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;

import com.edu.DAO.AdminDAO;
import com.edu.entities.Administrateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MrBenrhouma
 */
public class TableAdmin extends AbstractTableModel{
    
    public List<Administrateur> listAdmin = new ArrayList<>();
    String []header = {"E_mail","CIN","Nom","Prénom","Ville","Mot de passe"};

    public TableAdmin() { 
        listAdmin=new AdminDAO().AfficherAdmin();
    }
    
    @Override
    public int getRowCount() {
        return listAdmin.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listAdmin.get(rowIndex).getEmail();
            case 1:
                return listAdmin.get(rowIndex).getCin();
            case 2:
                return listAdmin.get(rowIndex).getNom();
            case 3:
                return listAdmin.get(rowIndex).getPrenom();
            case 4:
                return listAdmin.get(rowIndex).getVille();
            case 5:
                return listAdmin.get(rowIndex).getPassword();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    
}
