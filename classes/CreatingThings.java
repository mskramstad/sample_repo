public class CreatingThings {
    public static void main (String[] args) {
     
    String name = new String("John");
        
    Thing thing1 = new Thing("Apple", 15, 15, "RED");
    Thing thing2 = new Thing("Sky", 10000, 10000, "BLUE");
    Thing thing3 = new Thing("Waffle", 45,45, "YELLOW");

    thing1.doSomething();
    thing2.doSomething();
    thing3.doSomething();
    
    System.out.println(thing1.getLength());
    System.out.println(thing1.getWidth());
    thing1.setLength(5);
    thing1.setWidth(5);
    System.out.println(thing1.getLength());
    System.out.println(thing1.getWidth());
    }
}