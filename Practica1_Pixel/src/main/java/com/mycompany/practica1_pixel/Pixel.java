
package com.mycompany.practica1_pixel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Pixel extends JPanel{
    public Pixel() {
        this.setBackground(Color.WHITE);
    }
 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        g.setColor(Color.RED);
//
//        int xInicio1 = 50, yInicio1 = 50;
//        double pendiente1 = 0.5;
//        int xFin1 = 150;
//        int yFin1 = (int) (pendiente1 * (xFin1 - xInicio1) + yInicio1);
//
//        for (int x = xInicio1; x <= xFin1; x++) {
//            int y = (int) (pendiente1 * (x - xInicio1) + yInicio1);
//            g.drawLine(x, y, x, y);
//        }
//
//        g.setColor(Color.black);
//        g.drawString("Punto Inicial", xInicio1 - 10, yInicio1 - 10);
//        g.drawString("Punto Final", xFin1 - 10, yFin1 + 20);

        int xInicio2 = 250, yInicio2 = 100;
        double pendiente2 = -0.5;
        int xFin2 = 350;
        int yFin2 = (int) (pendiente2 * (xFin2 - xInicio2) + yInicio2);

        g.setColor(Color.RED);
        for (int x = xInicio2; x <= xFin2; x++) {
            int y = (int) (pendiente2 * (x - xInicio2) + yInicio2);
            g.drawLine(x, y, x, y);
        }

        g.setColor(Color.black);
        g.drawString("Punto Inicial", xInicio2 + 90, yInicio2 - 60);
        g.drawString("Punto Final", xFin2 - 120, yFin2 + 70);

        

        Color[] colores = {Color.RED, Color.GREEN, Color.BLUE, Color.black};

        int[][] coordenadasRombo = {
            {150, 300, 200, 250},
            {200, 250, 250, 300},
            {250, 300, 200, 350},
            {200, 350, 150, 300}
        };

        for (int i = 0; i < coordenadasRombo.length; i++) {
            int[] coords = coordenadasRombo[i];
            int xInicioRombo = coords[0];
            int yInicioRombo = coords[1];
            int xFinRombo = coords[2];
            int yFinRombo = coords[3];

            g.setColor(colores[i % colores.length]);

            if (xFinRombo != xInicioRombo) {
                double pendienteRombo = (double) (yFinRombo - yInicioRombo) / (xFinRombo - xInicioRombo);

                if (xInicioRombo < xFinRombo) {
                    for (int x = xInicioRombo; x <= xFinRombo; x++) {
                        int y = (int) (pendienteRombo * (x - xInicioRombo) + yInicioRombo);
                        g.drawLine(x, y, x, y);
                    }
                } else {
                    for (int x = xInicioRombo; x >= xFinRombo; x--) {
                        int y = (int) (pendienteRombo * (x - xInicioRombo) + yInicioRombo);
                        g.drawLine(x, y, x, y);
                    }
                }
            }
        }
        int[][] coordenadasZigzag = {
            {50, 200, 100, 150},
            {100, 150, 150, 200},
            {150, 200, 200, 150},
            {200, 150, 250, 200}
        };
        
        for (int i = 0; i < coordenadasZigzag.length; i++) {
            int[] coords = coordenadasZigzag[i];
            int xInicioZigzag = coords[0];
            int yInicioZigzag = coords[1];
            int xFinZigzag = coords[2];
            int yFinZigzag = coords[3];

            g.setColor(colores[i % colores.length]);
            
            if (xFinZigzag != xInicioZigzag) {
                double pendienteZigzag = (double) (yFinZigzag - yInicioZigzag) / (xFinZigzag - xInicioZigzag);

                for (int x = xInicioZigzag; x <= xFinZigzag; x++) {
                    int y = (int) (pendienteZigzag * (x - xInicioZigzag) + yInicioZigzag);
                    g.drawLine(x, y, x, y);
                }
            }
            
        }
        int[][] coordenadasZigzagVertical = {
            {400, 150, 350, 200},
            {350, 200, 400, 250},
            {400, 250, 350, 300},
            {350, 300, 400, 350}
        };

        for (int i = 0; i < coordenadasZigzagVertical.length; i++) {
            int[] coords = coordenadasZigzagVertical[i];
            int xInicioZigzag = coords[0];
            int yInicioZigzag = coords[1];
            int xFinZigzag = coords[2];
            int yFinZigzag = coords[3];

            g.setColor(colores[i % colores.length]);

            if (yFinZigzag != yInicioZigzag) {
                double pendienteZigzag = (double) (xFinZigzag - xInicioZigzag) / (yFinZigzag - yInicioZigzag);

                if (yInicioZigzag < yFinZigzag) {
                    for (int y = yInicioZigzag; y <= yFinZigzag; y++) {
                        int x = (int) (pendienteZigzag * (y - yInicioZigzag) + xInicioZigzag);
                        g.drawLine(x, y, x, y);
                    }
                } else {
                    for (int y = yInicioZigzag; y >= yFinZigzag; y--) {
                        int x = (int) (pendienteZigzag * (y - yInicioZigzag) + xInicioZigzag);
                        g.drawLine(x, y, x, y);
                    }
                }
            }
        }
    }

}
