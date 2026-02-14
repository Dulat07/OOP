package problem1;

import java.util.Scanner;

public class analyzer {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true){
            System.out.println("Enter number (Q to quit): ");
            String input = sc.nextLine();

            if (input.equals("Q")){
                break;
            }

            try{
                double value = Double.parseDouble(input);
                data.add(value);
            }
            catch (NumberFormatException e){
                System.out.println("invalid dtype");
            }
        }
        System.out.println("Average: " + data.get_avg());
        System.out.println("Max: " + data.get_max());

        sc.close();
    }
}
