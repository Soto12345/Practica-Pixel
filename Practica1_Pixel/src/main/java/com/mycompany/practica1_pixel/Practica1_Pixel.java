
package com.mycompany.practica1_pixel;


import javax.swing.JFrame;


public class Practica1_Pixel{
  

    public static void main(String[] args) {
      JFrame frame = new JFrame();
        Pixel p=new Pixel();
        frame.setSize(500, 500);
        frame.setTitle("Pixeles ");
        frame.setLocationRelativeTo(null);
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
