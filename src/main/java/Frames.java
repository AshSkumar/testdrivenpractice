
public class Frames {
	
	private BowlingGame game;

	public static void main(String[] args) throws Exception {
		BowlingGame b = new BowlingGame();
		Frames f = new Frames(b);
		int i = f.getScore("12121221234678123X11");
		System.out.println(i);
	}

	public Frames(BowlingGame game) {
		this.game = game;
	}
	
	public int getScore(String s) throws Exception
	{
		int length = s.length();
		for(int i = 0; i < s.length()-1; i++)
		{
			if(s.charAt(i) == 'X')
				length++;
		}
		if(length == 20 || length == 21)
		{
			return(game.computeScore(s))*2;
		}
		throw new RuntimeException();
			
	}

}
