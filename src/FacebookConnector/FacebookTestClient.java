package FacebookConnector;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FacebookTestClient extends JFrame {


 JButton getPermissionsForApp;


 public FacebookTestClient() {

 }



 public void setgetPermissionsForAppListener(ActionListener l) {
  getPermissionsForApp.addActionListener(l);
 }



}
