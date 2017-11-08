package Hello;

public class x_times_n {
	public static void main (String args[]) {
		int x, n;
		long res = 1;
		x = 4;
		
		for (n = 22; n > 0; n--) {
			res *= x;
		}System.out.println(res);
	}
}
