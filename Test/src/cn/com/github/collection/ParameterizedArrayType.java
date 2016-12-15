package cn.com.github.collection;

class classParameter<T>{
	public T[] f(T[] arg){
		return arg;
	}
}

class MethodParamenter{
	public static<T> T[] f(T[] arg){
		return arg;
	} 
}

public class ParameterizedArrayType {
    
	public static void main(String[] args) {
		Integer[] ints = {1,2,3,4,5};
		Double[] doubles = {1.1,2.2,3.3};
		
		Integer[] ints2 = new classParameter<Integer>().f(ints);
		Double[] doubles2 = new classParameter<Double>().f(doubles);
		ints2 = MethodParamenter.f(ints);
		doubles2 = MethodParamenter.f(doubles);
	}
}
