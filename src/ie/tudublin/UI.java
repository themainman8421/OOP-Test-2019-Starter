package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet



{	
	Resistors resistor;

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
	
	void loadResisters()
    {
        Table table = loadTable("resistors.csv", "header");
        for(TableRow tr:table.rows())
        {
            Resistors r = new Resistors(tr);
            resistors.add(r);
        }        
    }


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
		loadColours();
		loadResisters();
	}

	public void setup() 
	{
		resistor = new Resistors(this, 50, 50, 50, 50);
	}
	
	public void draw()
	{	
		//resistor.draw();
		for(int i = 0 ; i < colours.size() ; i ++)
		{
			System.out.println(colours.get(i));
		}		
	}

	public void findColour(int value)
	{
		for(int i = value; i < colours.size(); i++ )
		{
			System.out.println(value);
		}
	}
}
