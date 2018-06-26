public class findPower {
    public static int power(int x, int n) {
        //we need to do x^n recursively
        if(n == 0){
            return 1;
        }return x*power(x, n-1);
    }
}
