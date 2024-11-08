// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int totalsum = Integer.parseInt(args[3]);
		// Calculate how much money each person need to pay
		double eachprice = Math.ceil(totalsum / 3.0);
		System.out.println("Dear " + name3 + ", " + name2 + " and, " + name1 + ": pay " + eachprice + " Shekels each");
	}
}
