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
	public void mouseClicked(MouseEvent e) { //마우스가 해당 컴포넌트를 클릭했을 때 발생
		System.out.println("mouseClicked");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) { //마우스가 해당 컴포넌트 영역 안으로 나갈 때 발생
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) { //마우스가 해당 컴포넌트 영역 밖으로 나갈 때 발생
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) { //마우스 버튼을 누를때 발생
		Point start_point = e.getPoint(); //커서 시작의 좌표를 지역변수 start_point에 넣는다
		canvas.start_point = start_point; //지역변수 start_point의 X,Y 좌표를 canvas의 전역변수 start_point X,Y 자리에 각각 넣는다(두 변수 모두 Point클래스 타입이기 때문에)
	
		System.out.println("mousePressed");
	}
	
	@Override
	public void mouseReleased(MouseEvent e) { //눌러진 마우스를 놓을 때 발생
		System.out.println("mouseReleased");
	}

	
	public void setcanvas(DrawingCanvas _canvas) {
		canvas = _canvas;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) { //해당 컴포넌트 위에서 마우스가 눌러진 상태로 드래그 될 때 발생
		if(canvas == null) { //canvas를 참조하여 사용되는 함수는 exception이 발생되지않도록 null값일 경우 함수를 사용하지않고 리턴한다
			return;
		}
		
		//null값이 아닐 시 함수사용 코드
		Point end_point = e.getPoint(); //커서 끝의 좌표를 지역변수 end_point에 넣는다
		canvas.end_point = end_point; //지역변수 end_point의 X,Y 좌표를 canvas의 전역변수 end_point X,Y 자리에 각각 넣는다(두 변수 모두 Point클래스 타입이기 때문에)
		
		canvas.repaint(); //마우스가 움직이는 동안 보여지기(dragged 시 선이 확인될 수 있도록)
	}

	@Override
	public void mouseMoved(MouseEvent e) { //해당 컴포넌트 위에서 마우스가 움직일 때 발생
		System.out.println("마우스 Moved Called");
	}

}///end of class
