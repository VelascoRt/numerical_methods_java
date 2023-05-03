package controlador;

import javax.swing.JOptionPane;

public class Operaciones { /*Clase que realiza todas las operaciones */
    
    public static int iteraciones = 0;
    
    public static double metodoNumerico (double min, double max, double a, double b, double c, int i, int m, int it) {
        double resultado = 0;
        double p1 = 0;
        double p2 = 0;
        double z = 0;
        double pz = 0;
        if (p1 * p2 > 0) {
            JOptionPane.showMessageDialog(null, "No hay resultado");
        } else {
            for (int j = 0; j < it; j++) {
                switch (m) {
                    case 1: //Método bisección;
                        p1 = sacarResultados(i, a, b, c, min);
                        z = (min + max) / 2;
                        pz = sacarResultados(i, a, b, c, z);
                        break;
                    case 2: //Método Falsa posición
                        p1 = sacarResultados(i, a, b, c, min);
                        p2 = sacarResultados(i, a, b, c, max);
                        z = max - ((p2 * (max - min)/(p2 - p1)));
                        pz = sacarResultados(i, a, b, c, z);
                        break;
                
                    default: //Default.
                    throw new AssertionError();
                }
                if (p1 * pz == 0) { //Todo esto es lo que hace funcionar el codigo.
                    resultado = z;
                    break;
                }
                if(p1 * pz < 0) {
                    max = z;
                    resultado = z;
                }  
                if (p1 * pz > 0){
                    min = z;
                    resultado = z;
                }
                iteraciones++;
            }  /*Imprime el resultado */
            JOptionPane.showMessageDialog(null, "Numero de iteraciones " + iteraciones + ": " + z + " resultado: " + pz);
        }
        
        return resultado;
    }
    /*Esto es la biblioteca de Ecuaciones, esto será aumentando, para conseguir la mayoria de ecuaciones. */

    public static double sacarResultados (int i, double a, double b, double c, double x) {
        double resultado = 0;
        switch (i) {
            case 1:
                resultado = (a)/(x + c);
                break;
            case 2:
                resultado = Math.pow(Math.E,x) + b - x;
                break;
            case 3:
                resultado = Math.pow(x,3) + (b*(Math.pow(x, 2))) + c;
                break;
            case 4:
                resultado = (a * Math.pow(x,2)) + (b*x) + c;
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
    
}
