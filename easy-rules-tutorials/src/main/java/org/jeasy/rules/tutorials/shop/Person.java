package org.jeasy.rules.tutorials.shop;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private Job job;
    private List<Skill> skills;
    private boolean adult;
    private boolean JAVA;
    private boolean AWS;
    private boolean sterling;

    public Person(String name, int age, Job job, List<Skill> skills) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {return job;}

    public List<Skill> getSkills() {return skills;}

    public boolean isAdult() {
        return adult;
    }

    public boolean isAWS() {
        return AWS;
    }

    public boolean isJAVA() {
        return JAVA;
    }

    public boolean isSterling() {
        return sterling;
    }


    public void setJAVA(boolean JAVA) {
        this.JAVA = JAVA;
    }

    public void setAWS(boolean AWS) {
        this.AWS = AWS;
    }

    public void setSterling(boolean sterling) {
        this.sterling = sterling;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job=" + job +
                ", skills=" + skills +
                ", adult=" + adult +
                ", aws=" + AWS +
                ", java=" + JAVA +
                ", sterling=" + sterling +
                '}';
    }
}