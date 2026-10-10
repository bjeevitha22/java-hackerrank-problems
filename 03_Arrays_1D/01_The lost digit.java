import java.util.*;
public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int a[]=new int[n-1];
      
       for(int i=0;i<n-1;i++){
        a[i]=sc.nextInt();
       }
      
       Arrays.sort(a);   // 1 2 3 5
       for(int i=0;i<n-1;i++){
        if(a[i]!=i+1){                  //a[0]=1 0+1=1
            System.out.print(i+1);      //4
            break;
        }
       }
    }
}
