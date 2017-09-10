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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class BubblesFrame extends JFrame implements MouseListener, ActionListener {

	private ArrayList<Bubble> bubbles;
	private Timer timer;

	public BubblesFrame() {
		bubbles = new ArrayList<>();
		Bubble bubble = new Bubble();
		bubbles.add(bubble);
		bubble.setX(300);
		bubble.setY(300);

		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setContentPane(new BubblesPanel(bubbles));
		addMouseListener(this);
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));

		timer = new Timer(40, this);
		timer.start();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Point p;
		if (e.getButton() == MouseEvent.BUTTON1) {
			p = e.getPoint();
			Bubble b = new Bubble();
			b.setX(p.x);
			b.setY(p.y);
			bubbles.add(b);
		}
		if (e.getButton() == MouseEvent.BUTTON3) {
			p = e.getPoint();
			Iterator it = bubbles.iterator();
			while (it.hasNext()) {
				Bubble b = (Bubble) it.next();
				if ((b.getX() - 100 < p.x && b.getX() + 100 > p.x) && (b.getY() - 100 < p.y && b.getY() + 100 > p.y)) {
					it.remove();
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		for (Bubble bubble : bubbles) {
			bubble.move();
		}
		setContentPane(new BubblesPanel(bubbles));
		SwingUtilities.updateComponentTreeUI(this);
		this.revalidate();
		this.repaint();
		timer.restart();
	}

}
