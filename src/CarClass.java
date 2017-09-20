/*
Class Name: GUI
Class Author: Raelene Gomes
******************************************************
This class contains the methods to set and get the values of the CarClass.
It also contains methods to both increase and decrease the speed.
******************************************************
Sept 12, 2017
******************************************************
Sept 13, 2017 - add String color and corresponding methods
Sept 14, 2017 - remove String color and corresponding methods
****************************************************** 
I was very happy with how simple the brake/accelerate methods were
*/
import java.awt.Color;


/**
 *
 * @author rg034
 */
public class CarClass {
    private String make;
    private String model;
    private Color color;
    private int speed;
    
    //constructor
    public CarClass(String make, String model, Color color)  //Color color
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }
    
    /******************************************************
    Method Name: getMake()
    Method Author: Raelene Gomes
    ******************************************************
    Purpose of the Method: This method gets the make of the car
    Method Inputs: none
    Return value: String make
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public String getMake()
    {   
        return make;
    }

    /******************************************************
    Method Name: setMake(String make)
    Method Author: Raelene Gomes 
    ******************************************************
    This method sets the make of the car to the value the user input, which is
    passed to it from the GUI class.
    Method Inputs: String make
    Return value: void
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public void setMake(String make)
    {
        this.make = make;
    }

    /******************************************************
    Method Name: getModel()
    Method Author: Raelene Gomes 
    ******************************************************
    This method gets the model of the car
    Method Inputs: none
    Return value: String model
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public String getModel()
    {
        return model;
    }

    /******************************************************
    Method Name: setModel(String model)
    Method Author: Raelene Gomes 
    ******************************************************
    This method sets the model of the car to the value the user input, which is
    passed to it from the GUI class.
    Method Inputs: String model
    Return value: void
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public void setModel(String model)
    {
        this.model = model;
    }

    /******************************************************
    Method Name: getColor()
    Method Author: Raelene Gomes 
    ******************************************************
    This method gets the color of the car
    Method Inputs: none
    Return value: Color color
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public Color getColor() 
    {
        return color;
    }

    /******************************************************
    Method Name: setColor(Color color)
    Method Author 
    ******************************************************
    This method sets the color of the car to the value the user input, which is
    passed to it from the GUI class.
    Method Inputs: Color color
    Return value: void
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public void setColor(Color color)
    {        
        this.color = color;
    }

    /******************************************************
    Method Name: getSpeed()
    Method Author: Raelene Gomes 
    ******************************************************
    This method gets the speed
    Method Inputs: none
    Return value: int speed
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public int getSpeed()
    {
        return speed;
    }
    
    /******************************************************
    Method Name: accelerate(int speed)
    Method Author: Raelene Gomes 
    ******************************************************
    This method increases the speed by 5
    Method Inputs: int speed
    Return value: void
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public void accelerate(int speed)
    {
        this.speed = speed + 5;
    }

    /******************************************************
    Method Name: brake(int speed)
    Method Author: Raelene Gomes 
    ******************************************************
    This method decreases the speed by 5. It will no go less than 0.
    Method Inputs: int speed
    Return value: void
    ******************************************************‘*** 
    Sept 12, 2017
    ******************************************************/
    public void brake(int speed)
    {
        //no negative speed, so only -5 when speed is at least 5
        if(this.speed >= 5)
        {
            this.speed = speed - 5;
        }
        else
        {
            this.speed = 0;
        }
    }

}
