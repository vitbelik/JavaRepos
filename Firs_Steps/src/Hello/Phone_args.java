package Hello;

public class Phone_args {
	public static void main (String args[]) {
		String numbers [] [] = {
				{"Tom",      "555-35268"},
				{"Marry",    "666-12548"},
				{"John",     "236-64542"},
				{"Raichal",  "205-61089"}
		};
		
		int i;
		
		if (args.length != 1)
			System.out.print("Ussage: java Phone <name>");
		else {
			for (i = 0; i<numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + 
									   numbers[i][1]);
					break;
				}
			}
			if (i == numbers.length)
				System.out.println("Name not found!");
		}
	}
}
