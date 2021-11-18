package frame;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	
	private Color color; 
	
	
	//static 밖에 선언된 전역변수들을 static인 main메소드에서 사용할 경우 동일하게 static으로 명시해야 한다
	//main메소드 전에 선언된 변수들은 프로그램 실행 전부터 메모리에 세팅된다
	
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
		
		MenuBar menuBar = new MenuBar(); //메뉴바 생성
		Menu file = new Menu("FILE");
		MenuItem file_new = new MenuItem("NEW");
		MenuItem file_open = new MenuItem("OPEN");
		MenuItem file_save = new MenuItem("SAVE");
		MenuItem file_exit = new MenuItem("EXIT");
		
		jframe.setMenuBar(menuBar); //프레임에 메뉴바 셋팅
		
		//하단 메뉴 추가
		menuBar.add(file);
		file.add(file_new);
		file.add(file_open);
		file.add(file_save);
		file.add(file_save);
		file.add(file_exit);
		
		MouseHandler mouseHandler = new MouseHandler();
		
		canvas.addMouseListener(mouseHandler);
		canvas.addMouseMotionListener(mouseHandler); //canvas에 mouseMotion 부착
		mouseHandler.setcanvas(canvas);

		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); //윈도우창 종료시 프로세스 자동 종료
		

	} /// end of main
} /// end of class
