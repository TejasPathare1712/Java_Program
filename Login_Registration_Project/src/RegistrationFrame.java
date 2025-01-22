import javax.swing.JFrame;import javax.swing.JLabel;
import javax.swing.JPasswordField;import javax.swing.JTextField;
import java.awt.Color;import javax.swing.JButton;
import java.awt.event.ActionListener;import java.awt.event.ActionEvent;
import java.awt.Rectangle;import java.awt.Font;
public class RegistrationFrame extends JFrame implements ActionListener{
 JLabel lblname,lbladdress,lblemail,lblphone,lblusername,lblpassword; JTextField txtname,txtaddress,txtemail,txtphone,txtusername;
 JPasswordField txtpassword; private JButton btnregister;
  public RegistrationFrame() {
  getContentPane().setBackground(new Color(255, 0, 255));  lblname = new JLabel("Enter Name ");
  lblname.setBackground(new Color(240, 240, 240));  lblname.setBounds(59, 43, 150, 30);
  lbladdress = new JLabel("Enter Address ");  lbladdress.setBounds(59, 91, 150, 30);
  lblemail = new JLabel("Enter Email ");  lblemail.setBounds(59, 140, 150, 30);
  lblphone = new JLabel("Enter Phone ");  lblphone.setBounds(59, 191, 150, 30);
  lblusername = new JLabel("Enter User Name ");  lblusername.setBounds(59, 242, 150, 30);
  lblpassword = new JLabel("Enter Password ");  lblpassword.setBounds(59, 287, 150, 30);
    txtname = new JTextField();
  txtname.setBounds(new Rectangle(0, 0, 250, 30));
  txtname.setBounds(211, 43, 250, 30);  txtaddress = new JTextField();
  txtaddress.setBounds(new Rectangle(0, 0, 250, 30));  txtaddress.setBounds(211, 91, 250, 30);
  txtemail = new JTextField();  txtemail.setBounds(new Rectangle(0, 0, 250, 30));
  txtemail.setBounds(211, 140, 250, 30);  txtphone = new JTextField();
  txtphone.setBounds(new Rectangle(0, 0, 250, 30));  txtphone.setBounds(211, 191, 250, 30);
  txtusername = new JTextField();  txtusername.setBounds(new Rectangle(0, 0, 250, 30));
  txtusername.setBounds(211, 242, 250, 30);  txtpassword= new JPasswordField();
  txtpassword.setBounds(new Rectangle(0, 0, 250, 30));  txtpassword.setBounds(211, 287, 250, 30);
  getContentPane().setLayout(null);  
  getContentPane().add(lblname);  getContentPane().add(txtname);
  getContentPane().add(lbladdress);  getContentPane().add(txtaddress);
  getContentPane().add(lblemail);  getContentPane().add(txtemail);
  getContentPane().add(lblphone);  getContentPane().add(txtphone);
  getContentPane().add(lblusername);  getContentPane().add(txtusername);
  getContentPane().add(lblpassword);  getContentPane().add(txtpassword);
    btnregister = new JButton("Register");
  btnregister.setBorder(null);  btnregister.setBackground(new Color(255, 255, 128));
  btnregister.setForeground(new Color(0, 0, 255));  btnregister.setFont(new Font("Times New Roman", Font.BOLD, 25));
    btnregister.setBounds(227, 355, 151, 81);
  getContentPane().add(btnregister);  
  btnregister.addActionListener(this);  
  setSize(600,500);  setVisible(true);
  setTitle("Registration "); }

 @Override public void actionPerformed(ActionEvent e) {
  if(e.getSource()==btnregister) {   this.dispose();
   /*    * insert into users
    * */   new LoginFrame();
  } }
}