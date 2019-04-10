package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet



{	
	//Resistors resistors;

	ArrayList <Colour> colours = new ArrayList<Colour>();
	ArrayList <Resistors> resistors = new ArrayList<Resistors>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colours.add(c);
        }        
    }


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
		loadColours();
	}

	public void setup() 
	{
		resistors = new Resistors(this, 50, 50, 50, 50);
	}
	
	public void draw()
	{	
		resistors.draw();		
	}
}
