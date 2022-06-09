public class HelloWorld{
    
    public interface Converter{
        File convert();
    }
    
    public class MP4Converter implements Converter{
        
    }
    
    public class AviConverter implements Converter{
        
    }
    
    public class FileReader{
        
    }
    
    public class FileWriter{
        
    }
    
    
    public class VideoConverter // Facade Design Pattern
    {
        public boolean convertFile(File file)
        {
            Converter converter;
            if(file.getType() == ".mp4")
            {
                converter = new MP4Converter(file);
            }
            else
            {
                converter = new AviConverter(file);
            }
            
            File file = converter.convert();
            FileWriter.write(file)
            
            
            
            
            return true;
        }
    }
    
    
    
    

     public static void main(String []args){
        System.out.println("Hello, World!");
     }
}
