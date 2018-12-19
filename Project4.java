/**
 * 
 * @author Tara Weinreb
 *
 */
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Integer;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Project4 {
	  public static void main(String[] args) {
	     int[][] BoxInfo = fillArray("boxes.txt");
	     HashMap<Box,Integer> hashmap=new HashMap<Box,Integer>(); //declare your hashmap
	     TreeMap<Box,Integer> treemap=new TreeMap(new BoxComparator()); //declare your treemap
	     Integer count=0;
	     for(int i=0; i < BoxInfo.length; i++) {
	    	 try {
	    		 count++;
	    		 Box b = new Box(BoxInfo[i][0], BoxInfo[i][1], BoxInfo[i][2]); //creates the box
	    		 hashmap.put(b,count);
	    		 treemap.put(b,count);
	    	 }
	    	 catch(IllegalBoxException e) {
	    		 System.out.println(e.getMessage());
	    	 }
	     }
	     BoxGUI b = new BoxGUI(hashmap,treemap);
	  }
	     
	   public static int[][] fillArray(String myFile) {
	        TextFileInput input = new TextFileInput(myFile);
	        
	        // reads the first line of the input file, 
	        String line = input.readLine();
	        // tokenizes it to get the number of rows and columns,
	        StringTokenizer myTokens = new StringTokenizer(line,",");    
	        int row =  Integer.parseInt(myTokens.nextToken());
	        int col =  Integer.parseInt(myTokens.nextToken());
	       
	        System.out.println("The dimension of the array is: " + row + ' ' + col);
	        // creates a two-dimension array of integers of the proper dimensions
	        int[][] integers = new int[row][col];
	        // reads the rest of the file, 
	        // tokenizing each line and storing the number in the array
	        for (int i = 0; i < row; i++) {
	           StringTokenizer rowToken = new StringTokenizer(input.readLine(),",");
	           int j = 0;
	           while (rowToken.hasMoreTokens()) {
	              integers[i][j]= Integer.parseInt(rowToken.nextToken());
	              j++;
	           }

	       }
	       return integers;   
	     }

}
