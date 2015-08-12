

public class Complex {
	 
    private String re=null; 
   
 
    public Complex(String re) {
        this.re = "hello";
       
    }
 
    private String getre()
    {
    	return this.re;
    }
    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true  
        /*if (o == this) {
            return true;
        }*/
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        /*if (!(o instanceof Complex)) {
            return false;
        }*/
         
        // typecast o to Complex so that we can compare data members 
        Complex c = (Complex) o;
        
         
        // Compare the data members and return accordingly
        return this.getre().equals(c.getre());
        //return Double.compare(re, c.re) == 0
          //      && Double.compare(im, c.im) == 0;
    }
} 
// Driver class to test the Complex class
/*public class Complex {
    private String re = null;
    public Complex() {

        this.re = "Test String";

    }
    private String getre(){

        return this.re;

    }
    public boolean equals(Object obj) {

        Complex object = (Complex) obj;

        return this.getre().equals(object.getre());

    }

}*/
