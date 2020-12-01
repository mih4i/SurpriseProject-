package project_2_surprises;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{
	
	public GiveSurpriseAndApplause(String type, int waitTime) {
		super(type, waitTime);
		giveWithPassion();
	}
	
	@Override
	protected void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}
}
