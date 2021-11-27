package TutorialsPointExamples;

public class EmployeeTest {
    public static void main(String[] args){
        //creating two objects using constructor
        Employee empOne = new Employee("James Smith"); //<-- this is creating a new object
        Employee empTwo = new Employee("Mary Anne"); //<-- this is creating a new object

        empOne.empAge(26); //<--invoking the methods for each object created
        empOne.empDesignation("Senior Software Age"); //<--invoking the methods for each object created
        empOne.empSalary(1000); //<--invoking the methods for each object created
        empOne.printEmployee(); //<--this prints everything out for the object empOne

        empTwo.empAge(21); //<--invoking the methods for each object created
        empTwo.empDesignation("Software Engineer"); //<--invoking the methods for each object created
        empTwo.empSalary(500); //<--invoking the methods for each object created
        empTwo.printEmployee(); //<--this prints everything out for the object empTwo
    }
}
