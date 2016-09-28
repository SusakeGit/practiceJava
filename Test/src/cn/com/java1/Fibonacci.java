package cn.com.java1;

import java.math.BigInteger;


public class Fibonacci {


    /** 
     *  
     * ���õݹ鷽��ʵ�� 
     *  
     * ��int���͵Ļ��������Լ����f(46) = 1836311903, ����f(47)ʱ�ͻ��������� 
     * f(42) = 267914296 
     * f(43) = 433494437 
     * f(44) = 701408733 
     * f(45) = 1134903170 
     * f(46) = 1836311903 
     * f(47) = -1323752223 
     *  
 
     *  
     * @return ���ص�n��쳲������� 
     */  
    public int fibonacci1(int n) {  
        if (1 == n || 2 == n) {  
            return 1;  
        } else {  
            return fibonacci1(n - 1) + fibonacci1(n - 2);  
        }  
    }  
  
    /** 
     *  
     * ���÷ǵݹ鷽��ʵ�֣�Ч�ʱȵݹ鷽��Ҫ�ߺܶࡣ 
     *  
     * ��int���͵Ļ��������Լ����f(46) = 1836311903, ����f(47)ʱ�ͻ��������� 
     * f(42) = 267914296 
     * f(43) = 433494437 
     * f(44) = 701408733 
     * f(45) = 1134903170 
     * f(46) = 1836311903 
     * f(47) = -1323752223 
     *  
 
     *  
     * @return ���ص�n��쳲������� 
     */  
    public int fibonacci2(int n) {  
        if (1 == n || 2 == n) {  
            return 1;  
        }  
        int num1 = 1;  
        int num2 = 1;  
        int temp = 0;  
        for (int i = 2; i < n; i++) {  
            temp = num2;  
            num2 += num1;  
            num1 = temp;  
        }  
        return num2;  
    }  
  
    /** 
     *  
     * ���õݹ鷽��ʵ�� 
     *  
     * ��long���͵Ļ��������Լ����f(92) = 7540113804746346429, ����f(93)ʱ�ͻ��������� 
     * f(90) = 2880067194370816120 
     * f(91) = 4660046610375530309 
     * f(92) = 7540113804746346429 
     * f(93) = -6246583658587674878 
     *  
 
     *  
     * @return ���ص�n��쳲������� 
     */  
    public long fibonacci3(int n) {  
        if (1 == n || 2 == n) {  
            return 1;  
        } else {  
            return fibonacci3(n - 1) + fibonacci3(n - 2);  
        }  
    }  
  
    /** 
     *  
     * ���÷ǵݹ鷽��ʵ�֣�Ч�ʱȵݹ鷽��Ҫ�ߺܶࡣ 
     *  
     * ��long���͵Ļ��������Լ����f(92) = 7540113804746346429, ����f(93)ʱ�ͻ��������� 
     * f(90) = 2880067194370816120 
     * f(91) = 4660046610375530309 
     * f(92) = 7540113804746346429 
     * f(93) = -6246583658587674878 
     *  
 
     *  
     * @return ���ص�n��쳲������� 
     */  
    public long fibonacci4(int n) {  
        if (1 == n || 2 == n) {  
            return 1;  
        }  
        long num1 = 1;  
        long num2 = 1;  
        long temp = 0;  
        for (int i = 2; i < n; i++) {  
            temp = num2;  
            num2 += num1;  
            num1 = temp;  
        }  
        return num2;  
    }  
      
    /** 
     *  
     * ���÷ǵݹ�ķ�ʽ��ʵ�֣�ͬʱ����BigInteger��ʵ�֡� 
     *  
     *  
 
     * @return ���ص�n��쳲������� 
     */  
    public BigInteger populateWithoutRecursion(int n){  
        if (1 == n || 2 == n) {  
            return new BigInteger("1");  
        }  
        BigInteger num1 = new BigInteger("1");  
        BigInteger num2 = new BigInteger("1");  
        BigInteger temp = new BigInteger("0");  
        for(int i=2;i<n;i++){  
            temp = num2;  
            num2 = num2.add(num1);  
            num1 = temp;  
        }  
        return num2;  
    }  
      
    public static void main(String[] args) {  
        Fibonacci f = new Fibonacci();  
        long start = System.currentTimeMillis();  
        System.out.println( f.populateWithoutRecursion(500));  
        long end = System.currentTimeMillis();  
        System.out.println("Time Elasped:" + (end - start)/1000.0 + "��");  
    }  
}
