package cn.com.github.java1;

import cn.com.github.base.Print;

// ÑÐ¾¿±êÇ©
public class LabelWhile {

	public static void main(String[] args) {
		int i = 0;
		outer:
			while(true){
				Print.Print("outer while loop");
				while(true){
					 i++;
					 Print.Print("i="+i);
					 if (i == 1) {
						 Print.Print("continue");
						continue;
					}
					 if (i == 3) {
						 Print.Print("continue outer");
						continue outer;
					}
					 if (i == 5) {
						 Print.Print("break inner loop");
						break;
					}if (i == 7) {
						Print.Print("break outer");
						break outer;
					}
				  }
				}
	}
}
