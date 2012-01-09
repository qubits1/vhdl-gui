/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vhdl;

import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author qubits
 */
public class Vhdl{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TooManyListenersException {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vhdl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Vhdl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Vhdl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Vhdl.class.getName()).log(Level.SEVERE, null, ex);
        }
        VHDLview f= new VHDLview();
        f.setVisible(true);
        while(true) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ee) {}
        
        }
    }
}
