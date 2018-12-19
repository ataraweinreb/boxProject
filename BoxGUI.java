/**
 * 
 * @author Tara Weinreb
 * GUI - creates the pop up window which displays our sorted and unsorted lists in two columns
 */
import java.util.Iterator;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BoxGUI extends JFrame{  //Box gui inherits jframes properties
	private TextArea unsorted, sorted;//TextArea class is in javax.swing
    Container container;
    //public static TreeMap sortedList;
	public BoxGUI(HashMap hashmap,TreeMap treemap) {
		//sortedList = sbl;
		setTitle("My GUI");
		setSize(400,400);
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press the x on the gui it automatically terminates the program, without this the program will keep running
		setLocationRelativeTo(null);//this jframe doesnt have a parent, this is setting its location to the whole window
		setLayout(new GridLayout(1, 2)); //makes the 2 cols and 1 row
		container = this.getContentPane();
		unsorted = new TextArea();
		sorted = new TextArea();
		container.add(unsorted);
		container.add(sorted);
		unsorted.setText(hashmap.keySet().toString());
		sorted.setText(treemap.keySet().toString());
		setVisible(true);
	}
	private void createMenu() { //method to create the menu bar
		JMenuItem item; //declares new menu item
		JMenuBar menu = new JMenuBar(); //instantiates the menu bar
		JMenu	tool = new JMenu("Tools"); //creates the tool menu
		FileMenuHandler fmh  = new FileMenuHandler(this);

	      item = new JMenuItem("Search"); //creates search option in the tool menu 
	      item.addActionListener( fmh );
	      tool.add( item );
	      
	      tool.addSeparator();           //add a horizontal separator line
	      
	      item = new JMenuItem("Quit");       //Quit
	      item.addActionListener( fmh );
	      tool.add( item );

	      setJMenuBar(menu); //puts the menu bar in the JFrame
	      menu.add(tool); //puts the tool menu in the menu bar
	}
}


