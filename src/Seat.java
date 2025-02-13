class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public void bookSeat() {
        isBooked = true;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
