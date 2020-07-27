package com.michiel.contrology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Excercise
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String pose1;
    private String pose2;
    private String pose3;
    private String pose4;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPose1() { return pose1; }
    public void setPose1(String pose1) { this.pose1 = pose1; }
    public String getPose2() { return pose2; }
    public void setPose2(String pose2) { this.pose2 = pose2; }
    public String getPose3() { return pose3; }
    public void setPose3(String pose3) { this.pose3 = pose3; }
    public String getPose4() { return pose4; }
    public void setPose4(String pose4) { this.pose4 = pose4; }
}
