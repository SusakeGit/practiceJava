package cn.com.github3;

class ArrayTest {
	public static void main(String[] args) {
		
		int[][] a = new int[][] {{1,1,1,1,1}, {2,2,2,2,2}, {3,3,3,3,3} };
		int[] arr = { 32, 45, 2, 4, 56, 78, 43, 1, 3 };
		int[] arr1 = { 54, 34, 56, 7, 84, 43, 5, 13 };
		int[] arr2 = { 32, 34, 54, 6, 53, 71, 8, 934, 57, 23 };
		int[] arr3 = { 2, 3, 5, 6, 14, 23, 34, 56, 88 };
		System.out.println("------------------------\narr[]:");
		printArray(arr);
		System.out.println("选择排序：");
		selectSort(arr);
		printArray(arr);
		System.out.println("------------------------\narr1[]:");
		printArray(arr1);
		System.out.println("冒泡排序：");
		bubbleSort(arr1);
		printArray(arr1);
		System.out.println("------------------------\n实际开发：");
		System.out.println("Arrays.sort(arr);");// Arrays静态类中的静态方法，可以直接通过类名调用，这个类位于java.util包中

		int sum = add(arr);
		int max = getMax(arr);
		System.out.println("------------------------");
		System.out.println("sum of arr = " + sum);
		System.out.println("------------------------");
		System.out.println("max of arr = " + max);
		System.out.println("========================");

		System.out.println("arr2[]:");
		printArray(arr2);
		System.out.println("------------------------\narr3[]:");
		printArray(arr3);
		System.out.println("------------------------");

		int locate = searchKey(arr2, 8);
		int locate1 = binarySearch(arr3, 88);
		System.out.println(8 + " in arr2[] is located in " + locate);
		System.out.println("------------------------");
		System.out.println(88 + " in arr3[] is located in " + locate1);
		System.out.println("------------------------\n反转arr3:");
		reverse(arr3);
		printArray(arr3);
		System.out.println("------------------------\narr4[]:");
		int[] arr4 = { 2, 4, 12, 32, 45, 57, 67, 70 };
		printArray(arr4);
		int index = binarySearch_2(arr4, 3);
		System.out.println("index of inserting 3 to arr4 = " + index);
		System.out.println("------------------------\n实际开发: ");
		System.out.println("Arrays.binarySearch(arr, 3);");
		System.out.println("========================");
		System.out.println("60的进制转换：");
		int num = 60;
		String str_bin = toBinary(num);
		String str_oct = toOctal(num);
		String str_hex = toHex(num);
		System.out.println("bin:" + str_bin);
		System.out.println("oct:" + str_oct);
		System.out.println("hex:" + str_hex);
		System.out.println("-------------------------\n实际开发：");
		System.out.println("bin: Integer.toBinaryString(num)");
		System.out.println("oct: Integer.toOctalString(num)");
		System.out.println("hex: Integer.toHexString(num)");
		System.out.println("-------------------------");
	}

	public static int add(int[] arr) { // 数组求和
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		return sum;
	}

	public static int getMax(int[] arr) { // 数组求最值(方法一)
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}

	public static int getMax_2(int[] arr) { // 数组求最值(方法二)
		int max = 0;
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > arr[max]) {
				max = x;
			}
		}
		return arr[max];
	}

	public static void selectSort(int[] arr) { // 选择排序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					swap(arr, x, y);
				}
			}
		}
	}

	public static void bubbleSort(int[] arr) { // 冒泡排序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					swap(arr, y, y + 1);
				}
			}
		}
	}

	public static int searchKey(int[] arr, int key) { // 遍历查找
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == key)
				return x;
		}
		return -1;// -1, 代表的是角标不存在的情况。
	}

	public static int binarySearch_1(int[] arr, int key) { // 二分查找(方法一)
		/* 二分查找，前提：数组必须是有序的。 */
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) >> 1;
		while (arr[mid] != key) {
			if (arr[mid] > key)
				max = mid - 1;
			else if (arr[mid] < key)
				min = mid + 1;
			if (min > max)
				return -1;
			mid = (min + max) >> 1;
		}
		return mid;
	}

	public static int binarySearch(int[] arr, int key) { // 二分查找(方法二)
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		while (min <= max) {
			mid = (min + max) >> 1;
			if (arr[mid] > key)
				max = mid - 1;
			else if (arr[mid] < key)
				min = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void reverse(int[] arr) { // 数组反转
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			swap(arr, start, end);
		}
	}

	public static int binarySearch_2(int[] arr, int key) { // 插入位置
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		while (min <= max) {
			mid = (min + max) >> 1;
			if (arr[mid] > key)
				max = mid - 1;
			else if (arr[mid] < key)
				min = mid + 1;
			else
				return mid;
		}
		return min;// 直接返回插入位置
		// return -(1+min);//和Arrays.binarySearch结果一致
	}

	public static void swap(int[] arr, int a, int b) { // 交换数组两个元素
		/* 注意是三个参数，不是两个，否则无法交换 */
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void printArray(int[] arr) { // 打印数组
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ",");
			else
				System.out.println(arr[x]);
		}
	}

	public static String toBinary(int num) {
		return trans(num, 1, 1);
	}

	public static String toOctal(int num) {
		if (num == 0) // 后面学到string流时，会说到，比较trans()结果和"0"的关系，进行判断。
			return trans(num, 7, 3);
		else
			return "0" + trans(num, 7, 3);
	}

	public static String toHex(int num) {
		if (num == 0)
			return trans(num, 15, 4);
		else
			return "0x" + trans(num, 15, 4);
	}

	public static String trans(int num, int base, int offset) {
		if (num == 0)
			return "0";
		char[] chs = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] arr = new char[32];
		int index = arr.length;
		while (num != 0) {
			int temp = num & base;
			arr[--index] = chs[temp];
			num = num >>> offset;
		}
		return toString(arr, index);
	}

	public static String toString(char[] arr, int index) {
		String temp = "";
		for (int x = index; x < arr.length; x++) {
			temp = temp + arr[x];
		}
		return temp;
	}
}
