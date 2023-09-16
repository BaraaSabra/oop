package Newww.q2;

public class empleye {
    int id;
    String mane;
    double salary;

    public empleye(int id, String mane, double salary) {
        this.id = id;
        this.mane = mane;
        this.salary = salary;
    }

    public empleye(String mane, double salary) {
        this.mane = mane;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
