package com.workintech.developers;

//instance variables DONE
//constructor DONE
//getter methods DONE
//setter methods
//work method
//Child classes
public class Employee {
    private long id;
    private String name;
    private double salary;

    public  Employee(long id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
