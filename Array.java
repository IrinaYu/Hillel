public class Array {

  public static void main(String[] args)  {

      String arrayOfEveryThirdElement;
      int[] elements = {1, 10, 7, 5, 8, 9, 4, 3};

      System.out.println("Every third element of array is : ");

      for (int a = 2; a < elements.length; a = a + 3) {
    System.out.println(elements[a]);
    }
}

}

