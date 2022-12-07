package lab_1;

public class Factorial {
    private int num;
    public Factorial() {}
    public int getFactorial(int n){
        int res = 1;
        num = n;

        for (int i = 1; i <= num; i++){
            res *= i;
        }

        return res;

    }
}
