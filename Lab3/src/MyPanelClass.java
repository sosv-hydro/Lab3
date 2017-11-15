import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.right;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		/*
		 * int xx1 = this.getWidth() - myInsets.right; int yy1 = myInsets.top; int xx2 =
		 * myInsets.bottom; int yy2 = this.getHeight() - myInsets.left;
		 */
		int xx2 = (this.getWidth() - myInsets.right) / 2;
		int yy2 = this.getHeight() / 2;
		int xx1 = myInsets.bottom;
		int yy1 = this.getHeight() - myInsets.left;

		int ovalHeight = 55;
		int ovalWidth = 55;

		// Paint the background
		g.setColor(Color.BLUE);
		g.fillRect(x1, y1, width + 1, height + 1);getSize();
		
		int rect = 0;
		for (int i = 0; i < 6; i++) {
			if((i+1)% 2 == 0) {
			g.setColor(Color.RED);
			} else { g.setColor(Color.WHITE);}
			
			g.fillRect(x1, y1+rect, width + 1, (height + 1) / 5);
			rect = i*(height + 1) / 5;
		}

		// g.setColor(Color.YELLOW);
		// g.drawRect(x1, y1, width, height);
		// g.setColor(Color.WHITE);
		// g.drawRect(x1+5, y1+5, width-10, height-10);
/*
		g.setColor(Color.RED);
		g.drawLine(x1, y1, xx2, yy2);
		g.setColor(Color.CYAN);
		g.drawLine(xx1, yy1, xx2, yy2);
*/
		/*
		 * g.setColor(Color.LIGHT_GRAY); g.fillOval((this.getWidth() - ovalWidth) / 2,
		 * (this.getHeight() - ovalHeight) / 2, 55, 55);
		 */
		/*Polygon p = new Polygon();
		p.addPoint(x1 + 5, y1 + 25);
		p.addPoint(x1 + 20, y1 + 10);
		p.addPoint(x1 + 35, y1 + 25);
		p.addPoint(x1 + 25, y1 + 25);
		p.addPoint(x1 + 25, y1 + 45);
		p.addPoint(x1 + 15, y1 + 45);
		p.addPoint(x1 + 15, y1 + 25);
		g.setColor(Color.YELLOW);
		g.fillPolygon(p);
*/
		
		Polygon tria = new Polygon();
		tria.addPoint(0, 0);
		tria.addPoint(width/2, height/2);
		tria.addPoint(0, height);
		g.setColor(Color.BLUE);
		g.fillPolygon(tria);
		
		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25*(this.getWidth()/181), y1 + 73*(this.getHeight()/153));
		p2.addPoint(x1 + 41*(this.getWidth()/181), y1 + 73*(this.getHeight()/153));
		p2.addPoint(x1 + 47*(this.getWidth()/181), y1 + 58*(this.getHeight()/153));
		p2.addPoint(x1 + 53*(this.getWidth()/181), y1 + 73*(this.getHeight()/153));
		p2.addPoint(x1 + 69*(this.getWidth()/181), y1 + 73*(this.getHeight()/153));
		p2.addPoint(x1 + 56*(this.getWidth()/181), y1 + 83*(this.getHeight()/153));
		p2.addPoint(x1 + 61*(this.getWidth()/181), y1 + 98*(this.getHeight()/153));
		p2.addPoint(x1 + 47*(this.getWidth()/181), y1 + 88*(this.getHeight()/153));
		p2.addPoint(x1 + 34*(this.getWidth()/181), y1 + 98*(this.getHeight()/153));
		p2.addPoint(x1 + 38*(this.getWidth()/181), y1 + 83*(this.getHeight()/153));
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);
		
		System.out.println(this.getHeight());
	}
}