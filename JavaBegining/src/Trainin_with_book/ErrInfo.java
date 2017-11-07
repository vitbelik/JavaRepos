package Trainin_with_book;

class Err {
	int severity;
	String msg;
	
	Err(String m, int s){
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String msgs[] = {
			"Output Error",
			"Input Error",
			"Disk Full",
			"index out-of-bound",
	};
	int howboard[] = { 3, 3, 2, 5};
	
	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length) 
			return new Err (msgs[i], howboard[i] );
		else
			return new Err ("Invalid Error Code", 0);
		
	}
	
}

public class ErrInfo {
	public static void main (String args[]) {
		ErrorInfo err = new ErrorInfo();
		Err e;
		
		e = err.getErrorInfo(3);
		System.out.println(e.msg + " severity: " + e.severity);
		
		e = err.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}
