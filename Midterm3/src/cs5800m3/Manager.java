package cs5800m3;

public class Manager extends Employee {

	@Override
	public ComeToWork getComeToWork(String comeToWorkType) {
		if(comeToWorkType.equalsIgnoreCase("Manage")) {
			return new Program();
		}
		else if(comeToWorkType.equalsIgnoreCase("Program")) {
			return new Manage();
		}
		return null;
		
	}
	}
	

