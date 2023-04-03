import java.util.*;
public class array {
    public static void main(String args[]) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter number to be searched");
        int x = sc.nextInt();
        int [] num = new int[size];
        for(int i=0;i<size;i++){
            num[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
        for(int i= 0;i<size;i++){
            if(x==num[i]){
                System.out.println("Number found in position" + i);
            }
            
        }
        
    }
    
}
