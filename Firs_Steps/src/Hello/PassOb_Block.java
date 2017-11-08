package Hello;

class Block {
	int a, b, c;
	int volume;
	Block(int i, int j, int k){
			a = i;
			b = j;
			c = k;
			volume = a * b * c;
	}
	
	//return true id ob define same block
	boolean sameBlock(Block ob) {
		if (ob.a == a & ob.b == b & ob.c == c) return true;
		else return false;
		}
	
	boolean sameVolume (Block ob) {
		if (ob.volume == volume) return true;
		return false;
	}
}

public class PassOb_Block {
	public static void main (String[] args) {
		Block ob1 = new Block(10, 25, 5);
		Block ob2 = new Block(10, 25, 5);
		Block ob3 = new Block(5, 7, 12);
		
		System.out.println("ob1 sameBlock with ob2 is: " + ob1.sameBlock(ob2));
		System.out.println("ob1 sameBlock with ob3 is: " + ob1.sameBlock(ob3));
		System.out.println("ob2 sameBlock with ob3 is: " + ob2.sameBlock(ob3));
		System.out.println("ob1 sameVolume with ob2 is: " + ob1.sameVolume(ob2));

	}
}
