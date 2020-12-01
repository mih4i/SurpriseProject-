package project_2_surprises;

public class BagFactory implements IBagFactory{
	private static BagFactory factory = null;
	
	private BagFactory() {}
	
	public static BagFactory factoryInstance() {
		if(factory == null) {
			factory = new BagFactory();
		}
		
		return factory;
	}
	
	@Override
	public IBag makeBag(String type) {

		switch(type) {
			case "RANDOM":
				return new ContainerRandom();
			case "FIFO":
				return new Container_FIFO();
			case "LIFO":
				return new ContainerLIFO();
			default:
				return new ContainerRandom();
				
		}
	}
}
