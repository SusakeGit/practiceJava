package cn.com.github.string;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very Important Exception";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trival Exception";
	}
}
//null，jdk8已经修正了这个错误
public class SpecialException {
      void f() throws VeryImportantException{
    	   	 throw new VeryImportantException();
      }  
      void dispose() throws HoHumException{
    	  throw new HoHumException();
      }
      public static void main(String[] args) {
    	  
		try {
			SpecialException sException = new SpecialException();
			try {
				sException.f();
			}finally {
				sException.dispose();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

