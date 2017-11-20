package agile2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import entity.Menu;

/**
 *
 * @author HP
 */

public class addMenu extends JFrame {

    String[] status = { "Available", "Not Available"};
    
   //label and textfield
    private JLabel jlblTitle = new JLabel("MENU ITEM");
    private JLabel jlblName = new JLabel("Item Name: ");
    private JTextField jtfName = new JTextField(15);
    private JLabel jlblNumber = new JLabel("Next number: ");
    private JTextField jtfNumber = new JTextField();
    private JLabel jlblPrice = new JLabel("Price (RM)");
    private JTextField jtfPrice = new JTextField(15);
    private JLabel jlblDesc = new JLabel("Description");
    private JTextField jtfDesc = new JTextField(15);
    private JLabel jlblStatus = new JLabel("Status");
    private JComboBox jcbStatus = new JComboBox(status); 
    private JLabel jlblPromo = new JLabel("Promotional Information");
    private JTextField jtfPromo = new JTextField(15);
    private JTextArea jtaMenu = new JTextArea(10, 50);
   
    //button
    private JButton jbtAdd = new JButton("Add");
    private JButton jbtReset = new JButton("Reset");
    
    //adt list
    private ListInterface<Menu> menuList = new LList<>();
    
    public addMenu() {
        
    setTitle("Menu Item");
    
    jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    
    //add label and textfield
    JPanel jpInput = new JPanel(new GridLayout(6, 2));
    jtfNumber.setText("" + Menu.getNextNumber());
    jtfNumber.setEditable(false);
    jpInput.add(jlblNumber);
    jpInput.add(jtfNumber);
    jpInput.add(jlblName);
    jpInput.add(jtfName);
    jpInput.add(jlblPrice);
    jpInput.add(jtfPrice);
    jpInput.add(jlblDesc);
    jpInput.add(jtfDesc);
    jpInput.add(jlblStatus);
    jpInput.add(jcbStatus);
    jpInput.add(jlblPromo);
    jpInput.add(jtfPromo);
    
    JPanel jpSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    //add button
    jpSouth.add(jbtAdd);
    jpSouth.add(jbtReset);
    
    add(jpInput, BorderLayout.WEST);
    add(jlblTitle, BorderLayout.NORTH);
    add(jpSouth, BorderLayout.SOUTH);
    
    jbtAdd.addActionListener(new  AddListenerClass()); 
    jbtReset.addActionListener(new  ResetListenerClass()); 
    
    jtaMenu.setLineWrap(true);
    jtaMenu.setWrapStyleWord(true);
    jtaMenu.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(jtaMenu);
    add(scrollPane, BorderLayout.EAST);
    jtfName.grabFocus();
      
  }
      //add menu item
    private class AddListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
                
      String name = jtfName.getText();
      String price = jtfPrice.getText();
      String description = jtfDesc.getText();
      String status = jcbStatus.getSelectedItem().toString();
      String promo = jtfPromo.getText();
      Menu menu = new Menu(name, price, description, status, promo);
      menuList.add(menu);
      jtfNumber.setText("" + Menu.getNextNumber());
      jtaMenu.setText("Menu Item: \n" + menuList);
      
      //jtaMenu.setText(String.format("No. %-10d %-20s %-20s %-20s %-20s %-20s","No", "Item Name","Price","Description","Status","Promotional Information") + menuList);
      jtfName.setText("");
      jtfName.grabFocus();
      jtfPrice.setText("");
      jtfDesc.setText("");
      jtfPromo.setText("");
      jcbStatus.setSelectedIndex(0);

}} ;

  //reset textfield
private class ResetListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
     jtfName.setText(null);
     jtfPrice.setText(null);
     jtfDesc.setText(null);
     jtfPromo.setText(null);
      jtfName.grabFocus();
}} ;

     
    public static void main(String[] args) {
    addMenu frame = new addMenu();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }

}
