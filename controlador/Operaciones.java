package controlador;

import javax.swing.JOptionPane;

public class Operaciones { /*Clase que realiza todas las operaciones */
    public static double metodoNumerico (double min, double max, double a, double b, double c, int i, int m) {
        double resultado = 0;
        double p1 = 0;
        double p2 = 0;
        double z = 0;
        double pz = 0;
        int it = 0;
        if (p1 * p2 > 0) {
            JOptionPane.showMessageDialog(null, "No hay resultado");
        } else {
            for (int j = 0; j < 50; j++) {
                switch (i) {
                    case 1:  //Primer switch case 1
                        switch (m) { 
                        case 1:        /*Metodo biseccion */
                            p1 = sacarResultadoPrimero(a, min, c);
                            z = (min + max) / 2;
                            pz = sacarResultadoPrimero(a, z , c);
                            break;
                        case 2:       //case 2 /*Metodo de falsa posicion */
                            p1 = sacarResultadoPrimero(a, min, c);
                            p2 = sacarResultadoPrimero(a, max, c);
                            z = max - ((p2 * (max - min)/(p2 - p1)));
                            pz = sacarResultadoPrimero(a, z, c);
                            break;
                        case 3: //case 3
                            break;
                        default:
                            throw new AssertionError();
                        }
                        break; //Primer break;
                    case 2:              //Primer switch case 2
                        switch (m) {
                        case 1: //case 1
                            p1 = sacarResultadoSegundo(min, b);
                            z = (min + max) / 2;
                            pz = sacarResultadoSegundo(z, b);
                            break;
                        case 2: //case 2
                            p1 = sacarResultadoSegundo(min, b);
                            p2 = sacarResultadoSegundo(max, b);
                            z = max - ((p2 * (max - min)/(p2 - p1)));
                            pz = sacarResultadoSegundo(z, b);
                            break;
                        case 3: //case 3
                            break;
                        default:
                            throw new AssertionError();
                        }
                        break; //Segundo break;
                    case 3:  //Primer switch case 3
                        switch (m) {
                        case 1: //case 1
                            p1 = sacarResultadoTercero(min, b, c);
                            z = (min + max) / 2;
                            pz = sacarResultadoTercero(z, b, c);
                            break;
                        case 2: //case 2
                            p1 = sacarResultadoTercero(min, b, c);
                            p2 = sacarResultadoTercero(max, b, c);
                            z = max - ((p2 * (max - min)/(p2 - p1)));
                            pz = sacarResultadoTercero(z, b, c);
                            break;
                        case 3: //case 3
                            break;
                        default:
                            throw new AssertionError();
                        }
                        break; //Tercer break;
                    case 4:
                        switch (m) {
                        case 1: //case 1
                            p1 = sacarResultadoCuarto(min, b, c, a);
                            z = (min + max) / 2;
                            pz = sacarResultadoCuarto(z, b, c, a);
                            break;
                        case 2: //case 2
                            p1 = sacarResultadoCuarto(min, b, c, a);
                            p2 = sacarResultadoCuarto(max, b, c, a);
                            z = max - ((p2 * (max - min)/(p2 - p1)));
                            pz = sacarResultadoCuarto(z, b, c, a);
                            break;
                        case 3: //case 3
                            break;
                        default:
                            throw new AssertionError();
                        }
                        break; //Tercer break;
                    default:
                        throw new AssertionError();
                }
                if (i ==1 ){
                    
                    
                } else {
                    
                    
                }
                if (p1 * pz == 0) {
                    resultado = z;
                    break;
                }

                if(p1 * pz < 0) {
                    max = z;
                    resultado = z;
                }

                if(p1 * pz > 0) {
                    min = z;
                    resultado = z;
                }
                it++;
            }  /*Imprime el resultado */
            JOptionPane.showMessageDialog(null, "Numero de iteraciones " + it + ": " + z + " resultado: " + pz);
        }
        
        return resultado;
    }
    /*Esto es para sacar el resultado sacando algunos algoritmos de ejemplo, pero en un caso real, tendriamos que tener todas
     * las posibilidades, asi que esto lo tendremos que cambiar a otra alternativa. */
    /*Eso, o aumentar los sacar resultados hasta el infinito. */

    public static double sacarResultadoPrimero (double a, double x, double c) {
        double resultado = 0;
        resultado = (a)/(x + c);
        return resultado;
    }
    
    public static double sacarResultadoSegundo (double x, double b) {
        double resultado = 0;
        resultado = Math.pow(Math.E,x) + b - x;
        
        return resultado;
    }
    public static double sacarResultadoTercero (double x, double b, double c) {
        double resultado = 0;
        resultado = Math.pow(x,3) + (b*(Math.pow(x, 2))) + c;
        
        return resultado;
    } //Version 1.01, Solo agregue un nuevo resultado Cuarto.
    public static double sacarResultadoCuarto (double x, double b, double c, double a) {
        double resultado = 0;
        resultado = (a * Math.pow(x,2)) + (b*x) + c;
        
        return resultado;
    }
    
    
}
