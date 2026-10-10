import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
      
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();         // 5 2 0 8 0 2 1
        }
      
        int k=0;      // 1 1 at last k=2
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
                k++;
            }
        }
        for(int i=0;i<n-k;i++){           // b[0]=0 b[1]=0 
            System.out.print(0+" ");      //0 0 
        }
    }
}
