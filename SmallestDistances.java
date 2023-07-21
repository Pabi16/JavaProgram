import java.util.Scanner;

public class SmallestDistances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if (N < 2) {
            System.out.println("Invalid Input");
            return;
        }

        int smallestDistance = scanner.nextInt();
        int secondSmallestDistance = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            int distance = scanner.nextInt();
            if (distance < smallestDistance) {
                secondSmallestDistance = smallestDistance;
                smallestDistance = distance;
            } else if (distance < secondSmallestDistance && distance != smallestDistance) {
                secondSmallestDistance = distance;
            }
        }

        if (secondSmallestDistance == Integer.MAX_VALUE) {
            System.out.println("Equal");
        } else {
            System.out.println(smallestDistance + " " + secondSmallestDistance);
        }
    }
}
