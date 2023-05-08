package controlador;

import javax.swing.JOptionPane;

public class Operaciones { /*Clase que realiza todas las operaciones */
    
    public static int iteraciones = 0;
    
    public static double metodoNumerico (double a1, double b1, double a, double b, double c, double d, double e, int i, int m, int it, int datos) {
        double resultado = 0;
        double fa1 = funcion(i, a, b, c, d, e, a1);
        double fb1 = funcion(i, a, b, c, d, e, b1);
        double fbd = 0;
        double c1 = 0;
        double fc = 0;
        double error = 0;
        double given = 0;
        iteraciones = 0;
        if ((fa1 * fb1 > 0) && (datos != 3) && (m != 5) && (datos !=4) && (m != 3)  && (m != 6) && (m != 4) ){
            JOptionPane.showMessageDialog(null, "No hay resultado");
        } else {
            switch (m) {
                case 1: //Método de Bisección
                    for (int j = 0; j < it; j++) {
                        fa1 = funcion(i, a, b, c, d, e, a1);
                        c1 = (a1 + b1) / 2;
                        fc = funcion(i, a, b, c, d, e, c1);
                        
                        if(fc == 0) {
                            resultado = c1;
                            fc = funcion(i, a, b, c, d, e, c1);
                            break;
                        }
                        
                        if(fa1 * fc < 0) {
                            b1 = c1;
                            resultado = c1;
                            fc = funcion(i, a, b, c, d, e, c1);
                        }  else {
                            a1 = c1;
                            resultado = c1;
                            fc = funcion(i, a, b, c, d, e, c1);
                        }
                        iteraciones++;
                    }
                    break;
                case 2: //Método de falsa posición
                    for (int j = 0; j < it; j++) {
                        fa1 = funcion(i, a, b, c, d, e, a1);
                        fb1 = funcion(i, a, b, c, d, e, b1);
                        c1 = b1 - ((fb1 * (b1 - a1)/(fb1 - fa1)));
                        fc = funcion(i, a, b, c, d, e, c1);
                        
                        if(fc == 0) {
                            resultado = c1;
                            fc = funcion(i, a, b, c, d, e, c1);
                            break;
                        }
                        
                        if((fa1 * fc) > 0) {
                            a1 = c1;
                            fa1 = funcion(i, a, b, c, d, e, a1);
                            c1 = b1 - ((fb1 * (b1 - a1)/(fb1 - fa1)));
                            fc = funcion(i, a, b, c, d, e, c1);
                            resultado = c1;
                        } else if((fb1 * fc) > 0) {
                            b1 = c1;
                            fb1 = funcion(i, a, b, c, d, e, b1);
                            c1 = b1 - ((fb1 * (b1 - a1)/(fb1 - fa1)));
                            fc = funcion(i, a, b, c, d, e, c1);
                            resultado = c1;
                        }
                        iteraciones++;
                        
                    }
                    
                    break;
                case 3:// Método Newton Raphson
                    given = b1;
                    for (int j = 0; j < it; j++) {
                        fb1 = funcion(i, a, b, c, d, e, b1);
                        fbd = derivada(i, a, b, c, d, e, b1);
                        c1 = b1 - (fb1/fbd);
                        error = Math.abs((c1 - b1)/c1)*100;
                        b1 = c1;
                        fc = funcion(i, a, b, c, d, e, c1);
                        resultado = c1;
                        iteraciones++;
                        if (given>error) {
                            break;
                        }
                    }
                    
                    break;
                case 4: // Método de la secante.
                    given = b1;
                    double fbd2 = 0;
                    for (int j = 0; j < it; j++) {
                        fa1 = funcion(i, a, b, c, d, e, a1);
                        fb1 = funcion(i, a, b, c, d, e, b1);
                        c1 = b1 - ((fb1 * (a1 - b1))/(fa1 - fb1));
                        error = Math.abs((c1 - b1)/c1)*100;
                        b1 = c1;
                        fc = funcion(i, a, b, c, d, e, c1);
                        resultado = c1;
                        iteraciones++;
                        if (given>error) {
                            break;
                        }
                    }
                    break;
                case 5: //Método raíces múltiples.
                    for (int j = 0; j < it; j++) {
                        fa1 = funcion(i, a, b, c, d, e, a1);
                        fb1 = funcion(i, a, b, c, d, e, b1);
                        fbd = derivada(i, a, b, c, d, e, b1);
                        fbd2 = derivadaSegunda(i, a, b, c, d, e, b1);
                        
                        c1 = b1 - (((fb1 * fbd))/((Math.pow(fbd, 2) - (fb1 * fbd2))));
                        error = Math.abs((c1 - b1)/c1)*100;
                        b1 = c1;
                        fc = funcion(i, a, b, c, d, e, c1);
                        resultado = c1;
                        iteraciones++;
                        if (given>error) {
                            break;
                        }
                    }
                case 6://Metodo punto fijo 
                    for (int j = 0; j < 10; j++) {
                        c1 = puntoFijo(i, a, b, c, d, e, b1);
                        error = Math.abs((c1 - b1)/c1)*100;
                        b1 = c1;
                        fc = funcion(i, a, b, c, d, e, c1);
                        resultado = c1;
                        iteraciones++;
                        if (given>error) {
                            break;
                        }
                    }
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escoge de 1 a 6.");
                
            }  /*Imprime el resultado */
            JOptionPane.showMessageDialog(null, "Numero de iteraciones " + iteraciones + ": " + resultado + " resultado: " + fc);
        }
        
        return resultado;
    }
    /*Esto es la biblioteca de Ecuaciones, esto será aumentando, para conseguir la mayoria de ecuaciones. */

