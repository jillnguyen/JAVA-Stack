public class Ninja extends Human{

	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Human stealed) {
		stealed.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("Stealed health now:" + stealed.health);
	}
	public void runAway() {
		this.health -= 10;
		System.out.println("Ninja run away");
	}
}