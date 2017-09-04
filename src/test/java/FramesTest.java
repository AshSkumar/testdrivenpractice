import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class FramesTest {

	private static final String GAME1 = "12121221234678123X11";

	@Test
	public void validFrames() throws Exception {
		BowlingGame b = mock(BowlingGame.class);
		when(b.computeScore(anyString())).thenReturn(42);

		Frames f = new Frames(b);
		int actual = f.getScore(GAME1);

		int expected = 84;
		Assert.assertEquals(expected, actual);
		verify(b).computeScore(GAME1);
	}

	@Test(expected = RuntimeException.class)
	public void invalidFrames() throws Exception {
		BowlingGame b = mock(BowlingGame.class);

		Frames f = new Frames(b);
		f.getScore("12121221234678123");
		verifyZeroInteractions(b);
	}

}
