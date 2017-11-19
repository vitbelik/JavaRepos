package Hello;

class FixedQueu implements ICharQ {
	private char q[];
	private int putlock, getlock;
	
	public FixedQueu(int size) {
		q = new char[size];
		putlock = getlock = 0;
	}
	
	public void put(char ch)
	throws QueuFullException {
		if (putlock == q.length)
			throw new QueuFullException(q.length);
			
		q[putlock++] = ch;
	}
	
	public char get() 
	throws QueuEmptyException {
		
		if (getlock == putlock)
			throw new QueuEmptyException();
		
		return q[getlock++];
	}
}