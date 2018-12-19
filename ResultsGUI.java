import java.awt.TextArea;
import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.JFrame;

public class ResultsGUI extends JFrame {
	public ResultsGUI(TreeMap boxesThatFit)
	{
		setTitle("Project 3");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().add(new TextArea(boxesThatFit.toString()));
		setVisible(true);
	}
}
