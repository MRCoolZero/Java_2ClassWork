package ru.rickSanchez.company.class_work_2.engines.common;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import ru.rickSanchez.company.class_work_2.engines.circles.MainCircles;

public class GameCanvas extends JPanel {
    private final Color color = new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    GameCanvasListener listener;
    long lastFrameTime;

    public GameCanvas(GameCanvasListener listener){
        this.listener = listener;
        lastFrameTime = System.nanoTime();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        listener.onCanvasRepainted(this, g, deltaTime);
        try {
            Thread.sleep(17);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
