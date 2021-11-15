package frame;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseMotionListener, ActionListener {
	private int mouse_x;
	private int mouse_y;
	private DrawingCanvas canvas;
	
	public MouseHandler() {
		mouse_x = 0;
		mouse_y = 0;
		
		canvas = null;
	}
	
	public int getmouse_x() {
		return mouse_x;
	}
	
	public int getmouse_y() {
		return mouse_y;
	}
	
	public void setcanvas(DrawingCanvas _canvas) {
		canvas = _canvas;
	}
	
	public void setmouse_x(int _mouse_x) {
		mouse_x = _mouse_x;
	}
	
	public void setmouse_y(int _mouse_y) {
		mouse_y = _mouse_y;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouse_x = e.getX();
		mouse_y = e.getY();
		
		if(canvas != null) {
			canvas.setx(mouse_x);
			canvas.sety(mouse_y);
			
			canvas.repaint();
		}
		System.out.println("마우스 x위치: " + mouse_x + "마우스 y위치: " + mouse_y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("마우스 Moved Called");
	}
	
}
