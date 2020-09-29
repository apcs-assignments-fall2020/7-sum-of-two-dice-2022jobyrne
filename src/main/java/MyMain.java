import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int val = (int) ((Math.random() * 6) + 1);
        return val;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static String sumOfTwoDice(int n) {
        int die1 = 0;
        int die2 = 0;
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int sum = 0;
        int inte = 0;
        int integer = 0;
        for (int i = 0; i <= nums.length; i++) {
            die1 = (int) ((Math.random() * 6) - 1);
            die2 = (int) ((Math.random() * 6) - 1);
            sum = (die1 + die2);
            //integer = inte + 1;
            nums[sum] = 1;
//nums = 1, 2, 3, 4, 5, 6...
        }
         for (int j = 0; j <= nums.length; j++) {
            String q = "sum were";      
            return (n + q + nums[j]);
            }
        //int[] arr = {1, 2, 3};
        //return nums;
        return null;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int vals = scan.nextInt();
        System.out.println(rollDie());
        for (int i = 0; i <= vals; i++) {
            System.out.println(sumOfTwoDice(vals));
            System.out.println(sumOfTwoDice(vals));
        }
        
        }
    }