    public static double funcion (int i, double a, double b, double c, double d, double e, double x) {
        double resultado = 0;
        switch (i) {
            case 1:
                resultado = (a)/(x + c);
                break;
            case 2:
                resultado = Math.pow(Math.E,x) + b - x;
                break;
            case 3:
                resultado = (a*Math.pow(x,3)) + (b*(Math.pow(x, 2))) + c;
                break;
            case 4:
                resultado = (a * Math.pow(x,2)) + (b*x) + c;
                break;
            case 5:
                resultado = (a*Math.pow(x, 3) + (b*Math.pow(x, 2) + (c*x) + d));
                break;
            case 6:
                resultado = a * Math.sin((b * x) + c);
                break;
            case 7:
                resultado = x + a;
                break;
            case 8:
                resultado = (a * Math.pow(x,2)) + (b);
                break;
            case 9:
                resultado = ((a * Math.pow(x, 4)) + (b * Math.pow(x, 2)) + c);
                break;
            case 10:
                resultado = ((a * Math.pow(x, 4)) + (b * Math.pow(x, 3)) + (c * Math.pow(x, 2)) + ((d * x)) + e);
                break;
            case 11: 
                resultado = Math.pow(a, x) + b;
                break;
            case 12:
                resultado = (Math.log10(a + b) / Math.log10(x));
                break;
            case 13:
                resultado = Math.sqrt(x + a);
                break;
            case 14:
                resultado = ((x/(x+a)) + (b*x/(x+c)));
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
    
    public static double derivada(int i, double a, double b, double c, double d, double e, double x) {
        double resultado = 0;
        switch (i) {
            case 1:
                resultado = -((a)/(Math.pow(x + c, 2)));
                break;
            case 2:
                resultado = Math.pow(Math.E, x) - 1;
                break;
            case 3:
                resultado = (3*Math.pow(x, 2) + (2*b*x));
                break;
            case 4:
                resultado = (2*a*x) + b;
                break;
            case 5:
                resultado = (3*a*Math.pow(x, 2) + (2*b*x) + c);
                break;
            case 6: 
                resultado =  a * b * Math.cos((b * x) + c);
                break;
            case 7:
                resultado = 1;
                break;
            case 8:
                resultado = 2 * a * x;
                break;
            case 9:
                resultado = (4 * a * Math.pow(x, 3)) + (2 * b * x);
                break;
            case 10:
                resultado = (4 * a * Math.pow(x, 3)) + (3 * b * Math.pow(x, 2)) + (2 * c * x) + d;
                break;
            case 11:
                resultado = Math.pow(a, x) * Math.log1p(a);
                break;
            case 12:
                resultado = - (Math.log1p(a + b)/(x * Math.pow(Math.log1p(x), 2)));
                break;
            case 13:
                resultado =  1 / (2 * Math.sqrt(x + a));
                break;
            case 14:
                resultado = ((a / Math.pow((x + a), 2))) + ((b * c) / Math.pow((x + c), 2));
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
    
    public static double derivadaSegunda(int i, double a, double b, double c, double d, double e, double x) { //Puta madre
        double resultado = 0;
        switch (i) {
            case 1:
                resultado = ((2*a)/(Math.pow(x + c, 3)));
                break;
            case 2:
                resultado = Math.pow(Math.E, x);
                break;
            case 3:
                resultado = ((6*x) + (2*b));
                break;
            case 4:
                resultado = 2*a;
                break;
            case 5:
                resultado = (6 * a * x) + (2 * b * x) + c;
                break;
            case 6:
                resultado = -a * Math.pow(b, 2) * Math.sin((b * x) + c);
                break;
            case 7:
                resultado = 0;
                break;
            case 8:
                resultado = 2 * a;
                break;
            case 9:
                resultado = (12 * a * Math.pow(x, 2)) + (2 * b);
                break;
            case 10:
                resultado = (12 * a * Math.pow(x, 2)) + (6 * b * x) + (2 * c);
                break;
            case 11:
                resultado = Math.pow(a, x) * Math.pow(Math.log1p(a), 2) ;
                break;
            case 12:
                resultado = (Math.log1p(a + b) * (Math.log1p(x) + 2)) / (Math.pow(x, 2) * Math.pow(Math.log1p(x), 3)) ;
                break;
            case 13:
                resultado =   - 1 / (4 * Math.pow(x + a, 3/2));
                break;
            case 14:
                resultado = ((2 * a / Math.pow((x + a), 3))) - ((2 * b * c)  / Math.pow((x + c), 3));
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
    
    public static double puntoFijo(int i, double a, double b, double c, double d, double e, double x) {
        double resultado = 0; //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        switch (i) {
            case 1:
                resultado = a + x;
                break;
            case 2:
                resultado = Math.pow(Math.E,x) + b;
                break;
            case 3:
                resultado = - Math.sqrt(((a * (Math.pow(x, 3)) + c)/b));
                break;
            case 4:
                resultado = - ((a * Math.pow(x, 2) + c) / b);
                break;
            case 5:
                resultado = - ((a * Math.pow(x, 3) + (b* Math.pow(x, 2)) + d) / c);
                break;
            case 6:
                resultado = a * Math.sin((b * x) + c) + x;
                break;
            case 7:
                resultado = (-a + x)/2;
                break;
            case 8:
                resultado = Math.sqrt(- (b/a));
                break;
            case 9:
                resultado = - Math.sqrt((a * Math.pow(x, 4) + c) / b);
                break;
            case 10:
                resultado = ((a * Math.pow(x, 4)) + (b * Math.pow(x, 3)) + (c * Math.pow(x, 2)) + ((d * x)) + e);
                break;
            case 11: 
                resultado = Math.pow(a, x) + b + x;
                break;
            case 12:
                resultado = (Math.log10(a + b) / Math.log10(x)) + x;
                break;
            case 13:
                resultado = Math.sqrt(x + a) + x;
                break;
            case 14:
                resultado = ((x/(x+a)) + (b*x/(x+c))) + x;
                break;
            default:
                throw new AssertionError();
        }
        
        return resultado;
    }
    
}
