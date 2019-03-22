public class Fast {
    public static void main(String[] args) {
        System.out.println(fastMull(5, 7));
        System.out.println(fastExpt(3, 3));

    }


    public static int fastMull(int a, int b) {
        int res = 0;
        for (int i = 0; i < a; i++) {
            res = res + b;
        }
        return res;

    }

    public static int fastExpt(int a, int b) {
        int result = 1;
      

        for (int x = 1; x <= a; x++) {

            result = result * b;
            
        }
        return result;

    }
 }




