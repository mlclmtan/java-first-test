public class myCircle {
    public static void main(String []args){
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}

class Circle{
    
     private double radius =1.0;
     private String color="red";
     
     public double getRadius() {
         return radius;
     }
     
     public double getArea() {
         return 2*Math.PI*radius;
     }
}
