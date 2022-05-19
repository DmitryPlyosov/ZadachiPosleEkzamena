import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private HashMap<Integer, Room> rooms = new HashMap<>();
    ArrayList<Reservationinformation> reservationinformation = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom(final Room room) {
        if (rooms.containsKey(room.getRoomNumber())) {
            System.out.println("Такая комната уже существует");
        }
    else{
        rooms.put(room.getRoomNumber(),room);
                System.out.println("Комната успешно добавлена в список");
            }
    }
    public void addBuking(String clientName, int roomNumber,int days){
        if(rooms.containsKey(roomNumber)){
            LocalDate today = LocalDate.now();
            LocalDate endReservationDate = LocalDate.now().plusDays(days);
            boolean isFree = true;
            for (Reservationinformation information : reservationinformation){

            }
            if (isFree){
                Room room = rooms.get(roomNumber);

            }

        }
        else {
            System.out.println("Неверный номер комнаты");
        }


    }
    }

