import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many runs? ");
        int runs = scan.nextInt();
        scan.nextLine();
        for(int x=0;x<runs;x++)
        {
            System.out.println("Enter 2 points {(x1,y1)(x2,y2)}");

            String input = scan.nextLine();

            input = input.replace("(", " ")
                    .replace(")", " ")
                    .replace(",", " ");

            String[] parts = input.trim().split("\\s+");

            int x1 = Integer.parseInt(parts[0]);
            int y1 = Integer.parseInt(parts[1]);
            int x2 = Integer.parseInt(parts[2]);
            int y2 = Integer.parseInt(parts[3]);

            double xSub = Math.abs(x2 - x1);
            double ySub = Math.abs(y2 - y1);
            double xSq = (xSub * xSub);
            double ySq = (ySub * ySub);
            double xyAdd = (xSq + ySq);
            System.out.println("Distance is: " + Math.sqrt(xyAdd));
        }

    }

}
