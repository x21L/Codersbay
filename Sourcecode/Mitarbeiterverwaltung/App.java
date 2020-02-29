package src;

import java.util.Random;
import java.util.Scanner;

public class App {

	private static int size = 5;
	private static Employee[] employeeArr = new Employee[size];
	private static int index = 0;

	public static void main(String[] args) {
		application();

	}

	private static int createID() {

		return new Random().nextInt(1000);

	}

	private static void application() {

		Scanner s = new Scanner(System.in);

		Employee emp;
		String empFirstName;
		String empLasttName;

		String again;

		do {

			if (employeeArr.length >= size) {
				doubleEmpArr();
			}

			System.out.println("Bitte legen Sie einen Mitarbeiter an:");
			System.out.print("Vorname ");
			empFirstName = s.nextLine();

			System.out.print("Nachname ");
			empLasttName = s.nextLine();

			Department department = new Department();
			String dept;
			System.out.println("In Welcher Abteilung soll " + empFirstName + " " + empLasttName + " arbeiten?");
			System.out.println(
					"Für Development geben Sie d oder m für Management ein, oder eine beliebige andere Taste für eine Test-Abteilung: ");
			dept = s.nextLine();
			if (dept.equalsIgnoreCase("d")) {
				department = new Department("Development", 2, "Indien", "Bangaladesh");
			} else if (dept.equalsIgnoreCase("m")) {
				department = new Department("Management", 1, "Deutschland", "Berlin");
			} else {
				System.out.println("Eine Test-Abteilung wurde angelegt");
			}

			emp = new Employee(empFirstName, empLasttName, createID(), department);

			toArray(emp);

			System.out.println("Sie haben folgenden Mitarbeiter angelegt:");
			System.out.println();
			emp.print();

			System.out.println("Möchten Sie noch einen Mitarbeiter anlegen?");
			System.out.println("x für beenden. Beliebige Taste für weiter");
			again = s.nextLine();

			if (again.equals("x")) {

				System.out.println("Folgende Mitarbeiter wurden angelegt");

				for (int j = 0; employeeArr[j] != null; j++) {

					System.out.println(
							employeeArr[j].id + " " + employeeArr[j].firstName + " " + employeeArr[j].lastName);

				}

				System.out.println("Auf Wiedersehen!");

				return;
			}

		} while (true);

	}

	private static Employee[] toArray(Employee e) {

		employeeArr[index] = e;
		index++;
		size++;

		return employeeArr;
	}

	private static Employee[] doubleEmpArr() {

		Employee[] copy = employeeArr;
		employeeArr = new Employee[size * 2];

		int i = 0;
		for (Employee employee : copy) {
			employeeArr[i] = employee;
			i++;
		}

		return employeeArr;
	}

}
