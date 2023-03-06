package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        //  Bus buses[] = new Bus[50]; // instead of that use arrayList- collection use pannalaam. arrayList import panpnum
//ArrayList<Integer> nums = new ArrayList<Integer>(); // to create Integer type of arraylist
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 48));
        buses.add(new Bus(3, true, 50));

        for (Bus b : buses) {
            b.displayBusInfo();
        }
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while (userOpt == 1) {
            System.out.println("Enter 1 to book 2 to exit");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                //System.out.println("booking.........");
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)) // pass arraylists
                {
                    bookings.add(booking); // add booking object in the bookinglist
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Sorry, bus is full. Try another bus or date.");
                }
            }
        }
    }
}




