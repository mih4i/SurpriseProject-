package project_2_surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	private static Random randomSurprise = new Random();
	private static ArrayList<String> fortuneCookies = new ArrayList<String>(Arrays.asList("I have no special talent. I "
			+ "am only passionately curious. Albert Einstein", "Wisely, and slow. They stumble that run fast. William Shakespeare",
			"If you judge people, you have no time to love them. Mother Teresa", "All that we are is the result of what we have thought. Buddha",
			"The most courageous act is still to think for yourself. Aloud. Coco Chanel", "Stay hungry, stay foolish. Steve Jobs",
			"The greatest wealth is to live content with little. Plato", "The future belongs to those who prepare for it today. Malcolm X",
			"You miss 100 percent of the shots you never take. Wayne Gretzky", "Whatever you are, be a good one. Abraham Lincoln",
			"Be the hero of your own story. Joe Rogan", "What worries you, masters you. John Locke", 
			"Learn to value yourself, which means: to fight for your happiness. Ayn Rand", "You’ll never find a rainbow "
			+ "if you’re looking down. Charlie Chaplin","Life is not a problem to be solved, but a reality to be experienced. Søren Kierkegaard", 
			"That which does not kill us makes us stronger. Friedrich Nietzsche", "Experience is the teacher of all things. Julius Caesar",
			"Be alone, that is the secret of invention; be alone, that is when ideas are born. Nikola Tesla",
			"Never discourage anyone who continually makes progress, no matter how slow. Plato"));
	private String fortune;
	
	
	private FortuneCookie(String fortune) {
		enjoy();
		//System.out.println(fortune);
		this.fortune = fortune;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Congratulations! You received a fortune cookie!");
	}
	
	public static FortuneCookie generate() {
		int suprise = randomSurprise.nextInt(fortuneCookies.size());
		String surprise = fortuneCookies.get(suprise);
		return new FortuneCookie(surprise);
	}
	
	@Override
	public String toString() {
		return this.fortune;
	}
}
