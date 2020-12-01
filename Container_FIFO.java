package project_2_surprises;

public class Container_FIFO extends AbstractContainer implements IBag{
 
	// removes a surprise from the bag and returns it
	@Override
	public ISurprise takeOut() {
		ISurprise temp = container.get(0);
		container.remove(0);
		return temp;
	}

}
