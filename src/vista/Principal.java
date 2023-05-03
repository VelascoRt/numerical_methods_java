package vista;

import javax.swing.JOptionPane;
import controlador.Operaciones;



public class Principal {
    
    public static void main(String[] args) { /*Intefaz escrita */


        
        JOptionPane.showMessageDialog(null, "Escribe el tipo de ecuacion.");
        int i = Integer.parseInt(JOptionPane.showInputDialog( "1. a/(b + c)\n2. e^a + b + c \n3. a^3 + b*a^2 + c, \n4. ax2 + bx + c"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserte el metodo a realizar: \n1.Biseccion \n2.Falsa posicion"));
        int it = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de iteraciones"));
        double resultado = escribirEcuacion(i, m, it);
            
        JOptionPane.showMessageDialog(null, "La raiz de la ecuacion es " + resultado);
        
        
        
    }
    
    
    public static double escribirEcuacion(int i, int m, int it){ /*Para crear la ecuacion. */
        double min = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor minimo"));
        double max = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor maximo"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de a."));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de b."));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de c."));
        double resultado = 0;
        
        resultado = Operaciones.metodoNumerico(min, max, a, b, c, i, m, it);
            
        return resultado;
            
    }
}
