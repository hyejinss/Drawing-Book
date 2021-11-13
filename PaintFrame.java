package frame;

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
		ImageIcon imageIcon = new ImageIcon("../../resource/image/JFIcon.png");
		jframe.setIconImage(imageIcon.getImage());
		
		
		System.out.println(System.getProperty("user.dir"));

	} /// end of main
} /// end of class
