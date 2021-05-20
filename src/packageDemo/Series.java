package packageDemo;

import java.util.Arrays;

public class Series {

    public static int nSum(int ...n){
        if(n.length == 1)
            return n[0];
        else{
            return n[n.length - 1] + nSum(Arrays.copyOf(n, n.length-1));
        }
    }

    public static int nSum(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else {
           return n + nSum(n-1);
        }
    }
    public static int factorial(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return n * factorial(n-1);

    }

    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

}
