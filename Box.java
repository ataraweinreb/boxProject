/**
 * 
 * @author Tara Weinreb
 *
 * Box class
 */
public class Box {
	//instance variables
	private int length; 
	private int width;
	private int height;

	public Box() {// default constructor
		length = 1;
		width = 1;
		height = 1;

	}

	public Box(int l, int w, int h) { //constructor w 3 parameters
		if(l < 1||w < 1||h < 1) throw new IllegalBoxException("Values less than 1 not allowed");
		length = l;
		width = w;
		height = h;
	}
	
	//set methods
	public void setLength(int l) { 
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		length = l;
	}

	public void setWidth(int l) {
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		width = l;
	}

	public void setHeight(int l) {
		if(l<1) throw new IllegalArgumentException("Values less than 1 not allowed");
		height = l;
	}
	//get methods
	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	//method to calculate the volume
	public int volume() {
		int volume = length * width * height;
		return volume;
	}
	//override the equals method
	public boolean equals(Box a) {
		if (this.length == a.length && this.width == a.width && this.height == a.height)
			return true;
		return false;
	}
	//compareTo to see which box has a greater volume
	public int compareTo(Box this, Box other) {
		if (this.volume() > other.volume()) {
			return 1;
		}
		else if (this.volume() < other.volume()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public int boxCompare(Box match) {
		if(this.length >= match.length && this.width  >= match.width && this.height >= match.height)
			return 1;
		else
			return -1;
	}
	//override the tostring method
	public String toString() {
	String s= "L:"+length+" W:"+width+" H:"+height+" (V:"+volume()+")"+"\n";
	return s;
	}
}
