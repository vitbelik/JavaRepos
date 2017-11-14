package Trainin_with_book;

class ErrorMsg {
	final int OUTER 	= 0;
	final int INNER 	= 1;
	final int DISKKER 	= 2;
	final int INDEXERR 	= 3;
	
	String msg[] = {
			"Output Error",
			"Input Error",
			"Disk full",
			"Index out-of-bounds"
	};
	
	String getErrorMsg(int i) {
		if (i >= 0 & i < msg.length) 
			return msg[i];
		else
			return "Invalid Error Code";
	}
	
}

public class finalD {
	public static void main (String args[]) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(ErrorMsg.DISKKER));
		System.out.println(err.getErrorMsg(err.INNER));
		System.out.println(err.getErrorMsg(err.INDEXERR));
		System.out.println(err.getErrorMsg(err.OUTER));
		System.out.println(err.getErrorMsg(5));
	}
}
