package cn.com.github.generic;

public class GenericMethods {

	
	  public <T> void f(T x){
		  System.out.println(x.getClass().getName());
	  }
	   
	  public static void main(String[] args) {
		GenericMethods gMethods = new GenericMethods();
		gMethods.f("");
		gMethods.f(1);
		gMethods.f(1.0);
		gMethods.f(1.0F);
		gMethods.f('C');
		gMethods.f(gMethods);
	}
}
