package chapter12.C1211;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
	private static String replace;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/chapter12/Exercise11/text.txt");
		try (Scanner input = new Scanner(file); PrintWriter output = new PrintWriter(file)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				if (line.matches("*" + args[0] + "*")) {
					replace = line.replaceAll(args[0], "");
				}

			}
		}
	}

}
