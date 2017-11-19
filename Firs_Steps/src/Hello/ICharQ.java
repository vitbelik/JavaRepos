package Hello;

public interface ICharQ {
	void put(char ch) throws QueuFullException; // put a character into the queue
	
	char get() throws QueuEmptyException; // get character from the queue
	
	/*void reset();*/
}
