package a;

public class G_DemoArray {
	
	public static void main(String[] args) {
//		int a[]=new int[5];
//		
//		//-----traditioanl loop------------
//		for(int i=0;i<5; i++) {
//			System.out.println(a[i]);
//		}
//		
//		//-----------modern loop----enhance for loop------
//		for(int temp : a) {
//			System.out.println(temp);
//		}
		
		int a[]= {4,6,7,8,9};
		
		int sum= 0;
		for(int temp: a) {
			sum+=temp;// sum=sum+temp;
		}
		
		System.out.println(sum);
		
		
		
	}

}
