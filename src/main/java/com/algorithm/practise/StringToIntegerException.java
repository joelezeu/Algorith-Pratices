
package algostuff;

import java.util.Scanner;

public class StringToIntegerException {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int n = Integer.parseInt(S);
            System.out.println(n);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
            
        }        
    }   
}
