public class Human {
	protected int strength;
	protected int health;
	protected int intelligence;
	protected int stealth;
	public Human() {
		this.strength = 3;
		this.health = 100;
		this.intelligence = 3;
		this.stealth = 3;
	}
	public void attackHuman(Human attacked) {
		attacked.health -= this.strength;
		this.strength += 1;
		System.out.println("Reduced health by " + this.strength);
	}
	public void displayInfo() {
		System.out.println("Health is " + this.health + ". Stealth is " + this.stealth +". Strength is " + this.strength +". Intelligence is " + this.intelligence);
	}
}