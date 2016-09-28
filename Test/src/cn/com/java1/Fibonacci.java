package cn.com.java1;

import java.math.BigInteger;


public class Fibonacci {


    /** 
     *  
     * 采用递归方法实现 
     *  
     * 用int类型的话，最多可以计算出f(46) = 1836311903, 计算f(47)时就会产生溢出。 
     * f(42) = 267914296 
     * f(43) = 433494437 
     * f(44) = 701408733 
     * f(45) = 1134903170 
     * f(46) = 1836311903 
     * f(47) = -1323752223 
     *  
 
     *  
     * @return 返回第n个斐波纳契数 
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
     * 采用非递归方法实现，效率比递归方法要高很多。 
     *  
     * 用int类型的话，最多可以计算出f(46) = 1836311903, 计算f(47)时就会产生溢出。 
     * f(42) = 267914296 
     * f(43) = 433494437 
     * f(44) = 701408733 
     * f(45) = 1134903170 
     * f(46) = 1836311903 
     * f(47) = -1323752223 
     *  
 
     *  
     * @return 返回第n个斐波纳契数 
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
     * 采用递归方法实现 
     *  
     * 用long类型的话，最多可以计算出f(92) = 7540113804746346429, 计算f(93)时就会产生溢出。 
     * f(90) = 2880067194370816120 
     * f(91) = 4660046610375530309 
     * f(92) = 7540113804746346429 
     * f(93) = -6246583658587674878 
     *  
 
     *  
     * @return 返回第n个斐波纳契数 
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
     * 采用非递归方法实现，效率比递归方法要高很多。 
     *  
     * 用long类型的话，最多可以计算出f(92) = 7540113804746346429, 计算f(93)时就会产生溢出。 
     * f(90) = 2880067194370816120 
     * f(91) = 4660046610375530309 
     * f(92) = 7540113804746346429 
     * f(93) = -6246583658587674878 
     *  
 
     *  
     * @return 返回第n个斐波纳契数 
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
     * 采用非递归的方式来实现，同时采用BigInteger来实现。 
     *  
     *  
 
     * @return 返回第n个斐波纳契数 
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
        System.out.println("Time Elasped:" + (end - start)/1000.0 + "秒");  
    }  
}
