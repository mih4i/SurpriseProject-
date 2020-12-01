package project_2_surprises;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	private static Random random = new Random();
	
	private GatherSurprises() {}
	
	//genereaza un array de surprize
	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surpriseArray = new ArrayList<ISurprise>();
		int previous = -1;	//variabila pentru stocare tip surpriza precendenta
		for(int i = 0; i < n; i++) {
			int type = random.nextInt(3);

			//verifica ca tipul de surpriza sa fie diferit de cel anterior
			while(type == previous) {
				type = random.nextInt(3);
			}
			
			switch(type) {
				case 0:
					surpriseArray.add(Candies.generate());
					break;
				case 1:
					surpriseArray.add(MinionToy.generate());
					break;
				case 2:
					surpriseArray.add(FortuneCookie.generate());	
					break;
				default:
					break;
			}
			
			previous = type;	//stocare tip surpriza precendenta
		}
		
		return surpriseArray;
	}
	
	//genereaza o singura surpriza
	public static ISurprise gather() {
		ISurprise surprise;
		int type = random.nextInt(3);
		switch(type) {
			case 0:
				surprise = Candies.generate();
				return surprise;
			case 1:
				surprise = MinionToy.generate();
				return surprise;
			case 2:
				surprise = FortuneCookie.generate();
				return surprise;
			default:
				surprise = null;
				return surprise;	
		}
	}
}
