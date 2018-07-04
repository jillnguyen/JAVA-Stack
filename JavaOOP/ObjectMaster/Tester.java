public class Tester {
	public static void main(String[] args) {
		Ninja ninja1 = new Ninja();
		Ninja ninja2 = new Ninja();
		Wizard wizard1= new Wizard();
		Wizard wizard2= new Wizard();
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		Samurai sam3 = new Samurai();
		Samurai sam4 = new Samurai();
		Samurai sam5 = new Samurai();
		ninja1.steal(sam2);
		ninja1.runAway();
		wizard1.heal(sam2);
		sam2.deathBlow(sam3);
		wizard2.fireball(ninja2);
		sam2.meditate();
		sam4.deathBlow(sam5);
		Samurai.howManySam();
		ninja1.displayInfo();
		ninja2.displayInfo();
		wizard1.displayInfo();
		wizard2.displayInfo();
		sam1.displayInfo();
		sam2.displayInfo();
		sam3.displayInfo();
		sam4.displayInfo();
		sam5.displayInfo();	
	}
}
