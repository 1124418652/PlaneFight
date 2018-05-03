package flying;

import java.io.*;
import javax.imageio.ImageIO;

public class Bullet extends FlyingObject{
	private int speed = 3;
	public Bullet(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}
	
	public boolean outofBound() 
	{
		return y>height;
	}
	
	public void nextStep() 
	{
		this.y -= this.speed;
	}
}
