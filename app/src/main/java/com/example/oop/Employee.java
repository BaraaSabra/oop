package com.example.oop;

public class Employee {
    int id;
    String fullName;
    String  jobName;
    double price;
    int childrenNumber;


    public Employee(int id, String fullName, String jobName, double price, int childrenNumber) {
        this.id = id;
        this.fullName = fullName;
        this.jobName = jobName;
        this.price = price;
        this.childrenNumber = childrenNumber;
    }


    public double salaryInYear(int mont){
        double all=price*mont;
        return all;
    }

    public double SalaryAllowance(){

        double allowancePerChild=10.0;

        double salarya=allowancePerChild*childrenNumber;
        double allsalry=salarya+price;
        return allsalry;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", jobName='" + jobName + '\'' +
                ", price=" + price +
                ", childrenNumber=" + childrenNumber +
                '}';
    }




//    public class Main {
//        // دالة لحساب إجمالي رواتب الموظفين مع العلاوة في القسم
//        public static double totalSalaryInDepartmentWithAllowance(Employee[] employees, String targetDepartment) {
//            double totalSalary = 0.0;
//            double allowancePerEmployee = 10.0; // علاوة لكل موظف
//
//            for (Employee employee : employees) {
//                if (employee.getDepartment().equals(targetDepartment)) {
//                    totalSalary += (employee.getSalary() + allowancePerEmployee);
//                }
//            }
//
//            return totalSalary;
//        }
//
//        public static void main(String[] args) {
//            // إنشاء مصفوفة من نوع Employee
//            Employee[] employees = new Employee[3];
//
//            // تعبئة المصفوفة بالبيانات
//            employees[0] = new Employee("John Doe", 3000.0, "IT");
//            employees[1] = new Employee("Jane Smith", 3500.0, "HR");
//            employees[2] = new Employee("Mike Johnson", 3200.0, "IT");
//
//            // حساب إجمالي رواتب الموظفين مع العلاوة في القسم (مثال: قسم IT)
//            String targetDepartment = "IT";
//            double totalSalaryInTargetDepartment = totalSalaryInDepartmentWithAllowance(employees, targetDepartment);
//
//            // طباعة إجمالي رواتب الموظفين مع العلاوة في القسم
//            System.out.println("إجمالي رواتب الموظفين مع العلاوة في القسم " + targetDepartment + ": " + totalSalaryInTargetDepartment);
//        }
//    }

}
