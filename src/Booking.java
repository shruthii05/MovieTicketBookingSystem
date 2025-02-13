class Booking {
    private User user;
    private Movie movie;
    private Seat seat;

    public Booking(User user, Movie movie, Seat seat) {
        this.user = user;
        this.movie = movie;
        this.seat = seat;
    }

    public void printTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("User: " + user.getName());
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Seat Number: " + seat.getSeatNumber());
    }
}

