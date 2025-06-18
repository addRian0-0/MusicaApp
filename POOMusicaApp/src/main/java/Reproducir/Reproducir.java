package Reproducir;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.net.URL;
import javazoom.jl.player.Player;

public class Reproducir {
    private static Player player;

    public static void main(String[] args) {

        String url1 = "https://poomsc.blob.core.windows.net/clancy/01%20-%20Overcompensate.mp3";
        String url2 = "https://poomsc.blob.core.windows.net/clancy/02%20-%20Next%20Semester.mp3";

        JFrame frame = new JFrame("Selector de Canciones");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton boton1 = new JButton("Reproducir Canción 1");
        boton1.setBounds(50, 20, 200, 30);
        frame.add(boton1);

        JButton boton2 = new JButton("Reproducir Canción 2");
        boton2.setBounds(50, 60, 200, 30);
        frame.add(boton2);

        boton1.addActionListener(e -> reproducir(url1));
        boton2.addActionListener(e -> reproducir(url2));

        frame.setVisible(true);
    }

    public static void reproducir(String urlStr) {
        try {
            if (player != null) {
                player.close();
            }
            URL url = new URL(urlStr);
            BufferedInputStream bis = new BufferedInputStream(url.openStream());
            player = new Player(bis);
            new Thread(() -> {
                try {
                    player.play();
                } catch (Exception e) {
                    System.err.println("Error al reproducir: " + e.getMessage());
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
