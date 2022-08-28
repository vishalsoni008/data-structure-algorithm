package knowegable;

public class MathSquartMethod {

    public static boolean isPrime(int n){
        if(n<=1)
            return false;

        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;

        if(isPrime(n))
            System.out.println("this is a prime number "+n);

        else
            System.out.println("that is not a prime number");
    }

}
