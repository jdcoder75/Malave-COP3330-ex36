package ex36;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Jose Malave
 */
class Main {

    public static int average(ArrayList<Integer> numbers)
    {

        int avg;
        int sum = 0;

        for (int i = 1; i < numbers.size(); i++)
        {
            sum = sum + numbers.get(i);

        }
        avg = sum / numbers.size();
        return avg;
    }
    public static int max(ArrayList<Integer> numbers)
    {
        int Max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            if(numbers.get(i) > Max)
            {
                Max = numbers.get(i);
            }
        }

        return Max;
    }
    public static int min(ArrayList<Integer> numbers)
    {
        int Min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++)
        {
            if(numbers.get(i) < Min)
            {
                Min = numbers.get(i);
            }
        }

        return Min;
    }
    public static double std(ArrayList<Integer> numbers)
    {
        double mean = average(numbers);
        double temp = 0;

        for (int i = 0; i < numbers.size(); i++)
        {
            int val = numbers.get(i);

            // Step 2:
            double squrDiffToMean = Math.pow(val - mean, 2);

            // Step 3:
            temp += squrDiffToMean;
        }

        double meanOfDiffs = (double) temp / (double) (numbers.size());

        return Math.sqrt(meanOfDiffs);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputs;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int i = 0;
        int temp = 1;
        while(temp == 1)
        {
            System.out.println("Enter a number:");

            inputs = sc.nextLine();
            if(inputs.contains("done"))
            {
                temp = 0;
                continue;
            }

            numbers.add(Integer.parseInt(inputs));

            i++;
        }

        System.out.println("Numbers: ");
        for( int j = 0; j < i; j++)
        {
            System.out.println(numbers.get(i) + ",");
        }

        System.out.println("The average is" + average(numbers));
        System.out.println("The minimum is" + min(numbers));
        System.out.println("The maximum is" + max(numbers));
        System.out.println("The standard deviation is" + std(numbers));
    }


}
