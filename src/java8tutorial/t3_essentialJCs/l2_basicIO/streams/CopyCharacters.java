package java8tutorial.t3_essentialJCs.l2_basicIO.streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * CopyCharacters is very similar to CopyBytes. 
 * The most important difference is that CopyCharacters uses FileReader and FileWriter for input and output in place 
 * of FileInputStream and FileOutputStream. 
 * Notice that both CopyBytes and CopyCharacters use an int variable to read to and write from. 
 * However, in CopyCharacters, the int variable holds a character value in its last 16 bits; 
 * in CopyBytes, the int variable holds a byte value in its last 8 bits.
 */


public class CopyCharacters {
	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("xanadu.txt");
			outputStream = new FileWriter("characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
