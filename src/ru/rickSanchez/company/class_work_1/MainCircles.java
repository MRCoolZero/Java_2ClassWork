package ru.rickSanchez.company.class_work_1;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class MainCircles extends JFrame {
    public static final int POS_X = 400;
    public static final int POS_Y = 200;
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites = new Sprite[50];

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }

    private MainCircles(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        setTitle("Circles");
        initApplication();
        setVisible(true);
    }

    private void initApplication(){
        for(int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime){
        update(canvas, deltaTime);
        render(canvas, g);
    }

    public void update(GameCanvas canvas, float deltaTime){
        for(int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g){
        for(int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
}
