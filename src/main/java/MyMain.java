//jen obyrne
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
    public static int[] sumOfTwoDice(int n)
    {
        int die1 = 0;
        int die2 = 0;
        int[] nums = new int[n];
        int[] finalarray = new int[20];
        double[] sums = new double[n];
        int sum = 0;
        int[] z = new int[n];
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;

        for (int i = 0; i < n; i++) 
        {
            die1 = (int) ((Math.random() * 6) + 1);
            die2 = (int) ((Math.random() * 6) + 1);
            sum = (die1 + die2);
            nums[i] = sum;
            //System.out.println("\t" + Arrays.toString(nums) + "nums");
        }
        for (int k = 0; k < n; k++)
        {
            if (nums[k] == 2)
            {
                two = two + 1;
                finalarray[2] = two;
            }
            if (nums[k] == 3)
            {
                three = three + 1;
                finalarray[3] = three;
            }
            if (nums[k] == 4)
            {
                four = four + 1;
                finalarray[4] = four;
            }
            if (nums[k] == 5)
            {
                five = five + 1;
                finalarray[5] = five;
            }
            if (nums[k] == 6)
            {
                six = six + 1;
                finalarray[6] = six;
            }
            if (nums[k] == 7)
            {
                seven = seven + 1;
                finalarray[7] = seven;
            }
            if (nums[k] == 8)
            {
                eight = eight + 1;
                finalarray[8] = eight;
            }
            if (nums[k] == 9)
            {
                nine = nine + 1;
                finalarray[9] = nine;
            }
            if (nums[k] == 10)
            {
                ten = ten + 1;
                finalarray[10] = ten;
            }
            if (nums[k] == 11)
            {
                eleven = eleven + 1;
                finalarray[11] = eleven;
            }
            if (nums[k] == 12)
            {
                twelve = twelve + 1;
                finalarray[12] = twelve;
            }
        }
        int[] output = {two, three, four, five, six, seven, eight, nine, ten, eleven, twelve};
        for (int j = 0; j <= 12; j++)
        {
            //sums[j] = (nums[j] / (double) n + 1);
            //System.out.println(finalarray[j]);
            
        }
        int[] x = new int[100];
        x = finalarray;
        return output;
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int vals = scan.nextInt();
        System.out.println(rollDie());
        System.out.println(sumOfTwoDice(vals));
        int[] arr3 = new int[vals];
        String str1 = " ";
        int str2 = 0;
        double y = 0;
        double x = 0;
        arr3 = sumOfTwoDice(vals);
        for (int i = 0; i <= 12; i++)
        {
            y = (double) (arr3[i] / 11);
            double sum = ((str1.indexOf(i)) / (double) vals);
            double percent = (sum) * -10000;
            x = ((double) arr3[i] / vals * 10);
            System.out.println("Percent of rolls where sum == " + i + " is " + x);
        }
        scan.close();
    }
        
}