package knowegable;

public class MathSquartMethod {
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int  i =2;i<Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        if (isPrime(4)){
            System.out.println("this is a prime number");
        }
        else {
            System.out.println("this is not a prime number");
        }
    }
}
