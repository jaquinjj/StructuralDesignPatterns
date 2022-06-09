public class HelloWorld{
    
    public interface Car{
        double getWeight();
    }
    
    public static class Mercedes implements Car{
        @Override
        public double getWeight(){
            return 30000;
        }
    }
    
     public static class BMW implements Car{
        @Override
        public double getWeight(){
            return 40000;
        }
    }
    
    
    public interface CarAdapter
    {
        double getWeight();
    }
    
    public static class CarAdapterImpl implements CarAdapter
    {
        Car car;
        public CarAdapterImpl(Car car)
        {
            this.car = car;
        }
        
        @Override
        public double getWeight(){
            return gramsToKilograms(car.getWeight());
        }
        
        
        public double gramsToKilograms(double weight)
        {
            return weight/1000;
        }
        
        
    }
    
    
    
    
     public static void main(String []args){
         Car mercedes = new Mercedes();
         Car bmw = new BMW();
         
         CarAdapter mercedesCarAdapter = new CarAdapterImpl(mercedes);
         CarAdapter bmwCarAdapter = new CarAdapterImpl(bmw);
         
         
         
        System.out.println(mercedesCarAdapter.getWeight());
        System.out.println(bmwCarAdapter.getWeight());

     }
}
