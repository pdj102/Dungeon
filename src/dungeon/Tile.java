package dungeon;

import java.awt.Color;
import java.awt.Graphics;

public class Tile {
	
	public Color col; 
	
	
	Tile() {
		
	col = Color.black;
	}

	public void draw(Graphics g, int x, int y) {
		g.fillRect(x, y, 10, 10);
	}
}
