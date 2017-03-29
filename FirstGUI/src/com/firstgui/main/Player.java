package com.firstgui.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
        this.x += this.velX;
        this.y += this.velY;
    }

    @Override
    public void render(Graphics g) {
        if (this.id == ID.Player) {
            g.setColor(Color.white);
        } else {
            g.setColor(Color.blue);
        }
        g.fillRect(this.x, this.y, 32, 32);
    }

}
