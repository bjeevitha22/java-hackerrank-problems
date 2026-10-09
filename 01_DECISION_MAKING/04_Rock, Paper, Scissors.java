import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String move=sc.nextLine();
        
        if (move.equals("rock")){
            System.out.println("Paper");
        }
        else if (move.equals("paper")){
            System.out.println("Scissors");
        }
        else if(move.equals("scissors")){
            System.out.println("Rock");
            
        }
        sc.close();
    }
}
