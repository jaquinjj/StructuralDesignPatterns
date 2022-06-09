public class HelloWorld{
    
    public interface Tree{
        String decorate();
    }
    
    public class TreeImpl implements Tree{
        @Override
        public String decorate()
        {
            return "Tree";
        }
    }
    
    public abstract class TreeDecorator implements Tree{
        private Tree tree;
        public TreeDecorator(Tree tree)
        {
            this.tree = tree;     
         }
         
         @Override
         public String decorate()
         {
             return tree.decorate();
         }
    }
    
    public class AppleTree extends TreeDecorator
    {
        public AppleTree(Tree tree){
            super(tree);
        }
        
        public String decorate(){
            return super.decorate()+" "+decorateWithAnotherObjects();
        }
        
        
        public String decorateWithAnotherObjects()
        {
            return "Apple Tree";
        }
    }

     public static void main(String []args){
        System.out.println("Hello, World!");
     }
}
