import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinked {

    public static void main(String[] args) {
        // 1) ArrayList declaration
        ArrayList<String> tickets = new ArrayList<>();

        // 2) add(element) - Add a ticket to the end of the list
        tickets.add("T001");
        tickets.add("T002");
        tickets.add("T003");
        tickets.add("T004");

        System.out.println("=== TRAIN TICKET ARRAYLIST ===");
        System.out.println("Ticket list: " + tickets);

        // 3) get(index) - Get a ticket based on its position
        System.out.println("First ticket: " + tickets.get(0));

        // 4) add(index, element) - Insert a priority ticket at a specific position
        tickets.add(0, "T000-PRIORITY");
        System.out.println("After adding priority ticket: " + tickets);

        // 5) set(index, element) - Update a ticket at a specific position
        tickets.set(1, "T001-UPDATED");
        System.out.println("After updating T001: " + tickets);

        // 6) remove(element) - Remove a specific ticket
        tickets.remove("T002");
        System.out.println("After removing T002: " + tickets);

        // 7) size() - Check the number of tickets
        System.out.println("Number of tickets: " + tickets.size());

        // 8) isEmpty() - Check whether the list is empty
        System.out.println("Is the list empty? " + tickets.isEmpty());

        // 9) clear() - Remove all tickets
        tickets.clear();
        System.out.println("After clear: " + tickets);
        System.out.println("Is the list empty after clear? " + tickets.isEmpty());

        // 1) LinkedList declaration
        LinkedList<String> queue = new LinkedList<>();

        // 2) add(element) - Add a ticket to the end of the queue
        queue.add("GA031");
        queue.add("GA037");
        queue.add("GA042");

        System.out.println("\n=== AIRPLANE TICKET LINKEDLIST QUEUE ===");
        System.out.println("Initial queue: " + queue);

        // 3) addFirst() - Add a priority ticket to the beginning of the queue (HEAD)
        queue.addFirst("GA045-PRIORITY");
        System.out.println("After adding priority ticket at the beginning: " + queue);

        // 4) addLast() - Add a new ticket to the end of the queue (TAIL)
        queue.addLast("GA048");
        System.out.println("After adding a ticket at the end: " + queue);

        // 5) getFirst() - View the first ticket (HEAD)
        System.out.println("First ticket (HEAD): " + queue.getFirst());

        // 6) getLast() - View the last ticket (TAIL)
        System.out.println("Last ticket (TAIL): " + queue.getLast());

        // 7) removeFirst() - Remove the first ticket after it is served
        queue.removeFirst();
        System.out.println("After serving the first customer: " + queue);

        // 8) size() - Check the number of tickets in the queue
        System.out.println("Number of tickets in queue: " + queue.size());
    }
}