package source;

import javax.swing.JFrame;
//add inheritance for class so don`t need to make obj or variable name
public class MainMenuFrame extends JFrame {
	public static final int HEIGHT = 720, WIDTH = 640;

	public MainMenuFrame() {
		setTitle("Game Legendaris Klasik Balok Susun Lucu Warna-warni Hanya menyerupai Tapi Bukan TETRIS 2019");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		add(new MainMenuPanel());
		setVisible(true);

	}

	public static void main(String[] args) {
		new MainMenuFrame();
	}

}
