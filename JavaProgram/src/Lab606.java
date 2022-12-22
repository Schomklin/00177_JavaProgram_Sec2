import javax.swing.JOptionPane;
public class Lab606 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (!checkIndex(nums, index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		int curr = currentData(nums, index);
	
		JOptionPane.showMessageDialog(null, 
			"Current data,nums["+index+"] is "+curr + "\n" +
			(index!=0 
			? "Previous data,nums["+(index-1)+"] is " +prevData(nums, index)
			: "No previous data") 
			+ "\n" +
			(index!= nums.length
			?"Next data,nums["+(index+1)+"] is " +nextData(nums, index)
			: "No next data"));
		
	}

	public static boolean checkIndex(int[] nums, int index) {
		return  index >= nums.length?false:true;
	}


	public static int currentData(int[] nums, int index) {
		return nums[index];
	}

	public static int prevData(int[] nums, int index) {
		return nums[index-1];
	}

	public static int nextData(int[] nums, int index) {
		return nums[index+1];
	}
}
