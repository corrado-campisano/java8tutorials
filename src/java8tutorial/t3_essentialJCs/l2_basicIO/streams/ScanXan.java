package java8tutorial.t3_essentialJCs.l2_basicIO.streams;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
	
	public static void main(String[] args) throws IOException {

		Scanner s = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
			
			// To use a different token separator, invoke useDelimiter(), specifying a regular expression. 
			// For example, suppose you wanted the token separator to be a comma, optionally followed by white space. You would invoke,
			s.useDelimiter(",\\s*");
			
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
