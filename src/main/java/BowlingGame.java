
public class BowlingGame{

	private static final char FIRST_ASCII_DIGIT = '0';
	private static final char STRIKE = 'X';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BowlingGameInterface#computeScore(java.lang.String)
	 */
	public int computeScore(String input) {
		int[] numbers = scoreAsNumbers(input);

		int total = 0;
		for (int individualScore : numbers)
			total += individualScore;

		for (int index = 0; index < input.length(); index++)
			if (input.charAt(index) == STRIKE) {
				if (index + 1 < input.length())
					total += numbers[index + 1];
				if (index + 2 < input.length())
					total += numbers[index + 2];
			}
		return total;
	}

	/**
	 * @param input
	 * @return
	 */
	private int[] scoreAsNumbers(String input) {
		int[] numbers = new int[input.length()];
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == STRIKE)
				numbers[index] = 10;
			else
				numbers[index] = input.charAt(index) - FIRST_ASCII_DIGIT;
		}
		return numbers;
	}

}
