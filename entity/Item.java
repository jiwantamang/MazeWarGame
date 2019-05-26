package mazegame.entity;

public class Item {
	private String label;
	private String description;
	private int value;	
	private int weight;
		
	public Item(String label,String description, int value, int weight) {
		super();
		this.label = label;
		this.description = description;
		this.value = value;
		this.weight = weight;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString(){
		return new String(label);
	}
}
