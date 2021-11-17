package frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PaintFrame extends JFrame {
	
	JTextField thickness_control; //도구 굵기가 정해질 텍스트 필드
	
	int thickness = 10; //현 변수는 그려지는 선의 굵기를 변경할 때 변경값이 저장되는 변수
	
	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		jframe.setVisible(true); //윈도우 창이 보이게
		jframe.setSize(900, 700); //프레임 사이즈 지정
		jframe.setTitle("Drawing Book"); //프레임 타이틀 지정
		jframe.setLocationRelativeTo(null); //프로그램 실행시 화면 중앙에서 출력

		//절대 경로: C:\\workspace_java\\paint_java\\imageFile\\JFIcon.png
		//상대 경로: ../../resource/image/JFIcon.png   (상위의 상위)
		ImageIcon imageIcon = new ImageIcon("resource/image/JFIcon.png"); // 윈도우창 이미지 아이콘 설정
		jframe.setIconImage(imageIcon.getImage());
		
		DrawingCanvas canvas = new DrawingCanvas();
		canvas.setSize(900, 700);
		jframe.add(canvas);
		canvas.setBackground(Color.white);
		
		
		MouseHandler mouseHandler = new MouseHandler();
		
		canvas.addMouseListener(mouseHandler);
		canvas.addMouseMotionListener(mouseHandler); //canvas에 mouseMotion 부착
		mouseHandler.setcanvas(canvas);
		
		
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); //윈도우창 종료시 프로세스 자동 종료
		

	} /// end of main
} /// end of class
