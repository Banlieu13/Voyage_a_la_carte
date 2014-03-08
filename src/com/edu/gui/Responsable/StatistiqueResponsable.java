/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;

/**
 *
 * @author nada
 */
import com.edu.DAO.StatistiquesResponsableDAO;
import com.edu.gui.authentification;
import java.io.IOException;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*; 


public class StatistiqueResponsable extends ApplicationFrame {
    public StatistiqueResponsable(final String title) throws IOException {
        
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }
public CategoryDataset createDataset() throws IOException {
        // 0. Création d'un diagramme.
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       //Valeurs statiques
        StatistiquesResponsableDAO srd = new StatistiquesResponsableDAO();
        authentification a = new authentification();
        int nbr = srd.AfficherNbrAnnonces(a.identifiant);
        int nbr2= srd.AfficherNbrOffres(a.identifiant);
        System.out.println(nbr);
        dataset.addValue(nbr, "Nombres des annonces", " ");
        dataset.addValue(nbr2, " Nombres des Offres", " ");
        //dataset.addValue(0, "", " ");
        //dataset.addValue(19, "Taux de couverture Incar", " ");
       return dataset;
    }
	public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart3D(
                " Statistiques ", // chart title
                " ", // domain axis label
                "  Nombre ", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

 final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    public static void main(final String[] args) throws IOException {
        final StatistiqueResponsable demo = new StatistiqueResponsable("Test de la couverture ");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
