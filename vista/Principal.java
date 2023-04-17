package vista;

import javax.swing.JOptionPane;
import controlador.Operaciones;

public class Principal {
    
    public static void main(String[] args) { /*Intefaz escrita */
        JOptionPane.showMessageDialog(null, "Escribe el tipo de ecuacion.");
        int i = Integer.parseInt(JOptionPane.showInputDialog( "1. a/(b + c)\n2. e^a + b + c \n3. a^3 + b*a^2 + c"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Inserte el metodo a realizar: \n1.Biseccion \n2.Falsa posicion"));
        double resultado = escribirEcuacion(i, m);
            
        JOptionPane.showMessageDialog(null, "La raiz de la ecuacion es " + resultado);
        
        
        
    }
    
    
    public static double escribirEcuacion(int i, int m){ /*Para crear la ecuacion. */
        double min = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor minimo"));
        double max = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor maximo"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de a (Si el valor es X escriba cualquier cosa)"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de b (Si el valor es X escriba cualquier cosa)"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserte valor de c (Si el valor es X escriba cualquier cosa)"));
        double resultado = 0;
        
        resultado = Operaciones.metodoNumerico(min, max, a, b, c, i, m);
            
        return resultado;
            
    }
}