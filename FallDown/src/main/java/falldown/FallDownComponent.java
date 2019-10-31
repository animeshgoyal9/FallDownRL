package main.java.falldown;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

//public class FallDownComponent extends JComponent implements KeyListener, Runnable
public class FallDownComponent extends JComponent implements Runnable
{
	private FallDownEngine engine;
	private boolean leftPressed, rightPressed;
	private int action = 0;

	public FallDownComponent()
	{
		super();
		engine = new FallDownEngine();
 		setPreferredSize(new Dimension(engine.WIDTH, engine.HEIGHT));

 		//addKeyListener(this);
 		Thread run = new Thread(this);
 		run.start();
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(20);
				if(engine.getStatus()) {
					Point ballLocation = engine.getBallLocation();
			 		action = PyServerClient.sendLocation((int)ballLocation.getX(), (int)ballLocation.getY());
					System.out.println("Action: " + action);
				}
			}
			catch(Exception ex)
			{
			}
			requestFocus();
			update();
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		synchronized(g)
		{
			engine.draw(g);
		}
	}

	public void update()
	{	
		if(action == 0)
			engine.moveLeft();
		if(action == 1)
			engine.moveRight();
		engine.update();
	}

//	public void keyPressed(KeyEvent ke)
//	{
//		if(ke.getKeyCode() == KeyEvent.VK_LEFT)
//			leftPressed = true;
//		else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
//			rightPressed = true;
//	}
//
//	public void keyReleased(KeyEvent ke)
//	{
//		if(ke.getKeyCode() == KeyEvent.VK_LEFT)
//			leftPressed = false;
//		else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
//			rightPressed = false;
//	}
//
//	public void keyTyped(KeyEvent ke)
//	{
//	}
}