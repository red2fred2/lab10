import java.awt.Color;
import java.awt.Graphics;

/**
 * An object to be drawn
 */
class DrawableObject {
	
	protected Graphics graphics;
	protected Color color;
	
	/**
	 * 
	 * @param graphics
	 * 	specific graphics object
	 */
	public DrawableObject(Graphics graphics) {
		this.graphics = graphics;
		this.color = new Color(0);
	}
	
	/**
	 * 
	 * @param graphics
	 * 	specific graphics object
	 * @param color
	 * 	object color
	 */
	public DrawableObject(Graphics graphics, Color color) {
		this.graphics = graphics;
		this.color = color;
	}
	
	/**
	 * 
	 * @param graphics
	 * 	specific graphics object
	 * @param greyScale
	 * 	amount of white in color
	 */
	public DrawableObject(Graphics graphics, int greyScale) {
		this.graphics = graphics;
		this.color = new Color(greyScale);
	}
	
	/**
	 * 
	 * @param graphics
	 * 	specific graphics object
	 * @param red
	 * 	amount of red in color
	 * @param green
	 * 	amount of green in color
	 * @param blue
	 * 	amount of blue in color
	 */
	public DrawableObject(Graphics graphics, int red, int green, int blue) {
		this.graphics = graphics;
		this.color = new Color(red, green, blue);
	}
	
}