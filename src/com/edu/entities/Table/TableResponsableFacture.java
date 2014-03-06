/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities.Table;

import com.edu.DAO.factureDAO;
import com.edu.entities.facture_responsable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author omar
 */
public class TableResponsableFacture  extends AbstractTableModel{
   


  public List<facture_responsable> listFacture = new ArrayList<>();
  
    String []header = {"Numéro Facture","date","TVA","Total","Id_offre","Id_agence","Id_Client"};

    public TableResponsableFacture() { 
        listFacture=new factureDAO().AfficherFacture();
    }
    
    @Override
    public int getRowCount() {
        return listFacture.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listFacture.get(rowIndex).getId();
            case 1:
                return listFacture.get(rowIndex).getDate();
            case 2:
                return listFacture.get(rowIndex).getTVA();
            case 3:
                return listFacture.get(rowIndex).getTotal();
            case 4:
                return listFacture.get(rowIndex).getId_offre();
            case 5:
                return listFacture.get(rowIndex).getId_agence();
                case 6:
                return listFacture.get(rowIndex).getId_client();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    
    
}
