package project_2_surprises;

public interface IBagFactory {
	
	// Create a new container, according to the specified type
	IBag makeBag(String type);
}
