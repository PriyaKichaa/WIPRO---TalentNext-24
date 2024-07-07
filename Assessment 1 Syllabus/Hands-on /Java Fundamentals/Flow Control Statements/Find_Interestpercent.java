/*
Q6 Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/

public class Find_Interestpercent {
    public static void main(String[] args) {
        String m = "Male", f = "Female";
        if (args[0].equalsIgnoreCase(f)) {
            if (Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) <= 58)
                System.out.println("8.2%");
            else if (Integer.parseInt(args[1]) > 58 && Integer.parseInt(args[1]) <= 100)
                System.out.println("9.2%");
            else;
        } else if (args[0].equalsIgnoreCase(m)) {
            if (Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) <= 58)
                System.out.println("8.4%");
            else if (Integer.parseInt(args[1]) > 58 && Integer.parseInt(args[1]) <= 100)
                System.out.println("10.5%");
            else;
        } else;
    }
}