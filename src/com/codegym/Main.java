package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee employee1 = new Employee(1,"Ngoc Trinh", false, "Nguoi mau");
        Employee employee2 = new Employee(2,"Tuan Anh", true, "Cau thu");
        Employee employee3 = new Employee(3,"Son Tung", true, "Ca si");
        Employee employee4 = new Employee(4,"Ba Tan", false, "Youtuber");
        Employee employee5 = new Employee(5,"Tram Anh", false, "Dien vien");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Ngoc Trinh");
        employee.setGender(false);
        employee.setDescription("Nguoi mau");

    }
}
