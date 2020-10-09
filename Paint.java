package conko;
import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert height:");
        double height = sc.nextDouble();
        System.out.println("Insert length:");
        double length = sc.nextDouble();
        System.out.println("Insert width:");
        double width = sc.nextDouble();
        
        int area = (int) Math.ceil(length*width + 2*height*(length+width));
        int fiveLittersPrice = 15, oneLitterPrice = 4;
        int fiveLittersAreaCover = 140, oneLitterAreaCover = 30;
        int fiveLittersBuckets = 0, oneLitterBuckets = 0;
        
        fiveLittersBuckets += area / fiveLittersAreaCover;
        int areaLeft = area % fiveLittersAreaCover;
        oneLitterBuckets = areaLeft / 30 + (( areaLeft % 30 != 0) ? 1 : 0);
        
        if(oneLitterBuckets * oneLitterPrice > fiveLittersPrice) {
        	oneLitterBuckets = 0;
        	fiveLittersBuckets++;
        }
        
        System.out.println("You need " + fiveLittersBuckets + " five-litters buckets and " + oneLitterBuckets + " one-litters buckets");

	}

}
