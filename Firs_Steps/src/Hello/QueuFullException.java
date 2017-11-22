package Hello;

public class QueuFullException extends Exception{
	int size;
		
	QueuFullException(int s) { size = s; }
		
	public String toString() {
		return " - ERROR. Queue is full. Maximum size is " + size;
		
	}
}
