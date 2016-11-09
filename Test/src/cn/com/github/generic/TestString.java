package cn.com.github.generic;

import java.io.UnsupportedEncodingException;

public class TestString {
    
	public static void main(String[] args) throws UnsupportedEncodingException {

        String param = "哈喽Kitty";
        String charset;
        
        charset = new String(param.getBytes("GBK")); //乱码
        System.out.println(charset);
        
        charset = new String(param.getBytes("GB2312")); //乱码
        System.out.println(charset);
        
        charset = new String(param.getBytes("ISO-8859-1")); //乱码
        System.out.println(charset);
        
        charset = new String(param.getBytes("UTF-8")); //正常
        System.out.println(charset);
        
        charset = new String(param.getBytes("UTF-16")); //乱码
        System.out.println(charset);
        
        param = new String(param.getBytes("UTF-8"), "ISO-8859-1"); //中文乱码
        System.out.println(param);
        
        //解决中文乱码
        param = new String(param.getBytes("ISO-8859-1"), "UTF-8"); //恢复正常
        System.out.println(param);
        
        String param1 = "Rose";
        String param2 = "Rose";
        String param3 = "Ro"+"se";
        System.out.println(param1 == param2);
        System.out.println(param2 == param3);
    }
}
