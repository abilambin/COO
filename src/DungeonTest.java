import static org.junit.Assert.*;
import org.junit.Test;

public class DungeonTest {

	
	@Test
	public void testGetCurrentRoom() {
		Dungeon dungeon = new Dungeon();
		assertEquals("entrance", dungeon.getCurrentRoom());
	}

	@Test
	public void testInterpretCommand() {
		fail("Not yet implemented");
	}

	@Test
	public void testStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testNextRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGameIsFinished() {
		fail("Not yet implemented");
	}

	@Test
	public void testGameIsWon() {
		fail("Not yet implemented");
	}

	@Test
	public void testGameIsLost() {
		fail("Not yet implemented");
	}

}
