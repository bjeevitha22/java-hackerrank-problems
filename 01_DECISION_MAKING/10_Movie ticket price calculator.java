import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        double time = sc.nextDouble();
      
        if (Math.abs(time - 13.30) < 0.01) {
            System.out.println("$2.00");
        } else if (age > 13) {
            System.out.println("$5.00"); 
        } else {
            System.out.println("$2.00");
            
       }
        
        sc.close();
    }
}
