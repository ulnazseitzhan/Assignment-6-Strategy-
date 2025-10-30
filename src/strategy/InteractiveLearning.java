package strategy;


public class InteractiveLearning implements LearningStrategy {

    @Override
    public void learn(String courseTitle) {
        System.out.println("Learning course \"" + courseTitle + "\" through interactive exercises and quizzes.");
    }
}
