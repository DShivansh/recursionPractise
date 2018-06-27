public class mergeSort {
    public static void main(String[] args){
//        int[] check = {9,2,0,8,8,2,4,3,7,6};
//        ;//testing
//        int[] output = sorting(check);
//        for(int i : output){
//            System.out.println(i);
//        }
    }
    public static int[] sorting(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int starting = 0;
        int ending = arr.length;
        int[] a = sorting(breaking(arr, starting, ((starting+ending)/2)));
        int[] b = sorting(breaking(arr, ((starting+ending)/2), ending));
        return sorted(a,b);
    }

    public static int[] breaking(int[] arr, int starting, int ending){
        int[] t = new int[ending-starting];
        int tj = 0;
        for(int i = starting; i < ending; i++){
            t[tj] = arr[i];
            tj++;
        }
        return(t);
    }

    public static int[] sorted(int[] a, int[] b){
        int lengthOfTheArray = a.length+b.length;
        int[] result = new int[lengthOfTheArray];
        int lengthA=0;
        int lengthB=0;
        int lengthIndependent=0;
        int checkA = a.length;
        int checkB = b.length;
        while(lengthA != checkA && lengthB != checkB){
            if(a[lengthA]<=b[lengthB]){
                result[lengthIndependent] = a[lengthA];
                lengthA++;
                lengthIndependent++;
                continue;
            }
            if(b[lengthB]<a[lengthA]){
                result[lengthIndependent] = b[lengthB];
                lengthB++;
                lengthIndependent++;
                continue;
            }
        }
        int continuation = 0;
        if(lengthA == checkA){
            for(int i = lengthIndependent; i < result.length; i++){
                result[i] = b[lengthB];
                lengthB++;
            }
        }else{
            for(int i = lengthIndependent; i < result.length; i++){
                result[i] = a[lengthA];
                lengthA++;
            }
        }
        return result;

    }

}
