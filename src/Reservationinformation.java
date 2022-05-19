import java.time.LocalDate;

public class Reservationinformation {
    private Room room;
    private String clientName;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private double price;

    public Reservationinformation(Room room, String clientName, LocalDate reservationStartDate, LocalDate reservationEndDate, double price) {
        this.room = room;
        this.clientName = clientName;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        price = room.getPrice() * (reservationEndDate.toEpochDay() - reservationStartDate.toEpochDay());
    }

    public Room getRoom() {
        return room;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public double getPrice() {
        return price;
    }
}
