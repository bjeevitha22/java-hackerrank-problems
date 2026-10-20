import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");
        for(int i=words.length;i>=0;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                System.out.print(words[i].charAt(j));
            }
        }
    }
}
