package CS1301Lab;

public class hawaii {
    public static void main(String[] args) {
        // double in the range [0.0, 1.0)
        double r = Math.random();

        // integer in the range 1 to 6 with desired probabilities
        int roll;
        if      (r < 1.0/8.0) {roll = 1;}     // 1.0/8.0 = 0.125      r < 0.125
        else if (r < 2.0/8.0) {roll = 2;}     // 2.0/8.0 = 0.25       0.25  > r > = 0.125
        else if (r < 3.0/8.0) {roll = 3;}     // 3.0/8.0 = 0.375      0.375 > r > = 0.25
        else if (r < 4.0/8.0) {roll = 4;}     // 4.0/8.0 = 0.5         0.5  > r > = 0.375
        else if (r < 5.0/8.0) {roll = 5;}     // 5.0/8.0 = 0.625      0.625 > r > = 0.5
        else                  {roll = 6;}                       //            r > = 0.625

        // print result
        System.out.println(r);
        System.out.println(roll);

    }

}
