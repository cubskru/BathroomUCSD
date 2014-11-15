import objectdraw.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Image;

public class Markers extends JFrame {

	private JButton marker;
	private JPanel content;
	private JFrame frame;
	private Location pt;
	private int x;
	private int y;
	private VisibleImage img;
	private JLabel background;

	public Markers() {
		img = new VisibleImage(getImage("map.JPG"),frame.getWidth()/2 - 324,frame.getHeight()/2 - 296.5 , frame);
		marker = new JButton();
		marker.setPreferredSize(new Dimension(20,20));
		content = new JPanel();
		content.setSize(20,20);
		frame = new JFrame("Bathrooms");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content.add(marker);
		frame.add(content);
		frame.setSize(1000,1000);
		frame.setVisible(true);	
	}
	
	public static void main(String[] args){
		new Markers();
}
}
