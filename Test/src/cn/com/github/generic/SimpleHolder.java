package cn.com.github.generic;

public class SimpleHolder<T> {
 
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
	public static void main(String[] args) {
		SimpleHolder<String> holder = new SimpleHolder<String>();
		holder.setObj("Item");
		String s = (String)holder.getObj();
	}
}
