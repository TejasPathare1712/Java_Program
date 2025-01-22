import java.awt.event.ActionEvent;import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;import javax.swing.JLabel;
import javax.swing.JPasswordField;import javax.swing.JTextField;
import java.awt.Container;
public class LoginFrame extends JFrame implements ActionListener {
 JLabel lblusername, lblpassword; JTextField txtusername;
 JPasswordField txtpassword; JButton btnlogin, btncancel, btnregister;
 Container cp; 
 LoginFrame(){  
  lblusername = new JLabel("Enter your user name ");  lblusername.setBounds(172, 118, 150, 30);
  lblpassword = new JLabel("Enter your password ");  lblpassword.setBounds(172, 183, 150, 30);
  txtusername = new JTextField(30);
  txtusername.setBounds(332, 118, 150, 30);  txtpassword = new JPasswordField(30);
  txtpassword.setBounds(332, 183, 150, 30);  btnlogin = new JButton("Login");
  btnlogin.setBounds(235, 244, 80, 30);  btncancel = new JButton("Cancel");
  btncancel.setBounds(356, 244, 80, 30);  btnregister = new JButton("Register");
  btnregister.setBounds(400, 20, 150, 30);  cp = getContentPane();
  getContentPane().setLayout(null);  
  cp.add(btnregister);  cp.add(lblusername);
  cp.add(txtusername);  cp.add(lblpassword);
  cp.add(txtpassword);  cp.add(btnlogin);
  cp.add(btncancel);  
    // Register the component for event handling 
  btncancel.addActionListener(this);  btnlogin.addActionListener(this);
  btnregister.addActionListener(this);  
  setSize(563,388);  setVisible(true);
  setTitle("Login Frame ");  setLocationRelativeTo(null);
 } public static void main(String[] args) {
  LoginFrame f1 = new LoginFrame(); }
 @Override public void actionPerformed(ActionEvent e) {
  if (e.getSource()==btncancel) {   this.dispose();
  }  else if(e.getSource()==btnregister) {
   new RegistrationFrame();  }
  else {   //System.out.println("Login Button Clicked");
   String un = txtusername.getText();
   String pwd = txtpassword.getText();   if(un.equals("admin") && pwd.equals("admin123")) {
    System.out.println("Hello ! Your login is Successfull!!! ");   }
   else {    System.out.println("Sorry ! Wrong username or password ");
   }  }
 } 
}