import java.util.*;

// Manages the waiting list using a Queue (LinkedList) and a Set (HashSet)
public class WaitingListManager {
    private Queue<String> waitingQueue;
    private Set<String> waitingSet;

    public WaitingListManager() {
        waitingQueue = new LinkedList<>();
        waitingSet = new HashSet<>();
    }

    // Adds a person to the waiting list if not already present
    public void addPerson(String name) {
        if (waitingSet.contains(name)) {
            System.out.println(name + " is already in the waiting list.");
        } else {
            waitingQueue.add(name);
            waitingSet.add(name);
            System.out.println(name + " added to the waiting list.");
        }
    }

    // Serves the first person in the queue
    public String servePerson() {
        if (waitingQueue.isEmpty()) {
            return "Waiting list is empty.";
        }
        String servedPerson = waitingQueue.poll();
        waitingSet.remove(servedPerson);
        return servedPerson + " has been served.";
    }

    // Checks if a person is in the waiting list
    public boolean isPersonInList(String name) {
        return waitingSet.contains(name);
    }

    // Returns the number of people in the waiting list
    public int waitingListSize() {
        return waitingQueue.size();
    }

    // Displays the waiting list
    public void displayWaitingList() {
        if (waitingQueue.isEmpty()) {
            System.out.println("The waiting list is empty.");
        } else {
            System.out.println("Waiting List:");
            for (String name : waitingQueue) {
                System.out.println(name);
            }
        }
    }
}

