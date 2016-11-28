package cn.com.github.base1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class SoFtReference {
	String str = new String("hello");
	// 创建软引用队�?
	ReferenceQueue<String> req = new ReferenceQueue<String>();
	// 创建弱引用队�?
	WeakReference<String> weak = new WeakReference<String>(str, req);
	// 取消强引�?,eclipse自动�?测弱引用报错
	// str = null;
	// System.gc();
	// System.gc();
	String str1 = weak.get();

	public static void main(String[] args) {
    SoFtReference soft 	=   new SoFtReference();
    System.out.println(soft.str1);
	}
}
