public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		Human human3 = new Human();
		Human human4 = new Human();
		Human human5 = new Human();
		human1.attackHuman(human5);
		human1.attackHuman(human2);
		human1.attackHuman(human3);
		human2.attackHuman(human5);
		human4.attackHuman(human5);
		human2.displayInfo();
		human5.displayInfo();
	}
}