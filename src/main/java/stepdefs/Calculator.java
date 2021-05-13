package stepdefs;

public class Calculator {
    public double division(int a, int b) {
        return ((double) a)/b;
    }
    public double power(int a, int b){
        double res = 1;
        for (int i = 0; i < b; i++){
            res = res * ((double) a);
        }
        return res;
    }
}
