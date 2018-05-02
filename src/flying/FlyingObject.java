package flying;

import java.awt.*;
import java.awt.image.*;

public abstract class FlyingObject {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public boolean shutbyBullet(Bullet bullet)
	{
		int x = bullet.x;
		int y = bullet.y;
		return x>=this.x && x<=(this.x+this.width) && y<=this.y && y>=(this.y+this.height);
	}
	
	public abstract boolean outofBound();
	public abstract void nextStep();
}
