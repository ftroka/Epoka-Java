package Week3;
import java.util.Scanner;
public class Ex16 {
	    // Returns the index of the first occurrence of key, or -1 if not found
	    public static int indexOf(int[] array, int key) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == key) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] numbers = new int[10];

	        System.out.print("Enter nrs: ");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextInt();
	        }

	        System.out.print("Enter the key: ");
	        int key = input.nextInt();

	        int index = indexOf(numbers, key);

	        if (index == -1) {
	            System.out.println(key + " is not in the array");
	        } else {
	            System.out.println(key + " is found at index " + index);
	        }

	        input.close();
	    }
	}
