
package gui;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
class MyFrame extends JFrame implements ActionListener { 

    //called the class
    private static golfClub       aa=new golfClub();
    private static driver         bb=new driver();
    private static fairwayWoods   cc=new fairwayWoods();
    private static hybrids        dd=new hybrids();
    
    
    // Components of the Form 
    private Container c; 
    private JLabel title;           //title of the interface
    private JLabel name;            //name
    private JTextField tname; 
    private JLabel age;             //age
    private JComboBox ages; 
    private JLabel gender;          //gender
    private ButtonGroup gengp;
    private JRadioButton male; 
    private JRadioButton female; 
    private JLabel brand;           //brand
    private JComboBox brands;

    
    private JLabel email;           //email
    private JTextField emails;
    private JLabel pword;           //password
    private JPasswordField pwords; 
    private JButton confirm;        //confirm buttton
    
    private JLabel select;          //statement select golfClub    
    private JButton clubs1;         
    private JButton clubs2;
    private JButton clubs3;
    
    private JCheckBox term;         //term & condition
    private JButton sub;            //display sub
    private JButton reset;          //reset button
    private JTextArea tout;         //display the data entered
    private JLabel res;             //text above display box
    private JTextArea resadd; 
    
    //declared age as String
    private String age_[] = {"13", "14", "15", "16", "17", "18",
                            "19", "20", "21", "22", "23", "24",
                             "25", "26", "27", "28", "29", "30",
                            "31", "32", "33", "34", "35", "36" };
    
    //declared  as String
    private String type[] ={"Callaway", "TaylorMade", "Titleist", "Mizuno", "Wilson",
                            "Wilson", "	Ping", "Cleveland Golf", "Cobra Golf" };
    
