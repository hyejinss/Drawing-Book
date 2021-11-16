package frame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextField;

public class MouseHandler implements MouseListener, MouseMotionListener, ActionListener {
	JTextField thickness_control; //도구 굵기가 정해질 텍스트 필드

	private int endX;
	private int endY;
	private int startX;
	private int startY;
	private DrawingCanvas canvas;
	
	public MouseHandler() {
		startX = 0;
		startY = 0;
		endX = 0;
		endY = 0;
		canvas = null;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		
	}
	
	public void setcanvas(DrawingCanvas _canvas) {
		canvas = _canvas;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		endX = e.getX(); //드래그 되는 시점에서 X좌표가 저장 - 밑에서 시작좌표와 끝좌표를 연결해주어 선이 그어진다
		endY = e.getY(); //드래그 되는 시점에서 Y좌표가 저장 - 밑에서 시작좌표와 끝좌표를 연결해주어 선이 그어진다
		
		if(canvas != null) {
			canvas.setx(endX);
			canvas.sety(endY);
		}	
		
		canvas.repaint(); //마우스가 움직이는 동안 보여지기 
		//System.out.println("마우스 x위치: " + mouse_x + "마우스 y위치: " + mouse_y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("마우스 Moved Called");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
