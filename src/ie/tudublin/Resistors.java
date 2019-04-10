package ie.tudublin;

import processing.data.TableRow;

public class Resistors
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float x2;
    private float y2;
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistors (UI ui, float x, float y, float width, float height, float x2, float y2)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.height = height;
        this.width = width;
    }

    

	public Resistors(TableRow tr) {
	}



	public void draw()
    {
        //ui.fill(123);
        ui.rect(x, y, width, height);
        ui.line(x - 50, y + 50, x2 + 175, y2 + 150);
       ui.line(x + 125, y + 50, x2 + 350, y2 + 150);

        ui.rect(x, y + 150, width, height);
        ui.line(x - 50, y + 200, x2 + 175, y2 + 300);
        ui.line(x + 125, y + 200, x2 + 350, y2 + 300);

        ui.rect(x, y + 300, width, height);
        ui.line(x - 50, y + 350, x2 + 175, y2 + 450);
        ui.line(x + 125, y + 350, x2 + 350, y2 + 450);

        ui.rect(x, y + 450, width, height);
        ui.line(x - 50, y + 500, x2 + 175, y2 + 600);
        ui.line(x + 125, y + 500, x2 + 350, y2 + 600);

        /*
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
        */
    }

    public void update()
    {
        
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
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the x2
     */
    public float getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(float x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public float getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(float y2) {
        this.y2 = y2;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

}