    public static String golf=new String("Driver");
  
  
    // constructor, to initialize the components 
    // with default values. 
    public MyFrame() 
    { 
        //set the background color
        getContentPane().setBackground(Color.cyan);
        
        
        //set title of the program
        setTitle("Golf Clubs"); 
        setBounds(300, 100, 900, 650); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
        
        //set title in the program
        title = new JLabel("Golf Clubs"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
  
        // attribute regarding name
        name = new JLabel("Name :"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(150, 20); 
        name.setLocation(50, 130); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 17)); 
        tname.setSize(190, 25); 
        tname.setLocation(150, 130); 
        c.add(tname); 
  
        // attribute regarding age
        age = new JLabel("Age :"); 
        age.setFont(new Font("Arial", Font.PLAIN, 20)); 
        age.setSize(100, 25); 
        age.setLocation(50, 170); 
        c.add(age); 
  
        ages = new JComboBox(age_);
        ages.setFont(new Font("Arial", Font.PLAIN, 17)); 
        ages.setSize(75, 25); 
        ages.setLocation(150, 170);  
        c.add(ages); 
        
        // attribute regarding gender
        gender = new JLabel("Gender:"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(50, 220);  
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 17)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(150, 220); 
        male.setBackground(Color.cyan);                 //set the background color
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 17)); 
        female.setSelected(false); 
        female.setSize(100, 20); 
        female.setLocation(250, 220);  
        female.setBackground(Color.cyan);               //set the background color
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
        
        
           
        // attribute regarding brand
        brand= new JLabel("Brand : ");
        brand.setFont(new Font("Arial", Font.PLAIN, 20)); 
        brand.setSize(100, 20); 
        brand.setLocation(50, 270); 
        c.add(brand);
      
        brands= new JComboBox(type);
        brands.setFont(new Font("Arial", Font.PLAIN, 17)); 
        brands.setSize(150, 25); 
        brands.setLocation(150, 270); 
        c.add(brands);

        
  
        //attribute regarding e-mail
        email = new JLabel("E-mail: ");
        email.setFont(new Font("Arial", Font.PLAIN, 20)); 
        email.setSize(100, 20); 
        email.setLocation(50, 320); 
        c.add(email);
      
        emails = new JTextField();
        emails.setFont(new Font("Arial", Font.PLAIN, 17)); 
        emails.setSize(190, 25); 
        emails.setLocation(150, 320); 
        c.add(emails);
      
        // attribute regarding password
        pword = new JLabel("Password: ");
        pword.setFont(new Font("Arial", Font.PLAIN, 20)); 
        pword.setSize(100, 20); 
        pword.setLocation(50, 370); 
        c.add(pword);
        
        pwords = new JPasswordField();   
        pwords.setFont(new Font("Arial", Font.PLAIN, 17)); 
        pwords.setSize(190, 25); 
        pwords.setLocation(150, 370); 
        c.add(pwords);
  
        // terms & condition
        term = new JCheckBox("Accept T&C"); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(200, 20); 
        term.setLocation(170, 410); 
        term.setBackground(Color.cyan);              //set the background color
        c.add(term); 
        
        // confirm?   
        confirm = new JButton("confirm");
        confirm.setFont(new Font("Arial", Font.PLAIN, 17)); 
        confirm.setSize(100, 30); 
        confirm.setLocation(120, 440); 
        confirm.addActionListener(this);
        c.add(confirm);

  
        // reset   
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 17)); 
        reset.setSize(100, 30); 
        reset.setLocation(250, 440); 
        reset.addActionListener(this);
        c.add(reset);
        
        
        // display box
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 17)); 
        tout.setSize(330, 400); 
        tout.setLocation(500, 110); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
        
        // text above the display box
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 14)); 
        res.setSize(500, 30); 
        res.setLocation(500, 75); 
        c.add(res); 
        
        // sub of display
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 17)); 
        resadd.setSize(200, 85); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
        setVisible(true); 
        
        
        // statement to select golfclub
        select = new JLabel("Select one of the golfclubs.");
        select.setFont(new Font("Arial", Font.PLAIN, 17)); 
        select.setSize(400, 20); 
        select.setLocation(150, 170); 
        c.add(select);
        //set the button as unvisible
        select.setVisible(false);
        
        // button 1                                                       
        clubs1 = new JButton("Driver");
        clubs1.setFont(new Font("Arial", Font.PLAIN, 17)); 
        clubs1.setSize(125, 30); 
        clubs1.setLocation(100, 230); 
        clubs1.addActionListener(this);
        c.add(clubs1);
        //set the button as unvisible
        clubs1.setVisible(false);
        
        // button 2
        clubs2= new JButton("Hybrids");
        clubs2.setFont(new Font("Arial", Font.PLAIN, 17)); 
        clubs2.setSize(125, 30); 
        clubs2.setLocation(250, 230); 
        clubs2.addActionListener(this);
        c.add(clubs2);
        //set the button as unvisible
        clubs2.setVisible(false);
        
        // button 3
        clubs3= new JButton("Fairways Woods");
        clubs3.setFont(new Font("Arial", Font.PLAIN, 17)); 
        clubs3.setSize(175, 30); 
        clubs3.setLocation(150, 300);
        clubs3.addActionListener(this); 
        c.add(clubs3); 
        //set the button as unvisible
        clubs3.setVisible(false);
    } 
    
    
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        //declare the string
        String sa="\nThe Components of a golf club :";  
        String sb="\nFunction \t:  ";
        String s1="\nName\t:  "  ;
        String s2="\nMade of\t:  ";                     
        String s3="\nFunction \t:  ";                     
        String s4="\nGolfclubs Loft :  "; 
        String xx="";
        
        //the activities that will perform when confirm button is selected
        if (e.getSource() == confirm) { 
            //checked any unfill textfield 
            if (term.isSelected() && !xx.equals(tname.getText()) && !xx.equals(pwords.getText()) && !xx.equals(emails.getText())) { 
                //selected button visible if condition is fullfill
                select.setVisible(true); 
                clubs1.setVisible(true);
                clubs2.setVisible(true);
                clubs3.setVisible(true);
                
                name.setVisible(false);
                tname.setVisible(false);
                age.setVisible(false);
                ages.setVisible(false);
                male.setVisible(false);
                female.setVisible(false);
                gender.setVisible(false);
                brand.setVisible(false);
                brands.setVisible(false);
                email.setVisible(false);
                emails.setVisible(false);
                pword.setVisible(false);
                pwords.setVisible(false);
                term.setVisible(false);
                confirm.setVisible(false);
                
                //set the rest button at other location
                reset.setLocation(185, 400);
                
                //declare the string
                String data1; 
                String data 
                    = "Name\t : "
                      + tname.getText() + "\n"
                      + "Age\t : "
                      + (String)ages.getSelectedItem() + "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender\t : Male"
                            + "\n"; 
                else
                    data1 = "Gender\t : Female"
                            + "\n"; 
                String data2 
                    = "Email\t : " + emails.getText() + "\n\n";
                String data3
                    = "Brand\t : "+(String)brands.getSelectedItem()+"\n";
                String data4 = "Welcome to the Golf Clubs Info... \n";
                
                //set the display text
                tout.setText(data + data1 +data3+data2+"\n"+sa+"\n\n"+bb.basicPart()); 
                tout.setEditable(false); 
                res.setText("Registration Successfully.."); 
            } //end of terms & conditions..
            
            //checked if the textfield is blank
            else if(xx.equals(tname.getText()) || xx.equals(pwords.getText()) || xx.equals(emails.getText())){
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please fill up the blank");
            }
            
            //checked if the terms & conditions is tick
            else {
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        }
        
        
              
      // Driver button
      if (e.getSource() == clubs1) {
         if (term.isSelected() ) {
            String a = golf;
            
            //declare the material
            bb.madeOf("Wood"); 
            tout.setText(a+"\n"+s1+bb.getName()+"\n"+s2+bb.madeOf()+"\n"+s3+bb.usedFor()+"\n"+s4+bb.clubsLoft()+"\n");
                          
        }
      }
         
      // Hybrids button
      if (e.getSource() == clubs2) {
         if (term.isSelected() ) {
            String a = "Hybrids";
            
            //declare the material
            cc.madeOf("Metal woods");
            tout.setText(a+"\n"+s1+cc.getName()+"\n"+s2+cc.madeOf()+"\n"+s3+cc.usedFor()+"\n"+s4+cc.clubsLoft()+"\n");
                  
         }
      }
         
      // Fairways woods button
      if (e.getSource() == clubs3) {
         if (term.isSelected() ) {
            String a = "Fairways woods";
            tout.setText(a); 
            
            //declare the material 
            dd.madeOf("Wood and an iron");
            tout.setText(a+"\n"+s1+dd.getName()+"\n"+s2+dd.madeOf()+"\n"+s3+dd.usedFor()+"\n"+s4+dd.clubsLoft()+"\n");
         }
      }
        //checked if reset button selected
        else if (e.getSource() == reset) { 
            //reset the actual location
            reset.setLocation(250, 440); 
            
            //set some into visible and som into unvisible
            select.setVisible(false); 
            clubs1.setVisible(false);
            clubs2.setVisible(false);
            clubs3.setVisible(false);
            
                name.setVisible(true);
                tname.setVisible(true);
                age.setVisible(true);
                ages.setVisible(true);
                male.setVisible(true);
                female.setVisible(true);
                gender.setVisible(true);
                brand.setVisible(true);
                brands.setVisible(true);
                email.setVisible(true);
                emails.setVisible(true);
                pword.setVisible(true);
                pwords.setVisible(true);
                term.setVisible(true);
                confirm.setVisible(true);
            
            //declare all back to null
            String def = ""; 
            tname.setText(def); 
            ages.setSelectedIndex(0);  
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            resadd.setText(def); 
            
            pwords.setText(def);
            emails.setText(def);
        } 
    } 
} 
  
// Driver Code 
class GUI extends golfClub{ 
  
    public static void main(String[] args) throws Exception 

    { 
        //called MyFrame class
        MyFrame f = new MyFrame(); 
        
    
         
    } 
} //end class