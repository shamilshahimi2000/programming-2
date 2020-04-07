import java.util.*;

public class Average {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c,d;
        
        System.out.println("Enter 3 integer:");
        System.out.print("input 1: ");
        a = input.nextInt();
        System.out.print("input 2: ");
        b = input.nextInt();
        System.out.print("input 3: ");
        c = input.nextInt();
        System.out.println("Average for 3 : " + average(a,b,c));

        System.out.println("\nEnter another input :");
        System.out.print("input 4: ");
        d = input.nextInt();
        System.out.println("Average for 4 input : " + average(a,b,c,d));

    }

    public static double average(int c1, int c2, int c3){
        double avg= ((double)(c1+c2+c3))/3;
        return avg;
    }

    public static double average(int c1, int c2, int c3, int c4){
        double avg = ((double)(c1+c2+c3+c4))/4;
        return avg;
    }

}