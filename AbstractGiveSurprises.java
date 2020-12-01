package project_2_surprises;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;
	
	public AbstractGiveSurprises(String type, int waitTime) {
		BagFactory factoryOfBags = BagFactory.factoryInstance();
		this.bag = factoryOfBags.makeBag(type);
		this.waitTime = waitTime;
	}
	
	protected void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}
	
	protected void put(IBag  surprises) {
		this.bag.put(surprises);
	}
	
	protected void give(){
		this.bag.takeOut();
		giveWithPassion();
	}
	
	protected void giveAll() {
		while(!this.isEmpty()) {
			System.out.println(this.bag.takeOut().toString());
			//Sleep for X seconds - code snippet
			try {
			  TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			}
		}
		giveWithPassion();
	}
	
	protected boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	abstract void giveWithPassion();
}
