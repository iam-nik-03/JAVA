import java.util.Scanner;

public class sum {

    public static int CalculateSum(int num1,int num2) {
        int sum = num1 +num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter 2 Values : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("sum is : "+sum);
    }
}
