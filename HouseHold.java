package nga.oop2;

public class HouseHold {
	private int numberOfPeople;
	private int numberOfHouse;
	private Member[] member;

	public HouseHold() {
		super();
	}

	public HouseHold(int numberOfHouse, int numberOfPeople, Member[] member) {

		this.numberOfHouse = numberOfHouse;
		this.numberOfPeople = numberOfPeople;
		this.member = member;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getNumberOfHouse() {
		return numberOfHouse;
	}

	public void setNumberOfHouse(int numberOfHouse) {
		this.numberOfHouse = numberOfHouse;
	}

	public Member[] getMember() {
		return member;
	}

	public void setMember(Member[] member) {
		this.member = member;
	}

	private String member(Member[] members) {
		String re = "";
		for (int i = 0; i < members.length; i++) {
			re += members[i].toString() + "\t";
		}
		return re;
	}

	@Override
	public String toString() {
		return "HouseHold [numberOfHouse: " + numberOfHouse + ", numberOfPeople: " + numberOfPeople + ", member: "
				+ member(member) + "]";
	}

}
