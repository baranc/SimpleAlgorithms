package PackageDemo;

import java.util.Arrays;

public class Series {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nSum(2,5,2));
        System.out.println(nSum(0));
    }
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

}
