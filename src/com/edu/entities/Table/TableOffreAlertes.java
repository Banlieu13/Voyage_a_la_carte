package com.edu.entities.Table;


import com.edu.DAO.GererAlerteDAO;
import com.edu.entities.Signalisation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableOffreAlertes extends AbstractTableModel {

    public List<Signalisation> listAlertes = new ArrayList<>();
    String []header = {"ID","Sujet","Type","code offre","Client","Responsable"};

    public TableOffreAlertes() { 
        listAlertes=new GererAlerteDAO().AfficherAlerteOffre();
    }
    
    @Override
    public int getRowCount() {
        return listAlertes.size();
    }

    @Override
    public int getColumnCount() { 
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {
            case 0:
                return listAlertes.get(rowIndex).getIdSig();
            case 1:
                return listAlertes.get(rowIndex).getSujet();
            case 2:
                return listAlertes.get(rowIndex).getType();
            case 3:
                return listAlertes.get(rowIndex).getId_offre();
            case 4:
                return listAlertes.get(rowIndex).getE_mail();
            case 5:
                return listAlertes.get(rowIndex).getE_mailR();
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { 
        return header[column]; 
    }
    

}