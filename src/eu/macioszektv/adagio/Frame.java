package eu.macioszektv.adagio;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame() {
		
	}
	
	public void create(Frame this, int width, int height, String title) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public void delete(Frame this) {
		this.setVisible(false);
	}
	
	public void setIcon(Frame this, URL url){
		try {
			Image image;
			image = ImageIO.read(url);
			this.setIconImage(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
