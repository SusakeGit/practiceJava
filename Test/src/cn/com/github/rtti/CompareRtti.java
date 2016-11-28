package cn.com.github.rtti;

class Base{}

class Derived extends Base{}


public class CompareRtti {
    static void test(Object x){
    	System.out.println("Type of x:"+x.getClass());
    	System.out.println("x instanceof Base:" + (x instanceof Base));
    	System.out.println("Base.isInstanceof(x):"+Base.class.isInstance(x));
    	System.out.println("Derived.isInstanceof(x):"+Derived.class.isInstance(x));
    	System.out.println("x.getClass() == Base.class:"+(x.getClass() == Base.class));
    	System.out.println("x.getClass() == Derived.class:"+(x.getClass() == Derived.class));
    	System.out.println("x.getClass().equals(Derived.class):"+(x.getClass().equals(Derived.class)));    
    	System.out.println("x.getClass().equals(Base.class):"+(x.getClass().equals(Base.class)));
    }
    
    public static void main(String[] args) {
		test(new Base());
		test(new Derived());
	}
}
