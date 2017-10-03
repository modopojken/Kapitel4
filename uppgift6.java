import javax.swing.*;

public class uppgift6{
	public static void main(String[]args){

String persNmr = JOptionPane.showInputDialog(null, "Skriv ditt personnummer i formen ÅÅÅÅMMDD");
String persNmr2 = JOptionPane.showInputDialog(null, "Skriv ditt personnummer i formen ÅÅÅÅMMDD");
String ar = persNmr.substring(1,4);
String manad = persNmr.substring(5,6);
String dag = persNmr.substring(7,8);
String ar2 = persNmr2.substring(1,4);
String manad2 = persNmr2.substring(5,6);
String dag2 = persNmr2.substring(7,8);


if(ar.equals(ar2) && manad.equals(manad2) && dag.equals(dag2)){

	JOptionPane.showMessageDialog(null, "Ni ar lika gammla");
}else{
	JOptionPane.showMessageDialog(null, "Ni ar inte lika gammla");
}

	}
}