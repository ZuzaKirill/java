package task_5;

public class Drip {
    private int count;
    private int current = 1;
    private int employee = 1;

    public Drip(int number_of_employees) {
        this.count = number_of_employees;
    }

    public int getCount() {
        return count;
    }

    public int getCurrent() {
        return current;
    }

    public int getemployee() {
        return employee;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setemployee(int c_employee) {
        this.employee = c_employee;
    }
}
