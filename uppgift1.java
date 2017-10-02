import javax.swing.*;

public class uppgift1{
	public static void main(String[]args){




		String s = JOptionPane.showInputDialog(null, "pris?");
		double kostnad = Double.parseDouble(s);
		double moms = kostnad/5;
		double utanmoms = kostnad*0.80;
		if (kostnad > 1000) {

			JOptionPane.showMessageDialog(null, "moms: " + moms / 90 + "\nutan moms: " + utanmoms / 90);
		}
		else{

		JOptionPane.showMessageDialog(null, "moms: " + moms + "\nutan moms: " + utanmoms);
		}
		


	}
}