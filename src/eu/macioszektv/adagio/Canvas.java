package eu.macioszektv.adagio;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Canvas extends Panel implements KeyListener {
    
    public Canvas() {
        this.addKeyListener(Canvas.this);
        setDoubleBuffered(true);
        setFocusable(true);
        requestFocus();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        onDraw(g2D);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        onKeyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        onKeyUp(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    protected abstract void onKeyUp(KeyEvent event);
    
    protected abstract void onKeyPressed(KeyEvent event);
    
    protected abstract void onDraw(Graphics2D g2D);
}
