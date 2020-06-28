
package assignment3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Assignment3 {

   
public static void main(String[] args)throws Exception  {
// Call method which helps to generate the table
generateJTable();
}


//This method helps to generate Table with buttons like Add, Update, Delete

public static void generateJTable() {

// create JFrame and JTable
JFrame frame = new JFrame();
final JTable table = new JTable();

// create a table model and set a Column Identifiers to this model
Object[] columns = { "GolfClubs Type", "Made of", "Function", "GolfClub Loft" };

final DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columns);

final TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
    table.setRowSorter(sorter);

//create a data of arraylist for the table
ArrayList<info> list = new ArrayList<info>();

list.add(new info("driver", "stell", "Hit ball furthest" , "7 to 11 degrees"));
list.add(new info("hybrid", "iron and wood", "airborne shots easily" , "14 to 28 degrees"));
list.add(new info("fairwayWoods", "metal and wood", "For need more control" , "12 to 20 degrees"));
list.add(new info("iron", "iron", "mid-range shots" , "28 to 34 degrees"));
list.add(new info("wedges", "iron", "bounce off the ground" , "46 to 64 degrees"));

for (int i = 0; i < list.size(); i++){
   String GClubs = list.get(i).getGClubs();
   String Mof = list.get(i).getMof();
   String Function = list.get(i).getFunction();
   String GLoft = list.get(i).getGLoft();

Object[] data = {GClubs , Mof , Function , GLoft};

model.addRow(data);

}
    
// set the model to the table
table.setModel(model);

// Change A JTable Background Color, Font Size, Font Color, Row Height
table.setBackground(Color.green.brighter());
table.setForeground(Color.black);
Font font = new Font("", 1, 18);
table.setFont(font);
table.setRowHeight(30);

// create JTextFields to hold the value
final JTextField textGolfClubs = new JTextField();
final JTextField textMof = new JTextField();
final JTextField textFunction = new JTextField();
final JTextField textGLoft = new JTextField();

// create JtextField to hold search 
final JTextField Jsearch = new JTextField();
final JLabel Lsearch =new JLabel("Search/Filter");
Jsearch.setBounds(500, 220, 100, 25);
Lsearch.setBounds(400, 220, 100, 25);

// create JLabel to hold the label
final JLabel LGolfClubs = new JLabel("GolfClubs Type :"); 
final JLabel LMof = new JLabel("Made of :"); 
final JLabel LFunction = new JLabel("Function :"); 
final JLabel LGLoft = new JLabel("GolfClub Loft :"); 

// create JButtons to add the action
JButton btnAdd = new JButton("Add");
JButton btnDelete = new JButton("Delete");
JButton btnUpdate = new JButton("Update");

textGolfClubs.setBounds(125, 220, 100, 25);
textMof.setBounds(125, 250, 100, 25);
textFunction.setBounds(125, 280, 100, 25);
textGLoft.setBounds(125, 310, 100, 25);

LGolfClubs.setBounds(20, 220, 100, 25);
LMof.setBounds(20, 250, 100, 25);
LFunction.setBounds(20, 280, 100, 25);       
LGLoft.setBounds(20, 310, 100, 25);        

btnAdd.setBounds(250, 220, 100, 25);
btnUpdate.setBounds(250, 265, 100, 25);
btnDelete.setBounds(250, 310, 100, 25);

// create JScrollPane
JScrollPane pane = new JScrollPane(table);
pane.setBounds(0, 0, 880, 200);

frame.setLayout(null);

frame.add(pane);
// add JPanel and JField for search
frame.add(Jsearch);
frame.add(Lsearch);

// add JTextFields to the jframe
frame.add(textGolfClubs);
frame.add(textMof);
frame.add(textFunction);
frame.add(textGLoft);

// add JPanel to the jframe
frame.add(LGolfClubs);
frame.add(LMof);
frame.add(LFunction);
frame.add(LGLoft);

// add JButtons to the jframe
frame.add(btnAdd);
frame.add(btnDelete);
frame.add(btnUpdate);

// create an array of objects to set the row data
final Object[] row = new Object[4];

// button add row - Clicked on Add Button
btnAdd.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {

row[0] = textGolfClubs.getText();
row[1] = textMof.getText();
row[2] = textFunction.getText();
row[3] = textGLoft.getText();

// add row to the model
model.addRow(row);
}
});

// button remove row - Clicked on Delete Button
btnDelete.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {

// i = the index of the selected row
int i = table.getSelectedRow();
if (i >= 0) {
// remove a row from jtable
model.removeRow(i);
} 
else {
System.out.println("There were issue while Deleting the Row(s).");
}
}
});

// get selected row data From table to textfields
table.addMouseListener(new MouseAdapter() {

@Override
public void mouseClicked(MouseEvent e) {

// i = the index of the selected row
int i = table.getSelectedRow();

textGolfClubs.setText(model.getValueAt(i, 0).toString());
textMof.setText(model.getValueAt(i, 1).toString());
textFunction.setText(model.getValueAt(i, 2).toString());
textGLoft.setText(model.getValueAt(i, 3).toString());
}
});

// button update row - Clicked on Update Button
btnUpdate.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {

// i = the index of the selected row
int i = table.getSelectedRow();

if (i >= 0) {
model.setValueAt(textGolfClubs.getText(), i, 0);
model.setValueAt(textMof.getText(), i, 1);
model.setValueAt(textFunction.getText(), i, 2);
model.setValueAt(textGLoft.getText(), i, 3);
} else {
System.out.println("Update Error");
}
}
});


// search textfield - type search text
Jsearch.getDocument().addDocumentListener(new DocumentListener(){

@Override
public void insertUpdate(DocumentEvent e) {
String text = Jsearch.getText();

if (text.trim().length() == 0) {
sorter.setRowFilter(null);
} else {
sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
}
}

@Override
public void removeUpdate(DocumentEvent e) {
String text = Jsearch.getText();

if (text.trim().length() == 0) {
sorter.setRowFilter(null);
} else {
sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
}
}

@Override
public void changedUpdate(DocumentEvent de) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
});





frame.setSize(900, 400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
 
}
    
}
