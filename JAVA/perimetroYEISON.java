import javax.swing.JOptionPane;

public class perimetroYEISON {
    public static void main(String[] args) {
       int base, altura,area,perimetro ;
	base= Integer.parseInt(JOptionPane.showInputDialog("digite la base"));
    altura= Integer.parseInt(JOptionPane.showInputDialog("digite la altura"));
	
	
	if((base>altura) || (altura>base)){
        area=base*altura;
		perimetro=(base+altura)*2 ;
        JOptionPane.showMessageDialog(null, "su area es "+area+ "\nsu perimetro es"+perimetro);
        
    }
		
		
	else{
 JOptionPane.showMessageDialog(null, "no es un rectangulo");
    }
		
    }
}
