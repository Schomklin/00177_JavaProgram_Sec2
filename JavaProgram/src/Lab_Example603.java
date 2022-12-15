import java.util.*;
public class Lab_Example603 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		int number[] = new int[5];
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		System.out.println();
	//	int totalNumber = sumOfPos(number);		
	//	System.out.println("Summation of positive number is "+ totalNumber);
		System.out.println("Summation of positive number is "+ sumOfPos(number));
	}//end of main()
	
	public static int sumOfPos(int[] num) {
		int sum=0;
		for(int _num:num) {
			sum+=_num;			
		}
		return sum;		
	} //end of sumOfPos()

}
