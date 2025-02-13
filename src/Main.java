
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create movie and theater
        Movie movie = new Movie(1, "Interstellar", 180);
        Theater theater = new Theater(101, "PVR Cinemas", movie, 5);

        // Create user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(1, name, "user@example.com");

        // Display available seats
        System.out.println("\nAvailable Seats:");
        for (Seat seat : theater.getAvailableSeats()) {
            System.out.print(seat.getSeatNumber() + " ");
        }
        System.out.println();

        // Select seat
        System.out.print("Select a seat number: ");
        int seatNumber = scanner.nextInt();

        if (theater.bookSeat(seatNumber)) {
            Seat bookedSeat = new Seat(seatNumber);
            Booking booking = new Booking(user, movie, bookedSeat);

            // Choose Payment Method
            System.out.println("\nChoose Payment Method:\n1. Credit Card\n2. UPI");
            int choice = scanner.nextInt();
            Payment payment;
            if (choice == 1) {
                payment = new CreditCardPayment();
            } else {
                payment = new UpiPayment();
            }

            payment.pay(300.0); // Example price
            booking.printTicket();
        } else {
            System.out.println("Seat already booked. Try another.");
        }

        scanner.close();
    }
}
