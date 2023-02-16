import javax.swing.*;

public class Shop100Baht {
	public static void main(String[] args) {
		Product arnupab = new Product();
		
		int button = JOptionPane.showConfirmDialog(null,"Pattanakarn?");
		
		if(button==0) {
			arnupab = new PattanakarnBranch();			
		}
		
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		
		JOptionPane.showMessageDialog(null, arnupab);
	}
}
