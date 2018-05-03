package flying;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class ShootGame extends JPanel implements MouseListener
{
	/*the size of frame*/
	public static final int WIDTH = 400;
	public static final int HEIGHT = 654;
	
	/*get the path of every image*/
	private static File file = new File(ShootGame.class.getResource("").getPath()).getParentFile();
	private static String path = file.getParent() + File.separator + "src" + File.separator + "img";
	private static File bulletpath = new File(path + File.separator + "bullet.jpg");
	private static File enemypath = new File(path + File.separator + "enemy.jpg");
	private static File battleplanepath = new File(path + File.separator + "battleplane.jpg");
	
	/*definition the image*/
	public static BufferedImage battleplane;
	public static BufferedImage enemy;
	public static BufferedImage bullet;
	
	/*definition the icon*/
	private Bullet[] bullets = {};
	
	/*main function*/
	public static void main(String[] args)
	{
		ShootGame demo = new ShootGame();
		System.out.println(bulletpath.getPath());
		System.out.println(bulletpath.exists());
		ImageIcon img = new ImageIcon(battleplanepath.getPath());
		JLabel label = new JLabel(img);
		label.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		demo.add(label);
		JFrame frame = new JFrame("game");
		frame.getLayeredPane().add(demo);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/*initialize the image*/
	/*
	static {
		try {
			battleplane = ImageIO.read(battleplanepath);
			enemy = ImageIO.read(enemypath);
			bullet = ImageIO.read(bulletpath);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(bullet, bullets[0].getX(), bullets[0].getY(), null);
	}
	*/
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
}
