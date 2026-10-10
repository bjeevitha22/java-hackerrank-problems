import java.util.*;
public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();  //7
       int a[]= new int[n];
      
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();      // 1 2 3 4 5 6 7
       }
      
       int x=sc.nextInt();              //2 shift last 
       for(int i=x;i<n;i++){            //i=2;i<7
        System.out.print(a[i]+" ");     //a[2]=3 to 7 print 
       }
      
       for(int i=0;i<x;i++){   //j=0;j<2  so prints a[0]=1 a[1]=2
        System.out.print(a[i]+" ");   //1 2 print 
       } 
    }
}
