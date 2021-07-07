import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Player Name : ");
        String Name = input.next;

        System.out.print("Player Age : ");
        int age = in.nextInt();

        System.out.print("Player statistics : ");
        String Statistics = input.next();

        System.out.print("Player Type : ");
        String Type = input.next();

        Player take = new Player(Name, age, Statistics, Type);

        while (true) {
            System.out.println("View Players:                 Press V\n" +
                               "Display Average:              Press B\n" +
                               "Display Two Best Performance: Press C\n" +
                               "Display The Type:             Press D\n");

            String let = in.next();
            switch (let) {
                case "V":
                    take.viewDetails();
                    break;
                case "B":
                    take.getAverage();
                    break;
                case "C":
                    take.getBestPerformance();
                    break;
                case "D":
                    take.getType();
                    break;
                default :
                    System.out.println("Wrong Value");
            }
        }

    }
}
