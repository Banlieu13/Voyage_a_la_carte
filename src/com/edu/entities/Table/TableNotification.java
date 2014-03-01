
package com.edu.entities.Table;


import com.edu.DAO.ResponsableDAO;
import com.edu.entities.Responsable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableNotification extends AbstractTableModel {

    public List<Responsable> listrespNotif = new ArrayList<>();
    String []header = {"E_mail","CIN","Nom","Prénom","Ville","valide"};

    public TableNotification() { 
        listrespNotif=new ResponsableDAO().AfficherResponsableNotif();
    }
    
    @Override
    public int getRowCount() {
        return listrespNotif.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listrespNotif.get(rowIndex).getEmail();
            case 1:
                return listrespNotif.get(rowIndex).getCin();
            case 2:
                return listrespNotif.get(rowIndex).getNom();
            case 3:
                return listrespNotif.get(rowIndex).getPrenom();
            case 4:
                return listrespNotif.get(rowIndex).getVille();
            case 5:
                return listrespNotif.get(rowIndex).getValide();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}

