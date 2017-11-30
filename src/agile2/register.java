package agile_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import entity.Account;

/**
 *
 * @author HP
 */

public class register extends JFrame {

   //label and textfield
    private JLabel jlblTitle = new JLabel("REGISTER ACCOUNT");
    private JLabel jlblName = new JLabel("Restaurant Name: ");
    private JTextField jtfName = new JTextField(15);
    private JLabel jlblUName = new JLabel("UserName:");
    private JTextField jtfUName = new JTextField(15);    
    private JLabel jlblPassword = new JLabel("Password:");
    private JPasswordField jpfPassword = new JPasswordField(15);
    private JTextArea jtaMenu = new JTextArea(10, 50);
    
    //button
    private JButton jbtRegister = new JButton("Register");
    private JButton jbtReset = new JButton("Reset");
     private JButton jbtLogin = new JButton("Login");
    
    //test
    // private JButton jbtTest = new JButton("Count");
    
    //adt list
    private ListInterface<Account> accountList = new LList<>();
    
    public register() {
        
    setTitle("Register Account");
    
    jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    
    //add label and textfield
    JPanel jpInput = new JPanel(new GridLayout(3, 2));
    jpInput.add(jlblName);
    jpInput.add(jtfName);
    jpInput.add(jlblUName);
    jpInput.add(jtfUName);
    jpInput.add(jlblPassword);
    jpInput.add(jpfPassword);

    
    JPanel jpSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    //add button
    jpSouth.add(jbtRegister);
    jpSouth.add(jbtReset);
    jpSouth.add(jbtLogin);
    //jpSouth.add(jbtTest);
    
    add(jpInput, BorderLayout.WEST);
    add(jlblTitle, BorderLayout.NORTH);
    add(jpSouth, BorderLayout.SOUTH);
    
    jbtRegister.addActionListener(new  RegisterListenerClass()); 
    jbtReset.addActionListener(new  ResetListenerClass()); 
   jbtLogin.addActionListener(new  LoginListenerClass()); 
    //jbtTest.addActionListener(new CountListenerClass());
    
    jtaMenu.setLineWrap(true);
    jtaMenu.setWrapStyleWord(true);
    jtaMenu.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(jtaMenu);
    add(scrollPane, BorderLayout.EAST);
    jtfName.grabFocus();
      
  }
      //add menu item
    private class RegisterListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
                
      String name = jtfName.getText();
      String username = jtfUName.getText();
      String password = jpfPassword.getText();      
     
        Account account = new Account(name, username, password);
     
      if(accountList.isEmpty())
      {
       accountList.add(account);
        jtaMenu.setText("Account List: \n" + accountList); 
        jtfName.setText("");
        jtfName.grabFocus();
        jtfUName.setText("");
        jpfPassword.setText("");
      }
      else
      {
          for(int i = 0; i < accountList.getNumberOfEntries() ; i++)
          {
              if(accountList.getEntry(i).getName().equals(name))
              {
                  JOptionPane.showMessageDialog(null, "Error");
              }
              else
              {
                  accountList.add(account);
                  jtaMenu.setText("Account List: \n" + accountList); 
                  jtfName.setText("");
                  jtfName.grabFocus();
                  jtfUName.setText("");
                  jpfPassword.setText("");
                
              }
          }
      }

}} ;

  //reset textfield
private class ResetListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
     jtfName.setText(null);
     jtfUName.setText(null);
     jpfPassword.setText(null);
      jtfName.grabFocus();
}} ;

private class LoginListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
     
       login frame = new login();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
   
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
    register frame = new register();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }

}
