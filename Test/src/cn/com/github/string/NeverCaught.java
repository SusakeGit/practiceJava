package cn.com.github.string;

public class NeverCaught {
        //运行时错误不需要异常说明，输出被报告给了System.err
	  static void f(){
		  throw new RuntimeException("From f()");
	  }
	  static void g(){
		  f();
	  }
	  public static void main(String[] args) {
		g();
	}
}
