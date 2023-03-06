package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date; //  Date class already in the java.util.date;

        Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        this.passengerName = scanner.next();

        System.out.println("Enter bus no: ");
        this.busNo=scanner.nextInt();

        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next(); // date oru object so error varum
        SimpleDateFormat dataformat = new SimpleDateFormat("dd-mm-yyyy");
            //exception handling
        try {
            date = dataformat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    } // constructer end

    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
        int Totalseats = 0;
        int booked = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == this.busNo) //until it finds the same booked busno from the buslist busno. then it checks other
            /*book panna busno um loopla iteratre aahura busno um
            equala iruntha than micha vela nadakum.
                */ {
                Totalseats = bus.getCapacity();

            }
            booked = 0;
            for (Booking b : bookings) {
                if (b.busNo == this.busNo && b.date.equals(date))
                    booked++;
            }
        }
        return booked < Totalseats ? true : false;
    }


}
