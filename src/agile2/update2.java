package agile_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import entity.MenuItem;

/**
 *
 * @author HP
 */

public class update2 extends JFrame {

    String[] status = { "Available", "Not Available"};
    
   //label and textfield
   private JLabel jlblTitle = new JLabel("UPDATE MENU ITEM");
    private JLabel jlblName = new JLabel("Item Name: ");
    private JTextField jtfName = new JTextField(15);
    private JLabel jlblNumber = new JLabel("Number: ");
    private JTextField jtfNumber = new JTextField();
    private JLabel jlblPrice = new JLabel("Price (RM):");
    private JTextField jtfPrice = new JTextField(15);
    private JLabel jlblStatus = new JLabel("Status:");
    private JComboBox jcbStatus = new JComboBox(status); 
     private JTextArea jtaMenu = new JTextArea(10, 30);
   
    //button
    private JButton jbtRetrieve = new JButton("Retrieve");
    private JButton jbtUpdate = new JButton("Update");
    private JButton jbtReset = new JButton("Reset");
    
    //adt list
    private ListInterface<MenuItem> menuList = new LList<>();
    
     public update2() {
     MenuItem menu = new MenuItem(1, "fried chicken", "10.00", "Available");
     MenuItem menu2 = new MenuItem(2, "curry noodle", "15.00", "Not Available");
     menuList.add(menu);
     menuList.add(menu2);
     jtaMenu.setText("Menu Item: \n" + menuList);
     setTitle("Menu Item");
    
    jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    
    //add label and textfield
    JPanel jpInput = new JPanel(new GridLayout(6, 2));
    jpInput.add(jlblNumber);
    jpInput.add(jtfNumber);
    jpInput.add(jlblName);
    jpInput.add(jtfName);
    jpInput.add(jlblPrice);
    jpInput.add(jtfPrice);
    jpInput.add(jlblStatus);
    jpInput.add(jcbStatus);
    
    
    JPanel jpSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    //add button
    jpSouth.add(jbtRetrieve);
    jpSouth.add(jbtUpdate);
    jpSouth.add(jbtReset);
    
    add(jpInput, BorderLayout.WEST);
    add(jlblTitle, BorderLayout.NORTH);
    add(jpSouth, BorderLayout.SOUTH);
    
    jbtUpdate.addActionListener(new  UpdateListenerClass()); 
    jbtReset.addActionListener(new  ResetListenerClass()); 
    jbtRetrieve.addActionListener(new  RetrieveListenerClass()); 
    
    jtaMenu.setLineWrap(true);
    jtaMenu.setWrapStyleWord(true);
    jtaMenu.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(jtaMenu);
    add(scrollPane, BorderLayout.EAST);
    jtfName.grabFocus();
      
  }
     //add menu item
    private class RetrieveListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 

      
     if(jtfNumber.getText().equals("1")) 
     {
     jtfNumber.setEditable(false);
      jtfName.setText(menuList.getEntry(1).getName());
      jtfPrice.setText(menuList.getEntry(1).getPrice());
      jcbStatus.setSelectedItem(menuList.getEntry(1).getStatus());
     }
     else if(jtfNumber.getText().equals("2"))
     {
          jtfNumber.setEditable(false);
      jtfName.setText(menuList.getEntry(2).getName());
      jtfPrice.setText(menuList.getEntry(2).getPrice());
         jcbStatus.setSelectedItem(menuList.getEntry(2).getStatus());
     }
     else{
     JOptionPane.showMessageDialog(null, "Invalid Item ID!");
     jtfNumber.setText(null);
     jtfName.setText(null);
     jtfPrice.setText(null);
     jcbStatus.setSelectedIndex(0);
      jtfNumber.grabFocus();
     }       
    

}} ;

      //add menu item
    private class UpdateListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
        jtfNumber.setEditable(true);
      if(jtfNumber.getText().equals("1")||jtfNumber.getText().equals("2")){
      String number = jtfNumber.getText();
      String name = jtfName.getText();
      String price = jtfPrice.getText();
      String status = jcbStatus.getSelectedItem().toString();
      int num = Integer.parseInt(number);
      MenuItem menu = new MenuItem(num,name, price, status);
      menuList.replace(num, menu);
      jtaMenu.setText("Menu Item: \n" + menuList);
      
jtfNumber.setText("");     
jtfName.setText("");
      jtfNumber.grabFocus();
      jtfPrice.setText("");
      jcbStatus.setSelectedIndex(0);}
      else
      {
           JOptionPane.showMessageDialog(null, "Invalid Item ID!");
     jtfNumber.setText(null);
     jtfName.setText(null);
     jtfPrice.setText(null);
     jcbStatus.setSelectedIndex(0);
      jtfNumber.grabFocus();
      }

}} ;

  //reset textfield
private class ResetListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
     jtfNumber.setText(null);
     jtfNumber.setEditable(true);
        jtfName.setText(null);
     jtfPrice.setText(null);
     jcbStatus.setSelectedIndex(0);
      jtfNumber.grabFocus();
}} ;

     
    public static void main(String[] args) {
    update2 frame = new update2();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }

}
