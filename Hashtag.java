public class Hashtag {
    public static void main(String[] args) {

        Hashtag thisObj = new Hashtag();
        int n = 5;
	int res = n - 1;
        for (; n > res; res++) {
            thisObj.printSquare(res);
        }
    }
   

    public void printSquare(int n) {
        System.out.println();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println("# ");
        }
    }
}




