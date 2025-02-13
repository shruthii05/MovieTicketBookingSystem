import java.util.ArrayList;
import java.util.List;

class Theater {
    private int theaterId;
    private String name;
    private Movie movie;
    private List<Seat> seats;

    public Theater(int theaterId, String name, Movie movie, int totalSeats) {
        this.theaterId = theaterId;
        this.name = name;
        this.movie = movie;
        this.seats = new ArrayList<>();

        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public boolean bookSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber && seat.isAvailable()) {
                seat.bookSeat();
                return true;
            }
        }
        return false;
    }
}
