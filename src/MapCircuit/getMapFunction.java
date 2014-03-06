package MapCircuit;

import com.edu.connection.ConnectionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class getMapFunction {
   double[] t = new double[4];
  
   private static String url;

    public static String getUrl() {
        return url;
    }

    public double[] getLocationById(String pays){
       try {
           double[] tab = new double[2];
           String req="SELECT * FROM googlemap WHERE `pays`='"+pays+"'";
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
           ResultSet resultat = statement.executeQuery(req);
           
           while(resultat.next()){
               tab[0]=resultat.getDouble(3);
               tab[1]=resultat.getDouble(4);
           }
           return tab;
       } catch (SQLException ex) {
           Logger.getLogger(getMapFunction.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
    
    public  void setUrl(String paysDep, String paysArv) {
       double[] tDepart = new double[4];
       double[] tArrive = new double[4];
       tDepart=getLocationById(paysDep);
       tArrive=getLocationById(paysArv);
       this.url = "https://www.google.com/maps/embed?pb=\n!1m25!1m12!1m3!1d1623092.8906429613!2d10.627046577989761!3d37.3873892158034!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m10!1i0!3e6!4m3!3m2!1d"
          +tDepart[0]+"!2d"+tDepart[1]+"!4m3!3m2!1d\n"+tArrive[0]+"!2d"+tArrive[1]+"!5e0!3m2!1sen!2s!4v1393993136846\"";
    }
  
   public getMapFunction(){
       
   }
  
  
    
  
}