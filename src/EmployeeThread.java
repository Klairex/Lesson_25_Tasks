public class EmployeeThread extends Thread {
    private Employee[] employees;

    public EmployeeThread(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        try {
            for (Employee employee : employees) {
                System.out.println(employee.getEmployeeDetails());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread-ul a fost intrerupt !!!!");
        }
    }
}