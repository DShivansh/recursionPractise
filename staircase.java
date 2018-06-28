public class staircase {
    public static void main(String[] args){
//        int output = numberOfWays(6);
//        System.out.println(output);
    }
    public static int numberOfWays(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        if(n==0){
            return 1;
        }
        int k = numberOfWays(n-1);
        int l = numberOfWays(n-2);
        int m = numberOfWays(n-3);
        return k+l+m+1;
    }
}
