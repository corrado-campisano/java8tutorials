package java8tutorial.t3_essentialJCs.l2_basicIO.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * CopyBytes seems like a normal program, but it actually represents a kind of low-level I/O that you should avoid. 
 * Since xanadu.txt contains character data, the best approach is to use character streams, as discussed in the next section. 
 * There are also streams for more complicated data types. 
 * Byte streams should only be used for the most primitive I/O. 
 */

public class CopyBytes {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("outagain.txt");
			int c; // shouldn't it be a byte?

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}