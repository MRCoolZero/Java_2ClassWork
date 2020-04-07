package ru.rickSanchez.company.class_work_2.engines.circles;

import java.awt.Color;
import java.awt.Graphics;

import ru.rickSanchez.company.class_work_2.engines.common.GameCanvas;
import ru.rickSanchez.company.class_work_2.engines.common.GameObject;

public class Background implements GameObject {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2f));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 3f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        color = new Color(red,green,blue);
    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        canvas.setBackground(color);
    }
}
