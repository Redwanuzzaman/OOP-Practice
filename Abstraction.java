// GOOD PRACTICE

public class Car 
{ 
    Engine engine = new Engine(); 
    Wheel wheel = new Wheel(); 
    int price; 
    String name; 
    String color; 
    void move()
    { 
        //move forward 
    }
}
 
public class Engine 
{ 
    int engineCapacity; 
    int engineHorsePower; 

    void internalCombustion()
    { 
        //Engine Method 
    }
} 
public class Wheel 
{ 
    String wheelName; 
    int wheelPrice; 

    void rotate()
    { 
        //Wheels method 
    }
}

/*You can see that the attributes and methods related to the Engine and Wheel are moved to the respective classes.
Engine and Wheel are referred from the Car type. 
When ever an instance of Car is created, 
both Engine and Wheel will be available for the Car 
and when there are changes to these Types(Engine and Wheel), 
changes will only be confined to these classes and will not affect the Car class.
*/



// BAD PRACTICE

public class Car 
{ 
    int price; 
    String name; 
    String color; 
    int engineCapacity; 
    int engineHorsePower; 
    String wheelName; 
    int wheelPrice; 
    void move()
    { 
        //move forward 
    } 
    void rotate()
    { 
        //Wheels method 
    } 
    void internalCombustion()
    { 
        //Engine Method 
    }
}

/*In the above example, the attributes of wheel and engine are added to the Car type. 
As per the programming, this will not create any kind of issues. 
But when it comes to maintenance of the application, this becomes more complex.
*/
