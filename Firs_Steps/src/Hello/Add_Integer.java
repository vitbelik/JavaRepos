package Hello;

class add_val{
	int[] where;
	add_val(int[] k){
		where = k;
	}
}

class add{
	int val;
	add_val add_info(int val){
	}
}

public class Add_Integer{
	public static void main (String args[]) {
		add pi = new add();
		int di = 20;
		add_val a;
		
		a = pi.add_info(di);
		System.out.print(a);
	}
}