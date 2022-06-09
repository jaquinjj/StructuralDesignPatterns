public class HelloWorld{
    public interface Color{
        boolean apply();
    }
    

    
    public class Red implements Color{
        @Override
        public boolean apply()
        {
            return true;
        }
    }
    
    
    public class Blue implements Color{
        @Override
        public boolean apply()
        {
            return true;
        }
    }
    
    
    public abstract class Shape{ // Bridge
        Color color;
        public Shape(Color color)
        {
            this.color = color;
        }
    }
    
    public class Rectangle extends Shape{
        public Rectangle(Color color)
        {
            super(color);
        }
    }
    
    public class Square extends Shape{
        public Square(Color color)
        {
            super(color);
        }
    }
    
    
 
     public static void main(String args[])
    {
        new Rectangle(new Red());
  
    }
 
}
