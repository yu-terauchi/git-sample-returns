package practice.gitsamplereturns;

public class Car {
	private Integer speed;

	public Car() {}
	
	public Car(Integer speed) {
		super();
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	
}
