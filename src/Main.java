import model.Course;
import strategy.VideoLearning;
import strategy.InteractiveLearning;
import strategy.LiveLearning;


public class Main {
    public static void main(String[] args) {

        //create course objects
        Course javaCourse = new Course("Java Fundamentals");
        Course aiCourse = new Course("Introduction to AI");

        //assign different learning strategies
        javaCourse.setLearningStrategy(new VideoLearning());
        aiCourse.setLearningStrategy(new InteractiveLearning());

        //start learning with initial strategies
        javaCourse.startLearning();
        aiCourse.startLearning();

        System.out.println("\n--- Switching strategy at runtime ---\n");

        //change strategy dynamically
        javaCourse.setLearningStrategy(new LiveLearning());
        javaCourse.startLearning();
    }
}
