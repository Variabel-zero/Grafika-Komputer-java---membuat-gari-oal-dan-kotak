/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satriawan;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Satriawan
 */
public class drawOval {
    public static void main (String args[]){
        JFrame frame = new JFrame("Menggambar gari,persegi ,dan oval");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        main dipanggil = new main();
        dipanggil.setBackground(Color.WHITE);
        frame.add(dipanggil);//menambahkan panel pad aframe
        frame.setSize(600,210);//menetapkan ukuran frame
        frame.setVisible(true);//menampilkan frame
    }
}
