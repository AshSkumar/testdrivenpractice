import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame game;

	@Before
	public void setUp() {
		game = new BowlingGame();		
	}

	@Test
	public void validSimpleScore() {
		String input = "7";
		int expected = 7;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validTwoScores() {
		String input = "72";
		int expected = 9;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validSomeScores() {
		String input = "7235678";
		int expected = 38;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validSingleStrike() {
		String input = "72X5678";
		int expected = 56;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validTwoStrikes() {
		String input = "72X56X81";
		int expected = 69;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validTwoConsecutiveStrikes() {
		String input = "72XX5681";
		int expected = 75;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void validTrailingConsecutiveStrikes() {
		String input = "725XX";
		int expected = 44;
		int actual = game.computeScore(input);
		Assert.assertEquals(expected, actual);
	}

}
