  import java.util.Arrays;
  import java.util.List;

  abstract class Shape{
    abstract void draw();
  }

  class Rectangle extends Shape{
  @Override
  public void draw(){
  System.out.println(" Rectangle method");
  }
  }
  class Circle extends Shape{
  @Override
  public void draw(){
  System.out.println("Circle method");
  }
  }

  public class Test{
      private static void  TestMethod(List<? extends Shape> list){
          for (Shape shape : list) {
              shape.draw(); 
          }
      }
       public static void main(String args[]){
       List<Rectangle> Rectangle=Arrays.asList(new Rectangle() , new Rectangle());
       List<Circle> circle=Arrays.asList(new Circle (),new Circle());
       TestMethod(Rectangle);
       TestMethod(circle);
       

  }
  }
