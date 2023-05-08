
package controlador;

import com.singularsys.jep.JepException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.nfunk.jep.JEP;

public class Funcion {
    
    JEP j = new JEP();
    
    public Funcion(String def){ try {
        //Constructiores
        j.addVariable("x", 0);
        } catch (JepException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if(j.hasError()) {
            System.out.print(j.getErrorInfo());
        }
    }
    public double evaluar(double x) {
        double r;
        try {
            j.addVariable("x", x);
        } catch (JepException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        r = j.getValue();
        if(j.hasError()){
            System.out.print(j.getErrorInfo());
        }
        return r;
    }
}
