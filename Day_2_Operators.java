import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double meal_base_cost = meal_cost;
    double tip_amount = (tip_percent * meal_base_cost) / 100;
    double tax_amount = (tax_percent * meal_base_cost) / 100;
    
    double total_cost = meal_base_cost + tip_amount + tax_amount;
    System.out.println(Math.round(total_cost));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        // int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        // int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        Scanner scan = new Scanner(System.in);
        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();
        

        Result.solve(meal_cost, tip_percent, tax_percent);

        //bufferedReader.close();
        scan.close();
    }
}
