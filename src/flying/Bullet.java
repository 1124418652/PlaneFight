package flying;

public class Bullet extends FlyingObject{
	private int speed = 3;
	private String path;
	
	public Bullet(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.path = 
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
