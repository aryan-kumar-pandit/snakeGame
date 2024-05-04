package snakeGame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	private int[] snakeXLength=new int[750];
	private int[] snakeYLength=new int[750];
	private int lengthOfSnake=3;
	private int moves=0;
	private boolean left=false;
	private boolean right=true;
	private boolean up=false;
	private boolean down=false;
	
	private ImageIcon snaketitle=new ImageIcon(getClass().getResource("snaketitle.jpg"));
	private ImageIcon leftmouth=new ImageIcon(getClass().getResource("leftmouth.png"));
	private ImageIcon rightmouth=new ImageIcon(getClass().getResource("rightmouth.png"));
	private ImageIcon downmouth=new ImageIcon(getClass().getResource("downmouth.png"));
	private ImageIcon upmouth=new ImageIcon(getClass().getResource("upmouth.png"));
	private ImageIcon snakeimage=new ImageIcon(getClass().getResource("snakeimage.png"));
	private ImageIcon enemy=new ImageIcon(getClass().getResource("enemy.png"));
	
	GamePanel()
	{
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.white);
		g.drawRect(24,10,851,55);
		g.drawRect(24,74,851,576);
		snaketitle.paintIcon(this,g,25,11);
		g.setColor(Color.black);
		g.fillRect(25,75,850,575);
		
		if(moves==0)
		{
			snakeXLength[0]=100;
			snakeXLength[1]=75;
			snakeXLength[2]=50;
			
			snakeYLength[0]=100;
			snakeYLength[1]=100;
			snakeYLength[2]=100;
			moves++;
			
		}
		if(left)
		{
			leftmouth.paintIcon(this,g,snakeXLength[0],snakeYLength[0]);
		}
		if(right)
		{
			rightmouth.paintIcon(this,g,snakeXLength[0],snakeYLength[0]);
		}
		if(up)
		{
			upmouth.paintIcon(this,g,snakeXLength[0],snakeYLength[0]);
		}
		if(down)
		{
			downmouth.paintIcon(this,g,snakeXLength[0],snakeYLength[0]);
		}
		for(int i=1;i<lengthOfSnake;i++)
		{
			snakeimage.paintIcon(this,g,snakeXLength[i],snakeYLength[i]);
		}
	}
	

}
