package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("MidDevelopers are the middle children of coding: not quite rookies, not yet wizards, but always finding clever workarounds. ");
        setSalary(getSalary() * 1.15);

    }
}
