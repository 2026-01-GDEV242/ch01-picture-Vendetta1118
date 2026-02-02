/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square grass;
    private Square dirtPath;
    private Triangle roof;
    private Circle sun;
    private Person me;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        grass = new Square();
        dirtPath = new Square();
        roof = new Triangle();  
        sun = new Circle();
        me = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-350);
            grass.moveVertical(130);
            grass.changeSize(550);
            grass.makeVisible();
            
            dirtPath.changeColor("black");
            dirtPath.moveHorizontal(-250);
            dirtPath.moveVertical(120);
            dirtPath.changeSize(100);
            dirtPath.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            me.moveVertical(40);
            me.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        grass.changeColor("black");
        dirtPath.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        grass.changeColor("green");
        dirtPath.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
