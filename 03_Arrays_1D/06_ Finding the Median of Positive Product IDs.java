import java.util.*;
public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      
       int n=sc.nextInt();     //6
       int a[]=new int[n];    //given array store 
       int b[]=new int[n];    //empty array 
       
       int p=0;    //3 count positive number
      
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();    // 11 23 -3 3 -5 -32
       }
       
       for(int i=0;i<n;i++){
        if(a[i]>0){
            b[p]=a[i];     //b[0]=11,b[1]=23,b[2]=3
            p++;
        }
       }
      
       if(p==0){
        System.out.print(-1);
       }
       else{
        System.out.print(b[(p/2)]);   //3/2=1 middle element print 
       }
    }
}
