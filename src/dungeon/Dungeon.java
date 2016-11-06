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
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	int mapSizeX = 40;
	int mapSizeY = 40;
	
	int[][] map = new int[mapSizeX][mapSizeY];
	
	
		
	public void init() {
		generateMap();
	}
	
	public void generateMap() {
		for (int i=0; i <10; i++) {
			createRoom( (int)(Math.random() * (mapSizeX-10)), (int)(Math.random() * (mapSizeY-10)), (int)(Math.random() * 10), (int)(Math.random() * 10));
		}
	}
	
	public void createRoom(int xPos, int yPos, int sizeX, int sizeY) {
		System.out.println(xPos);
		System.out.println(yPos);
		System.out.println(sizeX);
		System.out.println(sizeY);
		for (int x = xPos; x<xPos+sizeX; x++) {
			for (int y = yPos; y<yPos+sizeY; y++) {
				map[x][y] = 1;
				System.out.print("*");
			}
		}
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		for (int x = 0; x<mapSizeX; x++) {
			for (int y = 0; y<mapSizeY; y++) {
				switch (map[x][y]) {
					case 1 : {
						g.drawRect(x*20, y*20, 20, 20);
						break;
					}
					default : { 
						break;
					}				
				}
				
			}
		}
	}
}
