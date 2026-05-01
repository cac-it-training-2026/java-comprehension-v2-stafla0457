package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {
		String inputString = reader.readLine();
		return inputString;
	}

	public int inputNumber() throws IOException {
		String inputNumberString = reader.readLine();
		int inputNumber = Integer.parseInt(inputNumberString);
		return inputNumber;
	}

}
//