package com.mycompany.penumpangpesawat;
public class Penumpangpesawat {

    public static void main(String[] args) {
class Passenger {
    String name;
    Passenger next;
    public Passenger(String name) {
        this.name = name;
        this.next = null;
    }
}
class Flight {
    private Passenger head;
    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }
    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Penumpang " + name + " telah dihapus.");
            return;
        }
        Passenger current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Penumpang " + name + " tidak ditemukan.");
        } else {
            current.next = current.next.next;
            System.out.println("Penumpang " + name + " telah dihapus.");
        }
    }
    public void displayPassengers() {
        if (head == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }
        Passenger current = head;
        System.out.println("Daftar penumpang:");
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }
}
        Flight flight = new Flight();

        flight.addPassenger("John");
        flight.addPassenger("Alice");
        flight.addPassenger("Bob");

        flight.displayPassengers();

        flight.removePassenger("Alice");
        flight.displayPassengers();

        flight.removePassenger("Charlie");
        flight.displayPassengers();
    }
}

    

