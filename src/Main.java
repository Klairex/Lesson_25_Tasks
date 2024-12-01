public class Main {

        public static void main(String[] args) {
            Employee[] employees = {
                    new Employee("Ion", 30, "Marketing"),
                    new Employee("Andrei", 28, "Vinzari"),
                    new Employee("Alina", 35, "HR"),
                    new Employee("Elena", 40, "IT"),
                    new Employee("Petru", 25, "Manager")
            };

            EmployeeThread employeeThread = new EmployeeThread(employees);
            employeeThread.start();

            try {
                employeeThread.join();
                System.out.println("Toti lucratorii au fost afisati.");
            } catch (InterruptedException e) {
                System.out.println("Thread-ul a fost intrerupt!");
            }
        }


}
