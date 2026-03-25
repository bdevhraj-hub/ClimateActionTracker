class CarbonCalculator {

    public static double calculateTotal(User user) {
        double total = 0;
        for (Activity a : user.getActivities()) {
            total += a.calculateEmission();
        }
        return total;
    }
}
