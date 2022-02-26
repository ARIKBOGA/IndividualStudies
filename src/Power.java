import java.util.Scanner;

public class Power {
    public static double myPow(double x, int n) {
        if (n < 0) {

            x = 1 / x;
        }
        return func(x, n);

    }

    public static double func(double x, int n) {
        if (n == 0) {
            return 1;
        }
        // in this case we are not calculating fn(x*x,n/2) because x*x can be a big number but (x to the power n/2) is a small number which is squared again to result that why I used func (x,n/2) instead func(x*x,n/2)
        double val = func(x, n / 2);
        return (n % 2 == 0 ? val * val : x * val * val);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int n = scan.nextInt();
        System.out.println(myPow(x,n));
    }
}