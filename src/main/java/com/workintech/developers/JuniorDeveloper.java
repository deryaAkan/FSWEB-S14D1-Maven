package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Junior developers turn \"bug fixing\" into an extreme sport.\n");
        setSalary(getSalary() * 1.10);

    }

}
