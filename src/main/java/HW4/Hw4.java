package HW4;

public class Hw4 {

    public static int total(int []arr) {
        if(arr == null){
            System.out.println("Array equals to null");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int maxValue(int []arr) {
        int maxV = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxV < arr[i]) {
                maxV = arr[i];
            }
        }
        return maxV;
    }

    public static int minValue(int []arr) {
        int minV = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minV > arr[i]) {
                minV = arr[i];
            }
        }
        return minV;
    }

    public static int averageValue(int []arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/ arr.length;
    }

    public static int totalDouble(int [][]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    public static int maxValueDouble(int [][]arr) {
        int maxV = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxV < arr[i][j]) {
                    maxV = arr[i][j];
                }
            }
        }
        return maxV;
    }

    public static int numberCountDouble(int [][]arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }
        return count;
    }

}
