package org.jeasy.rules.tutorials.shop;

public class Job {

    private String name;
    private String role;

    public Job(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}