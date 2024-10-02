import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tutorial1Week2 {
    public static void main(String[] args) {
        int[] marks = new int[6];
        Scanner scanner = new Scanner(System.in);
        String grade;
        int fail = 0,pass = 0, secondLower = 0, secondUpper = 0, first =0;

        for (int count=0; count<marks.length; count++) {
            System.out.print("Enter mark " + (count+1) + ": ");
            marks[count] = scanner.nextInt();
        }

        //Print all the marks in the array
        System.out.println("\nMarks and the Grade:");
        for (int mark: marks) {
            if(mark < 40) {
                grade = "Fail";
                fail++;
            } else if (mark <= 49) {
                grade = "Pass";
                pass++;
            } else if(mark <= 59) {
                grade = "2:2";
                secondLower++;
            } else if(mark <= 69) {
                grade = "2:1";
                secondUpper++;
            } else {
                grade = "First";
                first++;
            }
            System.out.println("Mark: " + mark + ", \tClass: " + grade);
        }

        System.out.print("Total Fail: " + fail );
        System.out.print(",\tTotal Pass: " +pass );
        System.out.print(",\tTotal 2:2: " + secondLower );
        System.out.print(",\tTotal 2:1: " + secondUpper );
        System.out.println(",\tTotal First: " + first );

        // get average
        double average = getAverage(marks);
        System.out.println("\nAverage: " + average);

        // Print maximum mark
        int maximum = getMaximum(marks);
        System.out.println("Maximum: " + maximum);

        // Print minimum mark
        int minimum = getMinimum(marks);
        System.out.println("Minimum: " + minimum);

        // sort and print the array
        System.out.print("\nSorted Array:");
        displayArray(sortArray(marks));

        //unsorted array
        System.out.print("\nUnsorted marks array:");
        displayArray(marks);

    }

    // method to calculate the average
    public static double getAverage(int[] marks) {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }

        return total/marks.length;
    }

    // method to calculate highest mark
    public static int getMaximum(int[] marks) {
        int maximum = 0;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    // method to calculate highest mark
    public static int getMinimum(int[] marks) {
        int minimum = 100;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    // method to sort the array
    public static int[] sortArray(int[] marks) {
        int[] newArray = Arrays.copyOf(marks,marks.length);
        Arrays.sort(newArray);
        return newArray;
    }

    //display array
    public static void displayArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
