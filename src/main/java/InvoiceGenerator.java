public class InvoiceGenerator {
    /*
     * Given : MINIMUM_COST_PER_KM = 10.0
     *         COST_PER_TIME = 1
     *         MINIMUM_FARE = 5
     */
    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    /*
     * Purpose : Given distance and time,
     *           Return total fare for the journey
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;

        return Math.max(totalFare, MINIMUM_FARE);
    }
}