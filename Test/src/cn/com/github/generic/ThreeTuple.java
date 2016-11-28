package cn.com.github.generic;

public class ThreeTuple<A,B,C> extends TwoTuple<A, B>{
  
	 public final C third;

	public ThreeTuple(A a, B b, C third) {
		super(a, b);
		this.third = third;
	}

	@Override
	public String toString() {
		return "ThreeTuple [third=" + third + second+first+"]";
	}

	
}

class fourthTuple<A,B,C,D> extends ThreeTuple<A, B, C>{
	public final D fourth;

	public fourthTuple(A a, B b, C third, D fourth) {
		super(a, b, third);
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return "fourthTuple [fourth=" + fourth + third+second+first+"]";
	}

	
	
	
}
