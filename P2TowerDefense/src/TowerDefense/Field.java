package TowerDefense;

import java.awt.Dimension;

import javax.swing.JPanel;
/**
 * This class represents one Field of the Game.
 * It has an Position and can be occupied.
 * The Game-Field is a grid, built with many Fields.
 * @author Bettina
 *
 */
public class Field 
{
	private boolean occupied;
	private int  xPos,yPos;	
	/**
	 * A Field is created with an x and a y value
	 * @param xPos defines the position on the x-axis
	 * @param yPos defines the position on the y-axis
	 */
	public Field(int xPos, int yPos)
	{
		occupied = false;	
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	/**
	 * @return Returns this Field's position on the x-Axis
	 */
	public int getXPos() 
	{
		return xPos;
	}

	/**
	 * @return Returns this Field's position on the y-Axis
	 */
	public int getYPos() 
	{
		return yPos;
	}

	/**
	 * @return Returns true if this Field is occupied
	 */
	public boolean isOccupied() 
	{
		return occupied;
	}
	
	/**
	 * sets this Field's status to occupied
	 */
	public void setOccupied() 
	{
		this.occupied = true;
	}
}