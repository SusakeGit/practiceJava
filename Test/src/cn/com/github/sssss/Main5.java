package cn.com.github.sssss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main5 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		BigInteger base = new BigInteger("16");
		try {
			while ((line = reader.readLine()) != null) {
				line = line.substring(2);
                BigInteger result = new BigInteger("0");
                for(int i=0;i < line.length(); i++){
                	char cn = line.charAt(line.length() - 1 - i);
                	 if(cn >= 'A' && cn <= 'F'){  
                         BigInteger tmp = base.pow(i).multiply(new BigInteger(Integer.toString((cn - 'A' + 10))));  
                         result = result.add(tmp);  
                     }else{  
                         BigInteger tmp = base.pow(i).multiply(new BigInteger(Character.toString(cn)));  
                         result = result.add(tmp);  
                     }  
                }
                System.out.println(result);
			}
		} catch (Exception e) {
              e.printStackTrace();
		}
	}
}
