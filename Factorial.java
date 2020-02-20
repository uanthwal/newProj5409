import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Factorial {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		File file = new File("input.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	int i, fact = 1;
				int number = Integer.parseInt(line);
				for (i = 1; i <= number; i++) {
					fact = fact * i;
				}
				System.out.println("Factorial of " + number + " is: " + fact);
		    }
		}
		
	}
}
