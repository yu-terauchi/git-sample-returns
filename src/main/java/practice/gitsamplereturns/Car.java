package practice.gitsamplereturns;

/**
 * 車に関する情報を表すドメイン
 * 
 * @author yu.terauchi
 *
 */
public class Car {
	/**スピード*/
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
