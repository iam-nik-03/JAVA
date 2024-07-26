public class multiply {

    public static int multi(int a,int b) {
        int product = a * b;
        return product;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int x = multi(a, b);
        x = multi(20, 30);
        System.out.println("a x b ="+x);
        
    }
}
