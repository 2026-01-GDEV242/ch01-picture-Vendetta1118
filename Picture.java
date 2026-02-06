/**
 * This represents a picture of my girlfriend and I looking at a mountain
 * range on our vacation to colorado. Shows in both black and white and back to color. 
 *
 * 
 * 
 * @author  Joseph Schiavone
 * @version 2026.02.06
 */
public class Picture
{
    private Square dirtPath;
    private Square grass1;
    private Square grass2;
    private Square sky;
    private Square mountainLine;
    private Triangle mountain1;
    private Triangle mountain2;
    private Triangle mountain3;
    private Triangle mountain4;
    private Triangle snowyPeak1;
    private Triangle snowyPeak2;
    private Triangle snowyPeak3;
    private Triangle snowyPeak4;
    private Circle sun;
    private Person me;
    private Person gf;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        grass1 = new Square();
        grass2 = new Square();
        dirtPath = new Square();
        sky = new Square();
        mountainLine = new Square();
        mountain1 = new Triangle();
        mountain2 = new Triangle();
        mountain3 = new Triangle();
        mountain4 = new Triangle();
        snowyPeak1 = new Triangle();
        snowyPeak2 = new Triangle();
        snowyPeak3 = new Triangle();
        snowyPeak4 = new Triangle();
        sun = new Circle();
        me = new Person();
        gf = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("tiffanyBlue");
            sky.moveHorizontal(-350);
            sky.moveVertical(-150);
            sky.changeSize(550);
            sky.makeVisible();
            
            grass2.changeColor("green");
            grass2.moveHorizontal(-350);
            grass2.moveVertical(100);
            grass2.changeSize(550);
            grass2.makeVisible();
            
            mountainLine.changeColor("dirtBrown");
            mountainLine.moveHorizontal(-360);
            mountainLine.moveVertical(75);
            mountainLine.changeSize(550);
            mountainLine.makeVisible();
            
            dirtPath.changeColor("dirtBrown");
            dirtPath.moveHorizontal(-360);
            dirtPath.moveVertical(130);
            dirtPath.changeSize(550);
            dirtPath.makeVisible();
            
            
            grass1.changeColor("green");
            grass1.moveHorizontal(-350);
            grass1.moveVertical(150);
            grass1.changeSize(550);
            grass1.makeVisible();
            
            
            mountain1.changeSize(60, 180);
            mountain1.moveHorizontal(-190);
            mountain1.moveVertical(20);
            mountain1.makeVisible();
            
            mountain2.changeSize(60, 180);
            mountain2.moveHorizontal(-50);
            mountain2.moveVertical(20);
            mountain2.makeVisible();
            
            
            mountain3.changeSize(60, 180);
            mountain3.moveHorizontal(100);
            mountain3.moveVertical(20);
            mountain3.makeVisible();
            
            mountain4.changeSize(60, 180);
            mountain4.moveHorizontal(250);
            mountain4.moveVertical(20);
            mountain4.makeVisible();
            
            snowyPeak1.changeSize(20, 60);
            snowyPeak1.changeColor("white");
            snowyPeak1.moveHorizontal(-190);
            snowyPeak1.moveVertical(20);
            snowyPeak1.makeVisible();
            
            snowyPeak2.changeSize(20, 60);
            snowyPeak2.changeColor("white");
            snowyPeak2.moveHorizontal(-50);
            snowyPeak2.moveVertical(20);
            snowyPeak2.makeVisible();
            
            snowyPeak3.changeSize(20, 60);
            snowyPeak3.changeColor("white");
            snowyPeak3.moveHorizontal(100);
            snowyPeak3.moveVertical(20);
            snowyPeak3.makeVisible();
            
            snowyPeak4.changeSize(20, 60);
            snowyPeak4.changeColor("white");
            snowyPeak4.moveHorizontal(250);
            snowyPeak4.moveVertical(20);
            snowyPeak4.makeVisible();
            
            
            sun.changeColor("yellow");
            sun.moveHorizontal(220);
            sun.moveVertical(-100);
            sun.changeSize(80);
            sun.makeVisible();
            
            me.moveVertical(25);
            me.makeVisible();
            
            gf.moveHorizontal(25);
            gf.moveVertical(25);
            gf.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        mountainLine.changeColor("black");
        mountain1.changeColor("black");
        mountain2.changeColor("black");
        mountain3.changeColor("black");
        mountain4.changeColor("black");
        snowyPeak1.changeColor("black");
        snowyPeak2.changeColor("black");
        snowyPeak3.changeColor("black");
        snowyPeak4.changeColor("black");
        grass2.changeColor("black");
        dirtPath.changeColor("white");
        grass1.changeColor("black");
        sun.changeColor("black");
        me.changeColor("white");
        gf.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("tiffanyBlue");
        grass2.changeColor("green");
        mountainLine.changeColor("dirtBrown");
        dirtPath.changeColor("dirtBrown");
        grass1.changeColor("green");
        mountain1.changeColor("green");
        mountain2.changeColor("green");
        mountain3.changeColor("green");
        mountain4.changeColor("green");
        snowyPeak1.changeColor("white");
        snowyPeak2.changeColor("white");
        snowyPeak3.changeColor("white");
        snowyPeak4.changeColor("white");
        sun.changeColor("yellow");
        me.changeColor("black");
        gf.changeColor("black");
    }
}
