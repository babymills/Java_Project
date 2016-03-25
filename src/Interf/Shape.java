package Interf;

/**
 * Created by IT_School on 18.10.2015.
 */
public abstract class Shape {
    protected String color = "red";
    public abstract void draw();
    public Shape(String color){
        this.color = color;
    }
}
