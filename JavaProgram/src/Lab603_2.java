import java.util.Scanner;

public class Lab603_2 {	
	static Scanner scan = new Scanner(System.in);
	static int[] numberOfInteger = { 78, 36, 58, 41, 25, 92, 75 };
	public static void main(String[] args) {			
		int indexOfArray = inputData();			
		while (checkIndexOfArray(indexOfArray,numberOfInteger)) {
			System.out.print("Input index of array, again : ");
			indexOfArray = scan.nextInt();
		}
		System.out.println();
		displayValueOfArray(indexOfArray,numberOfInteger);		
	}//end of main()
	
	public static int inputData() {
		System.out.print("Input index of array : ");		
		return scan.nextInt();
	}//end of inputData()
	
	public static boolean checkIndexOfArray(int indexArr,int[] numofInt) {		
		return indexArr < 0 || (indexArr > (numofInt.length)-1);		
	} //end of checkIndexOfArray
	
	public static void displayValueOfArray(int indexArr,int[] numofInt) {
		System.out.println("Value in current index is " + (numofInt[indexArr]));
		System.out.println((indexArr == (numofInt.length-1))
				?"Sorry, " + indexArr + " is the last index in array."
				:"Value in next index is " + (numofInt[indexArr + 1]));				
	}//end of displayValueOfArray
}
