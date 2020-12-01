package project_2_surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	private static Random randomSurprise = new Random();
	private static ArrayList<String> candies = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "gummy bears",
			"fruits", "vanilla", "caramel", "truffles ", "marzipan"));
	private String candyType;
	private int candyNo;
	
	private Candies(int candy_no, int candyType) {
		enjoy();
		/*
		System.out.println("You received " + candy_no + " "
				+ candies.get(candyType) + (candyType != 1? " candies.":" candy."));
		*/
		this.candyType = candies.get(candyType);
		this.candyNo = candy_no;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Congratulations! You received candies!");
	}
	
	public static Candies generate() {
		int candyType = randomSurprise.nextInt(candies.size());
		int candy_no = randomSurprise.nextInt(100);
		return new Candies(candy_no, candyType);
	}
	
	@Override
	public String toString() {
		return "You received " + this.candyNo + " "
				+ this.candyType + (this.candyNo != 1? " candies.":" candy.");
	}
}
