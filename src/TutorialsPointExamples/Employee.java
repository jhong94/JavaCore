package TutorialsPointExamples;

public class Employee {
    String name; //<--these are instance variables
    int age;
    String designation;
    double salary;

    public Employee(String name){ //<-- this is the constructor of the class with a parameter
        this.name = name; //<-- accessing the instance variable
    }

    public void empAge(int empAge){ //<-- this assigns the age of the Employee to the variable "age"
        age = empAge; //<-- accessing the instance variable
    }

    public void empDesignation(String empDesig){  //<-- this assigns the designation to the variable "designation"
        designation = empDesig; //<-- accessing the instance variable
    }

    public void empSalary(double empSalary){ //<--this assigns the salary to the variable "salary"
        salary = empSalary; //<-- accessing the instance variable
    }

    public void printEmployee(){ //<-- these can only be printed within the main method but can also be called from a different class
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
