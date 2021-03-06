/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;


import com.edu.DAO.ClientDAO;
import com.edu.entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

    public List<Client> listClientt = new ArrayList<>();
    String []header = {"E_mail","Nom","Prénom","Ville","Mot de passe"};

    public MyTableModel() { 
        listClientt=new ClientDAO().AfficherClient();
    }
    
    @Override
    public int getRowCount() {
        return listClientt.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listClientt.get(rowIndex).getEmail();
           
            case 1:
                return listClientt.get(rowIndex).getNom();
            case 2:
                return listClientt.get(rowIndex).getPrenom();
            case 3:
                return listClientt.get(rowIndex).getVille();
            case 4:
                return listClientt.get(rowIndex).getPassword();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}

