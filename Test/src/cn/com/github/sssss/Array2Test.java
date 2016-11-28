package cn.com.github.sssss;

class Array2Test{  
    public static void main(String[] args){  
        System.out.println("----------------------");  
        /*二维数组*/  
        int[][] arr = new int[3][2];  
        System.out.println(arr);//[[I@1db9742//二维数组实体  
        System.out.println(arr[0]);//[I@106d69c//�?维数组实�?  
        System.out.println(arr[0][0]);//0//�?维数组中的元�?  
        arr[1][1] = 99;  
        /* 
            [[I@1db9742 //二维数组 
            其中，@右边的是哈希值，存储的是实体在内存中存放的位置�?�有哈希值，必然有实体�?? 
                  @左边是[[，表明是二维数组实体，I代表类型是整数int�? 
        */  
        System.out.println("----------------------");  
          
        /* 
        int[][] array = new int[3][]; 
        System.out.println(array);//[[I@52e992 
        System.out.println(array[0]);//null 
        System.out.println(array[0][0]);//NullPointerException 
        */  
          
        int[][] array = new int[3][];  
        array[0] = new int[3];  
        array[1] = new int[1];  
        array[2] = new int[2];  
        /*array[1][2] = 34;*///ArrayIndexOutOfBoundsException  
        array[0][1] = 89;  
        array[2][1] = 44;  
        System.out.print("array length:");  
        System.out.println(array.length);/*二维数组的长�?*/  
        System.out.print("array[2] length:");  
        System.out.println(array[2].length);/*某一个一维数组的长度*/  
      
        int[][] arr1 = {{23,45,6},{34,52},{1}};  
        int sum = add(arr1);  
        System.out.println("sum = "+sum);  
        System.out.println("----------------------");  
    }  
    public static int add(int[][] arr){ //二维数组求和  
        int sum = 0;  
        for (int x = 0; x < arr.length; x++){  
            for (int y = 0; y < arr[x].length; y++){  
                sum += arr[x][y];  
            }  
        }  
        return sum;  
    }  
}  
