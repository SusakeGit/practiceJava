package cn.com.github.java2;

public class ArrayOfPrimitives {
       
	public static void main(String[] args) {
		//a1��a2��������ı���
		//�����������ʲô�������⣬���Լ��ķ������Լ�����
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for(int i = 0; i < a2.length; i++){
			a2[i] = a2[i] + 1;
		}
		for(int i = 0; i < a1.length; i++){
			System.out.println("a1["+i+"] = " + a1[i]);
		}
	}
}
