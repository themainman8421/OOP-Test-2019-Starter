package ie.tudublin;

import processing.data.TableRow;

public class Colour
{

    public Colour(TableRow tr) {
	}

	public void draw()
    {
	    for(int i = 0 ; i < Colour.size() ; i ++)
        {
            Colour c = Colour.get(i);
            float y = border + (i * (buttonHeight + gap));
            float x = border;
            
            text(c.getName(),  x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
        }
    }


}
