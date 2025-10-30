package strategy;

public class VideoLearning implements LearningStrategy {

    @Override
    public void learn(String courseTitle) {
        System.out.println("Learning course \"" + courseTitle + "\" by watching video lectures.");
    }
}
