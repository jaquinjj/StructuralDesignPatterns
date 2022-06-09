public class HelloWorld{
    
    public interface Category{
        void printWeight();
    }
    
    public class Sports implements Category
    {
        private Integer id;
        private String name;
    }
    
    public class Politics implements Category
    {
        private Integer id;
        private String name;
    }
    
    public class Other implements Category
    {
        private Integer id;
        private String name;
    }
    
    //Composite class. Contains collection of another
    public class HeadCar implements Category{
        private Integer id;
        private String name;
        private List<Category> childCategories;
    }
    
    
     
}
