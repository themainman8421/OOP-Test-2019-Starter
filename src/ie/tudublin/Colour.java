package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    UI ui;
    public int r;
    public int g;
    public int b;
    public float value;
    private String colour;

    public Colour(UI ui, String colour)
    {

    } 
	

	public Colour(TableRow tr) {
	}


	public void draw()
    {
        
	    for(int i = 0 ; i < Colour.size() ; i ++)
        {
            Colour c = Colour.get(i);
            
            
            
        }
        
    }

    private static Colour get(int i) {
        return null;
    }

    private static int size() {
        return 0;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }


}
