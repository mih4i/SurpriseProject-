package project_2_surprises;

import java.util.ArrayList;

public class MainSurprise {
	public static void main(String[] args) {
		//Test surprise classes
		System.out.println("Surpriza candy.");
		Candies candy = Candies.generate();
		System.out.println("\nSurpriza fortune cookie.");
		FortuneCookie cookie=  FortuneCookie.generate();
		System.out.println("\nSurprize minioni.");
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion1 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion2 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion3 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion4 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion5 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion6 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion7 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion8 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion9 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion10 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion11 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion12 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		MinionToy minion13 = MinionToy.generate();
		System.out.println("previous minion " + MinionToy.previousMinion);
		
		//Test individual bags
		System.out.println("\n___Test Random Bag___");
		ContainerRandom containerRandom = new ContainerRandom();
		System.out.println("Adding surprises to container");
		System.out.println("Random container size: " + containerRandom.size());
		containerRandom.put(minion1);
		containerRandom.put(minion2);
		containerRandom.put(minion3);
		containerRandom.put(minion4);
		containerRandom.put(minion5);
		System.out.println("Random container size: " + containerRandom.size());
		
		System.out.println("\n___Test FIFO Bag___");
		Container_FIFO containerFIFO = new Container_FIFO();
		System.out.println("Adding surprises to container");
		System.out.println("FIFO container size: " + containerFIFO.size());
		containerFIFO.put(minion6);
		containerFIFO.put(minion7);
		containerFIFO.put(minion8);
		containerFIFO.put(minion9);
		containerFIFO.put(minion10);
		System.out.println("FIFO container size: " + containerFIFO.size());
		
		System.out.println("\n___Test LIFO Bag___");
		ContainerLIFO containerLIFO = new ContainerLIFO();
		System.out.println("\nMoving containerFIFO to containerLIFO");
		System.out.println("LIFO container size: " + containerLIFO.size());
		containerLIFO.put(containerFIFO);
		System.out.println("LIFO container size: " + containerLIFO.size());
		System.out.println("FIFO container size: " + containerFIFO.size());

		System.out.println("\nMoving randomContainer to containerFIFO");
		containerFIFO.put(containerRandom);
		System.out.println("FIFO container size: " + containerFIFO.size());
		System.out.println("Random container size: " + containerRandom.size());
		
		System.out.println("\nMoving containerLIFO to containerRandom");
		containerRandom.put(containerLIFO);
		System.out.println("Random container size: " + containerRandom.size());
		System.out.println("LIFO container size: " + containerLIFO.size());
		
		//generate a bundle of surprises with GatherSurprises class
		System.out.println("\n=================================================\n");
		GatherSurprises.gather();
		ArrayList<ISurprise> gatheredSurprises = GatherSurprises.gather(4);
		ContainerRandom containerRandom_2 = new ContainerRandom();
		Container_FIFO containerFIFO_2 = new Container_FIFO();
		ContainerLIFO containerLIFO_2 = new ContainerLIFO();
		//adding the surprises tot the three containers
		System.out.println();
		for(int i = 0; i < gatheredSurprises.size(); i++) {
			System.out.println(gatheredSurprises.get(i));
			containerRandom_2.put(gatheredSurprises.get(i));
			containerFIFO_2.put(gatheredSurprises.get(i));
			containerLIFO_2.put(gatheredSurprises.get(i));
		}
		
		System.out.println("\nTaking out the suprises from the containers.");
		System.out.println("\nRandom container take out");
		for(int i = containerRandom_2.size()-1; i >= 0; i-- ) {
			System.out.println(containerRandom_2.takeOut());
		}
		
		System.out.println("\nFIFO container take out");
		for(int i = containerFIFO_2.size()-1; i >= 0; i-- ) {
			System.out.println(containerFIFO_2.takeOut());
		}
		
		System.out.println("\nLIFO container take out");
		for(int i = containerLIFO_2.size()-1; i >= 0; i-- ) {
			System.out.println(containerLIFO_2.takeOut());
		}
		
		System.out.println("\n=================================================\n");
		
		//test BagFactory single instantiation
		System.out.println("BagFactory instatiations: ");
		BagFactory bag = BagFactory.factoryInstance();
		System.out.println(bag);
		BagFactory bag1 = BagFactory.factoryInstance();
		System.out.println(bag1);
		

		//==================================================
		
		//test give and sing
		System.out.println("\nGive and sing");
		GiveSurpriseAndSing giveAndSing = new GiveSurpriseAndSing("FIFO", 2);
		ArrayList<ISurprise> list_of_suprises = GatherSurprises.gather(4);
		for(int i = 0; i<list_of_suprises.size(); i++) {
			giveAndSing.put(list_of_suprises.get(i));
		}
		System.out.println();
		giveAndSing.giveAll();
		
		
		//test give and hug
		System.out.println("\nGive and hug");
		GiveSurpriseAndHug giveAndHug = new GiveSurpriseAndHug("LIFO", 2);
		list_of_suprises = GatherSurprises.gather(4);
		for(int i = 0; i<list_of_suprises.size(); i++) {
			giveAndHug.put(list_of_suprises.get(i));
		}
		System.out.println();
		giveAndHug.giveAll();

		
		//test give and applaud
		System.out.println("\nGive and applaud");
		GiveSurpriseAndApplause giveAndApplaud = new GiveSurpriseAndApplause("RANDOM", 2);
		list_of_suprises = GatherSurprises.gather(4);
		for(int i = 0; i<list_of_suprises.size(); i++) {
			giveAndApplaud.put(list_of_suprises.get(i));
		}
		System.out.println();
		giveAndApplaud.giveAll();
		
		
		
	}
}
