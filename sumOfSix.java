public class sumOfSix{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		n = n/1000;
		
		while(n!=0){
			sum = sum + n%10;
			n = n/10;
		}
		System.out.println(sum);
	}
}