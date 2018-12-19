//creates an IllegalBoxException by extending an existing exception

public class IllegalBoxException extends IllegalArgumentException {
	//constructor
	public IllegalBoxException(String message) {
		super(message);
	}
}
