package project_2_surprises;

import java.util.ArrayList;

public abstract class AbstractContainer implements IBag{
	protected ArrayList<ISurprise> container = new ArrayList<ISurprise>();
	
	//adds a surprise in the bag
		@Override
		public void put(ISurprise newSurprise) {
			this.container.add(newSurprise);
		}
		 
		// adds all the surprises from another IBag
		//   -> the 'bagOfSurprises' will be empty() afterwards
		@Override
		public void put(IBag bagOfSurprises) {
			while(!bagOfSurprises.isEmpty()) {
				this.container.add(bagOfSurprises.takeOut());
			}
		}
		
		// Checks if the bag is empty or not
		@Override
		public boolean isEmpty() {
			if(size() == 0) {
				return true;
			}else {
				return false;
			}
		}
		
		// Returns the number of surprises
		@Override
		public int size() {
			return this.container.size();
		}
	
}
