package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    public Student(long id){
        super(id);
    }

    public double totalStudyTime = 10;

    public void learn(double numberOfHours) {

        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
