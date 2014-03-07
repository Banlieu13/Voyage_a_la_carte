package FacebookConnector;

import com.edu.DAO.ClientDAO;
import com.edu.entities.Client;
import com.edu.gui.Client.acceuilclient;
import static java.lang.System.out;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

@SuppressWarnings("deprecation")
public class GraphReaderExample {
  private final FacebookClient facebookClient;


  
  public static void main(String[] args) {
    new GraphReaderExample(MainFacebook.access_token).runEverything();
  }

  GraphReaderExample(String accessToken) {
    facebookClient = new DefaultFacebookClient(accessToken);
  }

    
 

  void runEverything() {
      fetchObject();

  }

  void fetchObject() {
    out.println("* Fetching single objects *");

    User user = facebookClient.fetchObject("me", User.class);
    //Page page = facebookClient.fetchObject("cocacola", Page.class);
    Client c = new Client();
    ClientDAO cd = new ClientDAO();
   
  
    c.setEmail(user.getEmail());
    Client.setFbem(user.getEmail());
    Client.setFbid(user.getId());
    Client.setFbnom(user.getName());
    c.setNom(user.getName());
    c.setPrenom("Prenom");
    c.setPassword(user.getEmail());
    c.setVille("ville");
    Client cl = cd.chercherClient(user.getEmail());
    System.out.println("------------------"+cl.getEmail());
    if (cl.getEmail()==null){
        cd.insertclient(c);
        
        acceuilclient ac = new acceuilclient();
        ac.setVisible(true);
       
        System.out.println("ok");
    }else{
        acceuilclient ac = new acceuilclient();
        ac.setVisible(true);
        ac.setTemp(null);
    }
    out.println("Name: " + user.getName());
    out.println("Username: " + user.getUsername());
    out.println("Email: " + user.getEmail());
    out.println("ID Facebook: " + user.getId());
    out.println("About: " + user.getAbout());
    out.println("Birthday: " + user.getBirthday());
    
    
  }

}