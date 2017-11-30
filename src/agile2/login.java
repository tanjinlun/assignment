package agile_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import entity.Account;

/**
 *
 * @author HP
 */

public class login extends JFrame {

   //label and textfield
    private JLabel jlblTitle = new JLabel("LOGIN ACCOUNT");
    private JLabel jlblUName = new JLabel("UserName:");
    private JTextField jtfUName = new JTextField(15);    
    private JLabel jlblPassword = new JLabel("Password:");
    private JPasswordField jpfPassword = new JPasswordField(15);
    private JTextArea jtaMenu = new JTextArea(10, 50);
    
    //button
    private JButton jbtLogin = new JButton("Login");
    private JButton jbtReset = new JButton("Reset");
    
    
    //test
    // private JButton jbtTest = new JButton("Count");
    
    //adt list
    private ListInterface<Account> accountList = new LList<>();
    
    public login() {
        
    setTitle("Login Account");
    
    jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    
    //add label and textfield
    JPanel jpInput = new JPanel(new GridLayout(2, 2));
    jpInput.add(jlblUName);
    jpInput.add(jtfUName);
    jpInput.add(jlblPassword);
    jpInput.add(jpfPassword);

    
    JPanel jpSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    //add button
    jpSouth.add(jbtLogin);
    jpSouth.add(jbtReset);
    //jpSouth.add(jbtTest);
    
    add(jpInput, BorderLayout.WEST);
    add(jlblTitle, BorderLayout.NORTH);
    add(jpSouth, BorderLayout.SOUTH);
    
    jbtLogin.addActionListener(new  LoginListenerClass()); 
    jbtReset.addActionListener(new  ResetListenerClass()); 
    //jbtTest.addActionListener(new CountListenerClass());
    
    jtaMenu.setLineWrap(true);
    jtaMenu.setWrapStyleWord(true);
    jtaMenu.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(jtaMenu);
    add(scrollPane, BorderLayout.EAST);
    jtfUName.grabFocus();
      
  }
      //add menu item
    private class LoginListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
                
      
      String username = jtfUName.getText();
      String password = jpfPassword.getText();      
     
        
              if(username.equals("user1") && password.equals("user123"))
              {
                  JOptionPane.showMessageDialog(null, "Login Successful!");
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "Incorrect Username Or Password!");
              }
          
 
      

}} ;

  //reset textfield
private class ResetListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
   
     jtfUName.setText(null);
     jpfPassword.setText(null);
      jtfUName.grabFocus();
}} ;

     //test

 /*private class CountListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
    String test = "";
       String test = "asdf";
        String account = accountList.getEntry(1).getName();
        
        if(account.equals(test)){
        JOptionPane.showMessageDialog(null, "Same");}
        else
        {
             JOptionPane.showMessageDialog(null, "Diff");}
        
       
             test = accountList.getEntry(1).getName();
             JOptionPane.showMessageDialog(rootPane, test);
        
       
        
}} ;*/

    public static void main(String[] args) {
    login frame = new login();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }

}
