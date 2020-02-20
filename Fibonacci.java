import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Fibonacci {
	public static void main(String args[]) throws NumberFormatException, IOException {

		File file = new File("input.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				int n1 = 0, n2 = 1, n3, i, count = Integer.parseInt(line);
				System.out.println();
				System.out.print(n1 + " " + n2);// printing 0 and 1
				for (i = 2; i < count; ++i)
				{
					n3 = n1 + n2;
					System.out.print(" " + n3);
					n1 = n2;
					n2 = n3;
				}

			}
		}

	}
}
