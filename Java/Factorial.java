package fatorial;

public class Factorial {
    public Factorial(){};

    public int factorial(int num){
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
