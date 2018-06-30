class returnPermutation{
	public static void main(String[] args){
		for(String i : returnCombinations("abc")){
			System.out.println(i);
		}
	}
	public static String[] returnCombinations(String input){
			if(input.equals("")){
				String[] returnable ={""};
				return returnable;
			}
			String[] got = returnCombinations(input.substring(1));
			String inStrack = ""+input.charAt(0);
			int gotLength = got[0].length();
			int newLength = (got[0].length()+1)*(got.length);
			String[] arr = new String[newLength];
			int counter = 0;
		for(String i : got){
			for(int j = 0; j <= got[0].length(); j++){
				String toBeMade = i.substring(0,j)+inStrack+i.substring(j);
				arr[counter] = toBeMade;
				counter++;
			}
		}
		return arr;
	}
}
