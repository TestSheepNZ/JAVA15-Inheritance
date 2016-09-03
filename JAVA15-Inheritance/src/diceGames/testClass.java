package diceGames;

/*
 * This program is part of my learning Java series
 * This one looks at inheritance
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-15-inheritance.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class testClass {
	
	@Test
	public void testDefault()
	{
		haloFleetBattlesDiceClass dice1 = new haloFleetBattlesDiceClass();
		
		for (int count=0 ; count < 6 ; count ++)
		{
			dice1.rollHaloDice();
			System.out.println("  Value on dice is " + dice1.getDiceResult());
			System.out.println("  Number of hits caused is " + dice1.getDiceValue());
		}
	}
	
}
