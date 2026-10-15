public class Maximum {
    public static void main(String[] args) {
        int maxSoFar = Integer.MIN_VALUE; // Starts at -2,147,483,648

        // Imagine checking numbers: 10, 20, 30
        for (int i = 10; i <= 30; i += 10) {
            if (i > maxSoFar) {
                maxSoFar = i; // Update king of the hill!
            }
        }
        System.out.println("Highest number: " + maxSoFar); // Prints 30
    }
}