import javax.swing.*;

public class uppgift2{
	public static void main(String[]args){


		double prispg;
		double prisåk;

		prispg = 75;
		prisåk = 4000;
	

		String gs = JOptionPane.showInputDialog(null, "hur många gåner i veckan tänker du fara på gymmet?");
		double g = Double.parseDouble(gs);
		if(prispg * g * 52 > prisåk){

			JOptionPane.showMessageDialog(null, "årskort");
		}else{

			JOptionPane.showMessageDialog(null, "per gång");
		}





		}
	}