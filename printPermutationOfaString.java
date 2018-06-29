public class printPermutationOfaString {
    public static void main(String[] args){
//        String[] toBePassed = {"a","b","c"};
//
//        print(toBePassed, "");
    }

    public static void print(String[] input, String toBeMade){
        if(input.length == 0){
            System.out.println(toBeMade);
        }
        for(int i = 0; i < input.length; i++){
            String output = input[i];
            String[] arr = new String[input.length - 1];
            int counter = 0;
            for(int t = 0; t < input.length; t++){
                if(t==i){
                    continue;
                }
                arr[counter] = input[t];
                counter++;
            }
            print(arr, output+toBeMade);
        }

        return;

    }

}
