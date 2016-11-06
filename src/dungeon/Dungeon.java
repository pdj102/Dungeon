/**
 * 
 */
package dungeon;

import java.awt.*;

import javax.swing.JApplet;

/**
 * @author Paul
 *
 */
public class Dungeon extends JApplet{

	/**
	 * @param args
	 */
		
	public void init() {
	}
	
	public void paint(Graphics g) {
	    g.drawString("Loveliest of trees, the cherry now", 25, 30);
	    g.drawString("Is hung with bloom along the bough,", 25, 50);
	    g.drawString("And stands about the woodland ride", 25, 70 );
	    g.drawString("Wearing white for Eastertide." ,25, 90);
	    g.drawString("--- A. E. Housman" ,50, 130);
	}

}
