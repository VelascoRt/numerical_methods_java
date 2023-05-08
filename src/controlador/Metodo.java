
package controlador;

public class Metodo {
    public double raiz(Funcion f, double b1, double a1, int c, double e) {
        double r = Double.NaN;
        double x2 = b1;
        int k = 0;
        while (Math.abs(f.evaluar(x2)) > e && k < c) {
            x2 = b1 - (f.evaluar(b1) * (a1-b1)) / (f.evaluar(a1) - f.evaluar(b1));
            b1 = a1;
            a1 = x2;
            k++;
        }
        if(k<c) {
            r = x2;
        }
        return r;
    }
}
