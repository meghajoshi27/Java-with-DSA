import java.util.*;

public class function {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;

    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = calculateSum(a, b);
        System.out.println(sum);
        
    }
    
}
