public class Samurai extends Human{
	static int samCount = 0;
	public Samurai() {
		this.health = 200;
		samCount ++;
	}
	public void deathBlow(Human killed) {
		killed.health = 0;
		killed.strength = 0;
		killed.stealth = 0;
		killed.intelligence = 0;
		samCount --;
		this.health /= 2;
		System.out.println("Has killed" + killed.health);
		System.out.println("Samurai health is reduced to: " + this.health);
	}
	public void meditate() {
		this.health *= 1.5;
	}
	static void howManySam() {
		System.out.println(samCount); 
	}
}
