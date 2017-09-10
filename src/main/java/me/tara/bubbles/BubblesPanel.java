 /*
 * In The Name Of God
 * ========================================
 * [] File Name : Main.java
 *
 * [] Creation Date : 27-03-2014
 *
 * [] Created By : Tara Tandel(Tara.Tandel.94@gmail.com)
 * =======================================
*/
/**
 * @author Tara Tandel
 */
package me.tara.bubbles;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.*;

public class BubblesPanel extends JPanel {

	Color[] colors = new Color[]{BLACK, GRAY, BLACK, PINK, RED, ORANGE, YELLOW,
		GREEN, BLUE, CYAN};
	private ArrayList<Bubble> bubbles;

	public BubblesPanel(ArrayList<Bubble> bubbles) {
		this.bubbles = bubbles;
		setBackground(new Color(0, 0, 0, 10));
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Bubble bubble : bubbles) {
			g.setColor(colors[bubble.getColor()]);
			g.fillOval(bubble.getX(), bubble.getY(), bubble.getDiameter(), bubble.getDiameter());
		}
	}
}