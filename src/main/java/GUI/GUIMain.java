/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author user
 */
public class GUIMain extends JFrame{
    private JButton ingresar, salir;
    private JLabel lb_numJugadores;
    private JComboBox combo_jugadores;
    
    public GUIMain(){
        super("WarShip");
        prepareElementos();
        
        
    }

    private void prepareElementos() {
        setSize(700,700);
	Dimension frameSize = getSize();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((screenSize.width -frameSize.width)/2,
			(screenSize.height - frameSize.height)/2);
			setVisible(true);
    }
            
    
    
    
    
}
