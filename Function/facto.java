// import java.util.Scanner;

// public class facto {
//     public static int factorial(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter the  Values : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//        System.out.println(n +"! = "+ factorial(n));
        
//     }
// }

public class facto {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinoCoeff(int n , int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);
        
        int BinoCoeff = fact_n / (fact_r * fact_nmr);
        return BinoCoeff;
    
        
    }
    public static void main(String[] args) {
      
System.out.println(BinoCoeff(5,2));        
    }
}
