package frame;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PaintFrame {
	
	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setSize(900, 700);
		jframe.setTitle("Drawing Book");
		jframe.setLocationRelativeTo(null); //jframe 가운데 팝업설정

		//절대 경로: C:\\workspace_java\\paint_java\\imageFile\\JFIcon.png
		//상대 경로: ../../resource/image/JFIcon.png   (상위의 상위)
		ImageIcon imageIcon = new ImageIcon("resource/image/JFIcon.png"); // 윈도우창 이미지 아이콘 설정
		jframe.setIconImage(imageIcon.getImage());
		
		DrawingCanvas canvas = new DrawingCanvas();
		canvas.setSize(900, 700);
		jframe.add(canvas);
		canvas.setBackground(Color.white);
		
		
		MouseHandler mouseHandler = new MouseHandler();
		
		canvas.addMouseMotionListener(mouseHandler); //canvas에 mouseMotion 부착
		mouseHandler.setcanvas(canvas);
		
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); //윈도우창 종료시 프로세스 자동 종료
		

	} /// end of main
} /// end of class
