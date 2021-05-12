public class MVC {
    public static void main(String[] args) {

        Employee employeeModel = new Employee();

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);

        employeeModel.setFirstName("Asad Adnan");
        employeeModel.setSalary(6000.00);
	employeeModel.setHiredDate(18/jan/2021);
        employeeController.updateTheView();


    }

        private static Employee employee(){
            Employee employee = new Employee();
            employee.setEmployeeID(001);
            employee.setFirstName("Rehman Ali");
            employee.setLastName("Asad Ali");
            employee.setGender("Male");
            employee.setHiredDate("1/june/2020");
            employee.setSalary(10000);
            return employee;
        }
}
