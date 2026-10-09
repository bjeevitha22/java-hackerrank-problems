import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();   
        int N = sc.nextInt();
        int R2 = sc.nextInt();
        int X = sc.nextInt();

        int hours = (int) Math.ceil(X / 60.0);

        int cost;
        if (hours <= N) {
            cost = hours * R1;
        } else {
            cost = (N * R1) + ((hours - N) * R2);
        }

        System.out.println(cost);
    }
}
