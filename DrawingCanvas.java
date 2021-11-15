package frame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class DrawingCanvas extends Canvas{
	private int x;
	private int y;
	private int w;
	private int h;
	private Color color;
	
	
	public DrawingCanvas(){
		super();
		x = 0;
		y = 0;
		w = 7;
		h = 7;	
	}
	
	public void setx(int _x) {
		x = _x;
	}
	
	public void sety(int _y) {
		y = _y;
	}
	
	@Override
	public void paint(Graphics graphics) { //그림 그리는 역할
		graphics.setColor(color);
		graphics.fillOval(x, y, w, h);
		
		System.out.println("paint called x: " + x + "y: " + y);
	}
	
	@Override
	public void update(Graphics graphics) { //화면을 지우고 다시 paint를 호출하는 역할
		paint(graphics);
	}
	
}
