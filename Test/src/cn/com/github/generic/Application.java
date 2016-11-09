package cn.com.github.generic;

public class Application {

	private final int LOOP_TIMES = 10000000;
	private final String CONSTANT_STRING = "min-snail";

	public static void main(String[] args) {

		new Application().startup();
	}

	public void testStringBuilder() {
		StringBuilder builder = new StringBuilder();
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < LOOP_TIMES; i++) {
			builder.append(CONSTANT_STRING);
		}
		builder.toString();
		long endTime = System.currentTimeMillis();
		System.out.print("StringBuilder : " + (endTime - beginTime) + "\t");
	}

	public void testCapacityStringBuilder() {
		StringBuilder builder = new StringBuilder(LOOP_TIMES * CONSTANT_STRING.length());
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < LOOP_TIMES; i++) {
			builder.append(CONSTANT_STRING);
		}
		builder.toString();
		long endTime = System.currentTimeMillis();
		System.out.print("StringBuilder : " + (endTime - beginTime) + "\t");
	}

	public void startup() {
		for (int i = 0; i < 100; i++) {
			System.out.print("The " + i + " [\t    ");
			testStringBuilder();
			testCapacityStringBuilder();
			System.out.println("]");
		}
	}
}