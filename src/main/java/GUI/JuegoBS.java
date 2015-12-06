/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class JuegoBS extends JFrame{
    
    private javax.swing.JButton botones[][];                    
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private String jugadores;
    
    public JuegoBS(String jugadores) {
        this.jugadores=jugadores;
        
        initComponents();
        setLocationRelativeTo(null);
       // inicializarPanel1();
        setVisible(true);
    }

    private void initComponents() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 700, 600);
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setPreferredSize(new Dimension(500, 500));
        
        
        
       
        
    }

   
    
}
