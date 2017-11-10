package Hello;

public class showBitsDemo {
	public static void main (String args[]) {
		//ShowBits b = new ShowBits(8);
		//ShowBits l = new ShowBits(32);
		//ShowBits o = new ShowBits(64);
		
		
		
		class ShowBits {
			int numbits;
			
			ShowBits(int n){
				numbits = n;
			}
			
			void show(long val) {
				long mask = 1;
				mask <<= numbits-1;
				//System.out.println("^^^^^^: " + mask);
				int spacer = 0;
				for (; mask != 0; mask >>>= 1) {
					if ((val & mask) != 0) System.out.print("1");
					else System.out.print("0");
					spacer ++;
					if ((spacer % 8) == 0) {
						System.out.print(" ");
						spacer = 0;
					}
				}
				System.out.println();
			}
		}
		
		for (byte b = 0; b < 10; b++) {
			ShowBits op = new ShowBits(8);
		
		
		System.out.print(b + " in bynary: ");
		op.show(b);
		}
		
		//System.out.print("\n87987 in bynary: ");
		//l.show(87987);
		//System.out.print("\n237658768 in bynary: ");
		//o.show(237658768);
	}
}

