
package controlador;

import javax.swing.JOptionPane;

public class Metodo { //METODO DE LA SECANTE.
    
    public double metodoBiseccion(Funcion f, double b1, double a1, int it, double e) {
        double r = Double.NaN;
        double x2 = b1;
        double c1 = 0;

        for (int j = 0; j < it; j++) {
            c1 = (a1 + b1) / 2;

            if (f.evaluar(c1) == 0) {
                r = c1;
                break;
            }

            if (f.evaluar(a1) * f.evaluar(c1) < 0) {
                b1 = c1;
                r = c1;
            } else {
                a1 = c1;
                r = c1;
            }
            Operaciones.iteraciones++;
        }
        
        JOptionPane.showMessageDialog(null, "Numero de iteraciones " + it + ": " + r + " resultado: " + f.evaluar(r));

        return r;
    }
    
    public double metodoSecante(Funcion f, double b1, double a1, int it, double e) {
        double r = Double.NaN;
        double x2 = b1;
        int k = 0;
        while (Math.abs(f.evaluar(x2)) > e && k < it) {
            x2 = b1 - (f.evaluar(b1) * (a1-b1)) / (f.evaluar(a1) - f.evaluar(b1));
            b1 = a1;
            a1 = x2;
            k++;
        }
        if(k<it) {
            r = x2;
        }
        
        JOptionPane.showMessageDialog(null, "Numero de iteraciones " + it + ": " + r + " resultado: " + f.evaluar(r));
        return r;
        
    }
}
