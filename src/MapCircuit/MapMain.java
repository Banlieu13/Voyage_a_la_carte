package MapCircuit;



import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class MapMain {

    public static String API_KEY = "1459067980977286";
    public static String SECRET = "8ceaefbba12d878176c7105a12cd372a";
    getMapFunction t1=new getMapFunction();


public void afficherMap(String paysDep,String paysArv){
    String[] args = null;   
    getMapFunction t1=new getMapFunction();
          t1.setUrl(paysDep,paysArv);
          MapMain.main(args);
}
  
    /**
     * @param args
     */
    public static void main(final String[] args) {
         
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                NativeInterface.open();
                NativeInterface.initialize();
          
    final JFrame authFrame = new JFrame();

    final JPanel webBrowserPanel = new JPanel(new BorderLayout());
    final JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.setMenuBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    webBrowser.setLocationBarVisible(false);
    webBrowser.navigate( getMapFunction.getUrl());
   
    webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
    authFrame.add(webBrowserPanel);
    authFrame.setSize(500, 500);
    
     
    authFrame.setVisible(true);
   
}

       });
                }
    
    
}

