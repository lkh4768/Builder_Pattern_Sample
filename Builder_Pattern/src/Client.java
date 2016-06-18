public class Client {
	public static void main(String[] args) {
		Employee employee = new Employee.Builder("160001", "lee").age(11).phoneNum("010-1234-1234").build();

		System.out.println(employee.toString());
	}
}
