/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
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
        setBounds(0, 0, 900, 700);
        
        //panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        //panel1.setPreferredSize(new Dimension(200, 200));
        panel1.setBounds(5, 5, 500, 500);
        botones = new JButton[10][10];
        panel1.setLayout(new GridLayout(10,10));
        for(int i =0; i<10; i++){
            for(int j=0; j < 10; j++){
                System.out.println("i:"+i+" j:"+j);
                botones[i][j] = new javax.swing.JButton();
                panel1.add(botones[i][j]);
            }
        }
        panel1.setVisible(true);
        add(panel1);
        
       
        
    }

   
    
}
