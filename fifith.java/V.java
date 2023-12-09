public class V {

    public static void main(String[] args) {
        for (int i = 1; i >0; i++) {
            int x = i;
            int len = Integer.toString(x).length();
            int arm = 0, rem;
            int y = x; // Use the original value of x here instead of changing x

            while (x > 0) {
                rem = x % 10;
                arm = arm + (int) Math.pow(rem, len);
                x = x / 10;
            }

            if (arm == y) {
                System.out.println("The number " + y + " is an Armstrong Number.");
             }
            //   else {
                // System.out.println("The number " + y + " is not an Armstrong Number.");
            // }
        }
    }
}
