package nga.oop2;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		MainTest m = new MainTest();
		HouseHold[] houseHolds = m.enterHouseHold();
		System.out.println("====================================================");
		System.out.println("Show information of households: ");
		m.showHouseHolds(houseHolds);
	}

	public HouseHold[] enterHouseHold() {
		int n, numberOfPeople, numberOfHouse;

		HouseHold[] houseHolds;
		Member[] members;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of households: ");
		n = Integer.parseInt(scan.nextLine());
		houseHolds = new HouseHold[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Household[" + (i + 1) + "] :");
			System.out.println("Enter number of house: ");
			numberOfHouse = Integer.parseInt(scan.nextLine());
			System.out.println("Enter number of people: ");
			numberOfPeople = Integer.parseInt(scan.nextLine());
			members = enterMember(numberOfPeople);

			houseHolds[i] = new HouseHold(numberOfHouse, numberOfPeople, members);
		}

		return houseHolds;
	}

	public Member[] enterMember(int numberOfPeople) {
		Member[] members = new Member[numberOfPeople];
		Scanner scan = new Scanner(System.in);
		int age, yOB;
		String name, job;
		System.out.println("Enter information of member: ");
		for (int j = 0; j < members.length; j++) {
			System.out.println("Member " + (j + 1));
			System.out.println("Enter name: ");
			name = scan.nextLine();
			System.out.println("Enter age: ");
			age = Integer.parseInt(scan.nextLine());
			System.out.println("Enter year of birth: ");
			yOB = Integer.parseInt(scan.nextLine());
			System.out.println("Enter job: ");
			job = scan.nextLine();
			members[j] = new Member(name, age, yOB, job);
		}
		return members;
	}

	public void showHouseHolds(HouseHold[] houseHolds) {
		for (HouseHold houseHold : houseHolds) {
			System.out.println(houseHold.toString());
		}
	}
}
