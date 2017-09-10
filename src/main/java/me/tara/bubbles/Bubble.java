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

import java.awt.*;
import java.util.Random;


public class Bubble {

	private int x, y, diameter, v_x, v_y, color;

	public Bubble() {
		diameter = 100;
		Random random = new Random();
		color = random.nextInt(10) - 1;
		v_x = random.nextInt(8);
		v_y = random.nextInt(8);
	}

	public void move() {

		if (x < Toolkit.getDefaultToolkit().getScreenSize().getWidth() && x > 0 &&
			y < Toolkit.getDefaultToolkit().getScreenSize().getHeight() && y > 0) {
			x = x + v_x;
			y = y + v_y;
		} else {
			v_x = -v_x;
			v_y = -v_y;
			x = x + v_x;
			y = y + v_y;
		}
	}

	public int getDiameter() {
		return diameter;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

}
