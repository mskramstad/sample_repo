import java.awt.Color;

public class Thing {
    private String name;
    private int length;
    private int width;
    private String color;
    
    public Thing () {
        this.name = "";
        this.length = 0;
        this.width = 0;
        this.color = "BLACK";
    } // constructor that takes receives nothing
    
    public Thing(String name, int l, int w, String color) {
        this.name = name;
        this.length = l;
        this.width = w;
        this.color = color;
    }
    
    public String toString() {
        return this.name;
    }
    
    public void doSomething() {
        System.out.println("I am the color: " + this.color);
    }
    
    //getter for length
    public int getLength() {
    return this.length;    
    }
    
    //getter for height
    public int getWidth() {
    return this.width;
    }
    
    //setter for length
    public void setLength(int len) {
    this.length = len;    
    }
    
    //setter for height
    public void setWidth(int w) {
    this.width = w;
    }
   
}