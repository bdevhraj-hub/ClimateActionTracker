class RecommendationEngine {

    public static void giveSuggestions(double emission) {
        System.out.println("\nSuggestions:");

        if (emission > 15) {
            System.out.println("- Use public transport");
            System.out.println("- Reduce electricity usage");
            System.out.println("- Start recycling");
        } else if (emission > 8) {
            System.out.println("- Try to save electricity");
            System.out.println("- Reduce waste");
        } else {
            System.out.println("- Great job! Keep it up!");
        }
    }
}
