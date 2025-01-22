import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField; 
 
public class LoginFrame extends JFrame implements ActionListener { 
 JLabel lblusername, lblpassword; 
 JTextField txtusername; 
 JPasswordField txtpassword; 
 JButton btnlogin, btncancel; 
  
 LoginFrame(){ 
  lblusername = new JLabel("Enter your user name "); 
  lblpassword = new JLabel("Enter your password "); 
  txtusername = new JTextField(30); 
  txtpassword = new JPasswordField(30); 
  btnlogin = new JButton("Login"); 
  btncancel = new JButton("Cancel"); 
   
  add(lblusername); 
  add(txtusername); 
  add(lblpassword); 
  add(txtpassword); 
  add(btnlogin); 
  add(btncancel); 
   
  btncancel.addActionListener(this); 
  btnlogin.addActionListener(this); 
   
  setSize(400,300); 
  setVisible(true); 
  setTitle("Login Frame "); 
  setLayout(new FlowLayout()); 
  setLocationRelativeTo(null); 
 } 
 public static void main(String[] args) { 
  LoginFrame f1 = new LoginFrame(); 
 } 
 @Override 
 public void actionPerformed(ActionEvent e) { 
  if (e.getSource()==btncancel) { 
   this.dispose(); 
  } 
  else { 
   //System.out.println("Login Button Clicked"); 
   String un = txtusername.getText(); 
   String pwd = txtpassword.getText(); 
   if(un.equals("admin") && pwd.equals("admin123")) { 
    System.out.println("Hello ! Your login is Successfull!!! "); 
   } else if(e.getSource()==btnregister) {
	   new RegistrationFrame();
   }
   
   else { 
    System.out.println("Sorry ! Wrong username or password "); 
   } 
  } 
 } 
  
}