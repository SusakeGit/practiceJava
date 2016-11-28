package cn.com.github.generic;


class Buiding{}

class House extends Buiding{}

public class ClassTypeCapture <T>{
     
	  Class<T> kind;

	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}
	
	public static void main(String[] args) {
		ClassTypeCapture<Buiding> build = new 
				ClassTypeCapture<Buiding>(Buiding.class);
		
		System.out.println(build.f(new Buiding()));
		System.out.println(build.f(new House()));
		
		ClassTypeCapture<House> build2 = new 
				ClassTypeCapture<House>(House.class);
		
		System.out.println(build2.f(new Buiding()));
		System.out.println(build2.f(new House()));
	}
}
