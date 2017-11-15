import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.right;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        int xx1 = this.getWidth() - myInsets.right;
                        int yy1 = myInsets.top;
                        int xx2 = myInsets.bottom;
                        int yy2 = this.getHeight()-myInsets.left;
                        
                        int ovalHeight = 55;
                        int ovalWidth = 55; 
                        //Paint the background
                        g.setColor(Color.BLUE);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
//                        
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.CYAN);
//                        g.drawLine(xx1, yy1, xx2, yy2);
                        
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((this.getWidth()-ovalWidth)/2 , (this.getHeight()-ovalHeight)/2
                        		, 55, 55);
            }
}