package model;

import strategy.LearningStrategy;

public class Course {

    private String title;
    private LearningStrategy learningStrategy;

    public Course(String title) {
        this.title = title;
    }


    public void setLearningStrategy(LearningStrategy learningStrategy) {
        this.learningStrategy = learningStrategy;
    }


    public void startLearning() {
        if (learningStrategy == null) {
            System.out.println("No learning strategy selected for the course \"" + title + "\".");
            return;
        }
        learningStrategy.learn(title);
    }


    public String getTitle() {
        return title;
    }
}
