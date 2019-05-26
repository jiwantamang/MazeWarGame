package mazegame.entity;

public class Weapon {
	private String name;
	private String price_gb;
	private String damage;
	private String weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice_gb() {
		return price_gb;
	}
	public void setPrice_gb(String price_gb) {
		this.price_gb = price_gb;
	}
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public String toString(){
		return new String(name + "\t" + price_gb + "\t" + damage + "\t" +"weight");
	}
}
