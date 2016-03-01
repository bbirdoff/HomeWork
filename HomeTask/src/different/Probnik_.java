package different;

public class Probnik_ {
	public void method() {  } 
	 
	
	
    public class InnerClass { 
        public void method() {  } 
         
        public void anotherMethod() { 
            method();
            Probnik_.this.method();
        } 
    }
    
}
