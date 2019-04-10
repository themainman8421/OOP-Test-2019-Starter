package ie.tudublin;

public class Resistors
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Resistors (UI ui, float x, float y, float width, float height)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void draw()
    {
      ui.rect(x, y, width, height);
      ui.rect(x, y + 50, width, height);
      ui.rect(x, y + 100, width, height);
      ui.rect(x, y + 200, width, height);
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

}