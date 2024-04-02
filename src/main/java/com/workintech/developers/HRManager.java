package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;

    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index >= 0 && index < juniorDevelopers.length) {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } else {
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index >= 0 && index < midDevelopers.length) {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } else {
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index >= 0 && index < seniorDevelopers.length) {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } else {
            System.out.println("Index not found: " + index);
        }
    }


    @Override
    public void work(){
        System.out.println("HR Managers are keeping the office from becoming a sitcom, one policy at a time.");
        setSalary(getSalary() * 1.05);
    }
}
