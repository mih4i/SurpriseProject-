package project_2_surprises;

import java.util.Random;

public class ContainerRandom extends AbstractContainer implements IBag{
	private Random randomSurprise = new Random();
	 
	//removes a surprise from the bag and returns it
	@Override
	public ISurprise takeOut() {
		int	rand_no = randomSurprise.nextInt(container.size());
		ISurprise temp = container.get(rand_no);
		container.remove(rand_no);
		
		return temp;
	}
}
