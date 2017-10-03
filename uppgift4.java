import javax.swing.*;

public class uppgift4{
	public static void main(String[]args){


String xs = JOptionPane.showInputDialog(null, "Hur brett är ditt brev?(skriv i mm)");
String ys = JOptionPane.showInputDialog(null, "hur tjockt är ditt brev?(skriv i mm)");
String zs = JOptionPane.showInputDialog(null, "hur långt är ditt brev?(skriv i mm)");
int x = Integer.parseInt(xs);
int y = Integer.parseInt(ys);
int z = Integer.parseInt(zs);
if(x > 90 && y < 100 && z > 140 && z < 600 && x + y + z < 900){
JOptionPane.showMessageDialog(null, "Ditt brev är godtjänt!");
}else{
	JOptionPane.showMessageDialog(null, "Get that weak shit outta here boy");
}



/*import javax.swing.*;

public class uppgift4{
	public static void main(String[]args){


x = JOptionPane.showInputMessage(null, "Hur brett är ditt brev?(skriv i mm)");
y = JOptionPane.showInputMessage(null, "hur tjockt är ditt brev?(skriv i mm)");
z = JOptionPane.showInputMessage(null, "hur långt är ditt brev?(skriv i mm)");
if(x > 90)&&(y < 100)&&(z > 140 && z < 600)&&(x + y + z < 900){
JOptionPane.showMessageDialog(null, "Ditt brev är godtjänt!");
}else{
	JOptionPane.showMessageDialog(null, "Get that weak shit outta here boy");
}





	}
}*/


	}
}