public class AddJavaFor {

  public static void main(String[] args)
 //take arguments from console
 {
    int index;
    for (index = 0; index < args.length; ++index) {
      System.out.println("args[" + index + "]: " + args[index]);
      int result = Integer.parseInt(args[index]);
      System.out.println(addOne(result));
   
    }
    // System.out.println(addOne(10));
  }


  // Write your implementation of 'add' function

  public static int addOne(int a) {
    return (a * 2 - (a - 1));
  }
}

