public class function1{
    static int  a=10;
    static int b=20;
    public static void func(){
        int temp;
        temp = a;
        a=b;
        b=temp;
        
        return;
    } 
    
    public static void main(String args[]) {
        System.out.println(a + " " + b);
        func();
        System.out.println(a + " " + b);

        
    }
}