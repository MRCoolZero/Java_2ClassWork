package ru.rickSanchez.company.class_work_2.engines.common;

import java.awt.Graphics;

public interface GameObject {
    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
