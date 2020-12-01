package project_2_surprises;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise{
	//private static Random randomSurprise = new Random();
	private static ArrayList<String> minionToys = new ArrayList<String>(Arrays.asList("Bob", "Dave", "Jerry", "Ken", 
			"Kevin", "Mark", "Mel", "Mike", "Otto", "Stuart", "Tim"));
	public static int previousMinion = -1;
	private String minion;
	
	
	private MinionToy(int minion) {
		enjoy();
		/*
		System.out.println("You revceived your favorite minion: "
		+ minionToys.get(minion));
		*/
		previousMinion++;
		this.minion =minionToys.get(minion);
	}
	
	@Override
	public void enjoy() {
		System.out.println("Congratulations, you received a minion toy!!!");
	}
	
	public static MinionToy generate() {
		if(previousMinion == minionToys.size()-1) {
			previousMinion = -1;
		}
		return new MinionToy(previousMinion+1);
	}
	
	@Override
	public String toString() {
		return "You received your favorite minion: "
				+ this.minion;
	}
}
