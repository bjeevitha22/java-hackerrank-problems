import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int N = sc.nextInt();
        char C = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == C) {
                count++;
            }
        }

        System.out.println(count);
    }
}
