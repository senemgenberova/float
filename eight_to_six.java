public class eight_to_six{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int n1 = 0, k = 0;
		int temp = n;
		
		while(temp!=0){
			n1 = temp%10;
			temp = (temp-n1)/10;
			k++;
		}
		
		if(k==8){
			n = n/10;
			n = n%1000000;
			System.out.println(n);
		}
		else{
			System.out.println("Wrong input");
		}
		
	}
}
