/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class GUILayer {
    /**
    * 
    * Create Button
    * 
    * @param null
    */
    public void Build(){
        JFrame Window = new JFrame();
        Window.setSize(600,800);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton KeyCode_Z = new JButton("Z");
        JButton KeyCode_X = new JButton("X");
        JButton KeyCode_C = new JButton("C");
        JButton KeyCode_V = new JButton("V");
         
        Window.getContentPane().add(BorderLayout.WEST, KeyCode_Z);
        Window.getContentPane().add(BorderLayout.EAST, KeyCode_X);
        Window.getContentPane().add(BorderLayout.NORTH, KeyCode_C);
        Window.getContentPane().add(BorderLayout.SOUTH, KeyCode_V);
        
        Window.setVisible(true);
    }
}
