package com.riphtix.vgmadf;

import javax.swing.*;
import java.awt.*;

public class Display extends Canvas implements Runnable{
    public static final long serialVersionUID = 1L;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "VDMaDF: No Name";

    private Thread thread;
    private boolean running = false;

    private void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
    }

    private void stop(){
        if(!running){
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void run(){
        while (running = true){

        }
    }


    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.pack();
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        game.start();
    }
}
