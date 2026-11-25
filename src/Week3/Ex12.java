package Week3;

public class Ex12 {
	    public static int getPentagonalNumber(int n) {
	        return n * (3 * n - 1) / 2;
	    }

	    public static void main(String[] args) {

	        for (int i = 1; i <= 100; i++) {
	            System.out.printf("%-8d", getPentagonalNumber(i));

	            // Print 10 numbers per line
	            if (i % 10 == 0) {
	                System.out.println();
	            }
	        }
	    }
}
