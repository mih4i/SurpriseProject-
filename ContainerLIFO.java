package project_2_surprises;

public class ContainerLIFO extends AbstractContainer implements IBag{
	 
	// removes a surprise from the bag and returns it
	@Override
	public ISurprise takeOut() {
		ISurprise temp = container.get(container.size()-1);
		container.remove(container.size()-1);
		return temp;
	}
}
