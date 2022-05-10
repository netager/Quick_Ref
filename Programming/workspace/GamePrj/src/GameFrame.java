import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawRect(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
		g.drawRect(100, 200, 200, 100);
	}
}
