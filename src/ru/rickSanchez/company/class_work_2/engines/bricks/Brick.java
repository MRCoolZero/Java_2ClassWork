package ru.rickSanchez.company.class_work_2.engines.bricks;

import java.awt.Color;
import java.awt.Graphics;

import ru.rickSanchez.company.class_work_2.engines.common.GameCanvas;
import ru.rickSanchez.company.class_work_2.engines.common.Sprite;

public class Brick extends Sprite {

    private final Color color = new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    private float vX = (float)(100f +(Math.random() *200f));
    private float vY = (float)(100f +(Math.random() *200f));

    public Brick() {
        halfHeight = 20 + (float)(Math.random() * 50f);
        halfWidth = halfHeight;
    }

    public Brick(int x, int y){
        this();
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.drawRect((int) getLeft(), (int) getTop(), (int) getWidth(), (int) getHeight());
    }
}
