package janelas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fundo extends JPanel implements ActionListener {
	private Image fundo;
	private Timer timer;

	public Fundo() {
		setFocusable(true);
		setDoubleBuffered(true);

		ImageIcon referencia = new ImageIcon("recursos/fundo.png");
		fundo = referencia.getImage();

		timer = new Timer(20, this);
		timer.start();
	}

	@Override

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		g.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}