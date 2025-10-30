package strategy;


public class LiveLearning implements LearningStrategy {

    @Override
    public void learn(String courseTitle) {
        System.out.println("Learning course \"" + courseTitle + "\" by attending live instructor sessions.");
    }
}
