package Week3;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int heads = 0;
	int tails = 0;
	
	for(int i =0 ; i < 2000000; i++) {
		double coin = Math.random();
		if(coin < 0.5) {
			heads++;
		}else{
			tails++;
		}
	}
	System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
    System.out.println("Total flips: " + (heads + tails));
	sc.close();
	}
}
