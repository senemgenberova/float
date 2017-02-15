public class sumOfSix{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int temp = n;
		int sum = 0 , k=0, n1=0;
		
		while(temp!=0){
			n1 = temp%10;
			temp = (temp-n1)/10;
			k++;
		}
		
		if(k==8){
			n = n/1000;
			while(n!=0){
				sum = sum + n%10;
				n = n/10;
			}
			System.out.println(sum);
		}
		
	}
}
