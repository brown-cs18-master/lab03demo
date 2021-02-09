import java.util.LinkedList;

/**
 * A class representing passengers checking in for a flight
 */
public class Lab3Demo {
    /**
     * The list of passengers
     */
    private LinkedList<String> passengers = new LinkedList<String>();

    /**
     * @return the last person to check in for the flight
     */
    public String lastInLine() {
        int length = this.passengers.size();
        return this.passengers.get(length);
    }

    /**
     * Adds a passenger to the list of passengers that have checked in
     *
     * @param name the name of the passenger to check in
     */
    public void addPassenger(String name) {
        this.passengers.add(name);

    }

    /**
     * Checks in Friends characters into flight and prints the name of the
     * last one to check in
     *
     * @param args
     */
    public static void main(String[] args) {
        Lab3Demo line = new Lab3Demo();
        line.addPassenger("Monica");
        line.addPassenger("Rachel");
        line.addPassenger("Phoebe");
        line.addPassenger("Joey");
        line.addPassenger("Chandler");
        line.addPassenger("Ross");
        System.out.println(line.lastInLine());
    }
}
