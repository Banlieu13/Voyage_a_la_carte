package FacebookConnector;



import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;





public class MainFacebook {

public static String API_KEY = "1459067980977286";
public static String SECRET = "8ceaefbba12d878176c7105a12cd372a";

  public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
  
  public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "client_secret=" + SECRET + "&code=";

  public static String access_token = "";
  public static boolean firstRequestDone = false;
   public static boolean secondRequestDone = false;
    /**
     * @param args
     */
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                NativeInterface.open();
                NativeInterface.initialize();
         
      System.out.println(" Bouton 2");
    final JFrame authFrame = new JFrame();

    final JPanel webBrowserPanel = new JPanel(new BorderLayout());
    final JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.setMenuBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    webBrowser.setLocationBarVisible(false);
    webBrowser.navigate(firstRequest);
    webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
      @Override
      public void locationChanged(WebBrowserNavigationEvent e) {
        super.locationChanged(e);
      
        if (!firstRequestDone) {
         if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
            String[] splits = e.getNewResourceLocation().split("=");
            String stage2temp = secondRequest + splits[1];
              System.out.println("First ="+splits[1]);
            webBrowser.navigate(stage2temp);
            firstRequestDone = true;
          
          }
        } else {
         
          if (!secondRequestDone) {
           
            StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
           
            HTMLEditorKit.ParserCallback callback = 
            new HTMLEditorKit.ParserCallback() {
                @Override
              public void handleText(char[] data,int pos) {
                String[] temp1=null;
                String[] temp2 =null;
                  authFrame.setVisible(false);
                System.out.println(data);
                // because there is only one line with the access_token 
                // in the html content you can parse it.
                String string = new String(data);
                temp1 = string.split("&");
                 temp2 = temp1[0].split("=");
                 //   System.out.println("access tocken="+temp2);
                access_token = temp2[1];
                 GraphReaderExample.main(args);
           
              }
            };
            try {
          
              new ParserDelegator().parse(readerSTR,callback,false);
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            
            authFrame.dispose();
          
          }
        }
      }
    });
    webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
    authFrame.add(webBrowserPanel);
    authFrame.setSize(400, 500);
    
     
    authFrame.setVisible(true);
   
}

       });
                }
    
    
}

