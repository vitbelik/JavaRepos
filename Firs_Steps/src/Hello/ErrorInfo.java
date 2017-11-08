package Hello;

class Err {
	int severity;
	String error_msg;
	
	Err(String e, int s){
		error_msg = e;
		severity = s;
	}
}
	
class ErrInfo{
	String[] error_list = {"Input Error",
			"Output Error",
			"System Error",
			"Disk Error"
			};
	int[] drowback = {3, 3, 1, 5};


	Err getErrorInfo(int i) {
		if (i != 0 & i < error_list.length) 
			return new Err(error_list[i], drowback[i]);
		else 
			return new Err("Invalid Range Code", 0);
	}
}	


public class ErrorInfo {
	public static void main (String[] args) {
		ErrInfo err = new ErrInfo();
		Err e;
	
		e = err.getErrorInfo(3);
		System.out.print(e.error_msg + " severity: " + e.severity);
		
	}
}
