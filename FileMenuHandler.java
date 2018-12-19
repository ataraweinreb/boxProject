import javax.swing.*;
import java.util.TreeMap;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FileMenuHandler implements ActionListener {
	JFrame jf;
	
	public FileMenuHandler(JFrame j) {
		jf=j;
	}
	
	public void actionPerformed(ActionEvent event) {
		String menuName;
		menuName=event.getActionCommand();
		if (menuName.equals("Search")){
			int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length:"));
			int w = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the width:"));
			int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height:"));
			Box match = new Box(l,w,h); //create a box to look for a match which is bigger
			searchBoxes(match);
		} else if (menuName.equals("Quit")) {
			System.exit(0);  //quit the program
		}
	}//actionPerformed

	void searchBoxes(Box match) {
		TreeMap sbl = new TreeMap(); //gets sorted box list from the gui
//		sbl.putAll(treemap);
		TreeMap boxesThatFit = new TreeMap();
		Iterator itr;
		Set set=sbl.entrySet();
		itr=set.iterator();
		Map.Entry<Box, Integer> me;
		while(itr.hasNext()) {
			me=(Map.Entry)itr.next();
			if(me.getKey().boxCompare(match)>0) { //if the box is bigger or equal to match box
				boxesThatFit.put(me.getKey(), me.getValue()); //add it to the boxes that fit list
			}
		}
		new ResultsGUI(boxesThatFit);
	}
}


