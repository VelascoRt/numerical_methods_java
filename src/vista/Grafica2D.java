
package vista;
import org.math.array.DoubleArray;
import java.lang.Math.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.math.plot.Plot2DPanel;
public class Grafica2D {
    public void graficarFuncion(double[] x, double[] y) {
        Plot2DPanel grafica2D = new Plot2DPanel("SOUTH");
        grafica2D.addLinePlot("Funciones",x, y);
        JFrame frame = new JFrame("Grafica de funciones");
        frame.setSize(500, 500);
        frame.setContentPane(grafica2D);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
