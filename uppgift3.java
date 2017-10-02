import javax.swing.*;

public class uppgift3{
	public static void main(String[]args){


	

		String gs = JOptionPane.showInputDialog(null, "Hur många poäng fick du");
		double g = Double.parseDouble(gs);
		if(g > 44){
			JOptionPane.showMessageDialog(null, "Du fick ett A");
		}else if(g>39){
			JOptionPane.showMessageDialog(null, "Du fick ett B");
		}else if(g>34){
			JOptionPane.showMessageDialog(null, "Du fick ett C");
		}else if(g>29){
			JOptionPane.showMessageDialog(null, "Du fick ett D");
		}else if(g>24){
			JOptionPane.showMessageDialog(null, "Du fick ett E");
		}else{
			JOptionPane.showMessageDialog(null, "Du fick ett F");
		}

	}
}