package conko;

import java.util.Scanner;

public class input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();
      
        //Does this line contain "BlueBumper"?
        sc.findInLine("BlueBumper");
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        System.out.println("X: "  + x      +", Y: "   + y     );
        sc.close();
    }    
}
