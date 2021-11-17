package frame;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseHandler implements MouseListener, MouseMotionListener, ActionListener {
	private DrawingCanvas canvas;
	
	
	public MouseHandler() {
		canvas = null;
	}
	
	//함수가 호출되는 시점을 파악해야한다!
	
	@Override
	public void mouseClicked(MouseEvent e) { //커서를 움직이지 않고 클릭만 했을때 
		System.out.println("mouseClicked");
	}
	
	@Override
	public void mousePressed(MouseEvent e) { //커서를 클릭 후 움직이는 동작이 있을때

		Point start_point = e.getPoint(); //커서 시작의 좌표를 지역변수 start_point에 넣는다
		canvas.start_point = start_point; //지역변수 start_point의 X,Y 좌표를 canvas의 전역변수 start_point X,Y 자리에 각각 넣는다(두 변수 모두 Point클래스 타입이기 때문에)
	
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
		if(canvas == null) { //canvas를 참조하여 사용되는 함수는 exception이 발생되지않도록 null값일 경우 함수를 사용하지않고 리턴한다
			return;
		}
		
		//null값이 아닐 시 함수사용 코드
		Point end_point = e.getPoint(); //커서 끝의 좌표를 지역변수 end_point에 넣는다
		canvas.end_point = end_point; //지역변수 end_point의 X,Y 좌표를 canvas의 전역변수 end_point X,Y 자리에 각각 넣는다(두 변수 모두 Point클래스 타입이기 때문에)
		
		canvas.repaint(); //마우스가 움직이는 동안 보여지기(dragged 시 선이 확인될 수 있도록)
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("마우스 Moved Called");
	}

	@Override
	public void mouseEntered(MouseEvent e) {


	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	
}
