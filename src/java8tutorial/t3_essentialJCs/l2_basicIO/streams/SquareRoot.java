package java8tutorial.t3_essentialJCs.l2_basicIO.streams;

public class SquareRoot {
	
	public static void usingPrint() {
		int i = 2;
        double r = Math.sqrt(i);
        
        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println(".");
	}
	
	public static void usingPrintLn() {
        int i = 2;
        double r = Math.sqrt(i);
        
        System.out.println("The square root of " + i + " is " + r + ".");
	}
	
	/*
	 * d formats an integer value as a decimal value.
	 * f formats a floating point value as a decimal value.
	 * n outputs a platform-specific line terminator.
	 * x formats an integer as a hexadecimal value.
	 * s formats any value as a string.
	 * tB formats an integer as a locale-specific month name.
	 */
	public static void usingFormat() {
		int i = 2;
        double r = Math.sqrt(i);
        
        System.out.format("The square root of %d is %f.%n", i, r);
	}
	
	
	public static void main(String[] args) {
        usingPrint();
        usingPrintLn();
        usingFormat();
    }
}
