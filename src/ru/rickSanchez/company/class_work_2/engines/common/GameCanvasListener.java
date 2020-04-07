package ru.rickSanchez.company.class_work_2.engines.common;

import java.awt.Graphics;

public interface GameCanvasListener {
    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime);
}
