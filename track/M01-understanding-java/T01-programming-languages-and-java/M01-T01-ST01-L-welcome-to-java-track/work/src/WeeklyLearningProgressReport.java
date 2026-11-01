public class WeeklyLearningProgressReport {
    public static void main(String[] args) {
        int completedTopic = 17;
        int totalTopic = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopic - completedTopic;
        int weeklyLearningHours = dailyLearningHours * learningDays;
        double progressPercentage = (double) completedTopic * 100 / totalTopic;

        System.out.println("Completed Topics: " + completedTopic);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
