public class Demo {
  public static void main(String[] args) {
    if(args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    } else {
      printLoop(5);
    }

    // System.out.println(arrDeepToString(create2DArray(5, 4, 4)).replace("}, ","},\\n"));
    // System.out.println(arrDeepToString(create2DArrayRandomized(6, 4, 4)).replace("}, ","},\n "));
    // System.out.println(arrDeepToString(create2DArrayRandomized(4, 10, 100)).replace("}, ", "},\n "));
  }

  public static void printLoop(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = n; j >= i; j--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  // print an array as a string in the format {0, 1, 2}
  public static String arrToString(int[] arr) {
    String string = "";
    for (int i = 0; i < arr.length; i++) {
      string += arr[i];
      if (i != arr.length - 1) {
        string += ", ";
      }
    }
    return "{" + string + "}";
  }

  // print a 2d array as a string in the format {{0}, {1, 2} {1, 2, 12}}
  public static String arrDeepToString(int[][] arr) {
    String string = "";
    for (int i = 0; i < arr.length; i++) {
      string += arrToString(arr[i]);
      if (i != arr.length - 1) {
        string += ", ";
      }
    }
    return "{" + string + "}";
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] array = new int[rows][cols];
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        array[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return array;
  }
  
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] array = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int maxCols = (int)(Math.random() * (cols + 1));
      array[i] = new int[maxCols];
      for (int j = 0; j < maxCols; j++) {
        array[i][j] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return array;
  }
}