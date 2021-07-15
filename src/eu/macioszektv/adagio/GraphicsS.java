package eu.macioszektv.adagio;

import java.awt.Graphics2D;
import java.awt.Image;

public class GraphicsS extends Sprite {

    private final Image image;
    
    public GraphicsS(int x, int y, int speed, Image image) {
        super(x, y, speed);
        this.image = image;
    }

    @Override
    protected void draw(Graphics2D g2D) {
        g2D.drawImage(this.image, getX(), getY(), null);
    }
}
