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
	
	Tile[][] map = new Tile[mapSizeX][mapSizeY];
	
	
		
	public void init() {
		generateMap();
	}
	
	public void generateMap() {
		for (int i=0; i <10; i++) {
			createRoom( (int)(Math.random() * (mapSizeX-10)), (int)(Math.random() * (mapSizeY-10)), (int)(Math.random() * 10), (int)(Math.random() * 10));
		}
		createRoom (15,15,10,10);
	}
	
	public void createRoom(int xPos, int yPos, int sizeX, int sizeY) {
		for (int x = xPos; x<xPos+sizeX; x++) {
			for (int y = yPos; y<yPos+sizeY; y++) {
				map[x][y] = new Tile();
			}
		}
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		for (int x = 0; x<mapSizeX; x++) {
			for (int y = 0; y<mapSizeY; y++) {
				if (map[x][y]!=null)
					map[x][y].draw(g, x*10, y*10);
			}
		}
	}
}
