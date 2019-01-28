
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Square background;
    private Square wall;
    private Square door;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        // initialise instance variables
         
        background = new Square();
        wall = new Square();
        door = new Square();
        window = new Square();
        roof = new Triangle();
        moon = new Circle();
        sun = new Circle();
        drawn = false;
    }
      /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-500);
            background.moveVertical(-500);
            background.changeSize(1000);
            background.changeColor("black");
            background.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            door.moveHorizontal(-90);
            door.moveVertical(100);
            door.changeSize(40);
            door.changeColor("red");
            door.makeVisible();
            
            window.changeColor("white");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(20);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
                        
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            moon.changeColor("white");
            moon.moveHorizontal(120);
            moon.moveVertical(-40);
            moon.changeSize(90);
            moon.makeVisible();
            drawn = true;
        }
    }
    }
    

  
