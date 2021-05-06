
public class App {

	public static void main(String[] args) {
		//list of variables
		//this is only a test
		/*
		 * item price - int
		 * Amount of money in wallet - double
		 * Number of friends - int
		 * Age in years (as a whole number) - int
		 * First name - string
		 * Last name - string
		 * Middle intial - char
		 */
	
		int apple = 2;
		int banana = 1;	
		double walletMoney = 35.37;
		int numberOfFriends = 5;
		int wifesFriends = 4;
		int husbandAge = 36;
		int wifesAge = 36;
		String husbandName = "Adam";
		String husbandLastName = "Fite";
		char husbandMiddleInitial = 'C';
		String wifesName = "Anna";
		String wifesMaidenName = "Pry";
		char wifesMiddleInitial = 'M';
		
		System.out.println("A husband and wife went to the farmers market, let us call them" + ' ' + (husbandName + ' ' + '&' + ' ' + wifesName + ' ' + husbandLastName));
		System.out.println("The price of an apple was" + ' ' + apple + ' ' + "dollars");
		System.out.println("The price of an banana was" + ' ' + banana + ' ' + "dollar");
		System.out.println("Their wallet contained" + ' ' + (walletMoney - apple) + ' ' + "after buying an apple");
		System.out.println((husbandName) + ' ' + "was still hungry, so he purchased a banana and now is left with" + ' ' + (walletMoney - apple - banana));
		
		System.out.println("The Number of Friends the husband is averaging over his life is one every" + ' ' + (husbandAge / numberOfFriends) + ' ' + "years");
		System.out.println("The Number of Friends the wife is averaging over her life is one every" + ' ' + (wifesAge / wifesFriends) + ' ' + "years");
		
		System.out.println("My name is what? My name is who? Chica chica Slim ..." + (husbandName + ' ' + husbandMiddleInitial + ' ' + husbandLastName));
		System.out.println("Say my name, Say my name ..." + (wifesName + ' ' + wifesMiddleInitial + ' ' + wifesMaidenName));
	}

}
  