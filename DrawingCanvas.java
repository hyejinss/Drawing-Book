package frame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class DrawingCanvas extends Canvas{

	private Color color;
	public Point start_point;
	public Point end_point;	
	
	
	
	public DrawingCanvas(){
		super(); //부모의 클래스를 호출할 때 사용. 
				 //자바 컴파일러는 부모 클래스의 생성자를 명시적으로 호출하지 않는 모든 자식 클래스의 생성자 첫 줄에 자동으로 super를 추가하여, 부모 클래스의 멤버를 초기화한다

		start_point = new Point(); //point클래스의 생성자를 호출하여 전역변수 start_point X,Y의 좌표를 넣는다
		end_point = new Point(); //point클래스의 생성자를 호출하여 전역변수 end_point X,Y의 좌표를 넣는다
		

	}
	
	
	@Override
	public void paint(Graphics graphics) { //그림 그리는 역할
		graphics.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight()); //그려있는 좌표를 모두 클리어한다
		graphics.setColor(color);
		graphics.drawLine(start_point.x, start_point.y, end_point.x, end_point.y); //라인이 그려지게 되는 부분. 

	}


	@Override
	public void update(Graphics graphics) { //화면을 지우고 다시 paint를 호출하는 역할
		paint(graphics);
	}
	
}///end of class
