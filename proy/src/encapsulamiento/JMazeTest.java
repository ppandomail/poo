package encapsulamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JMazeTest {

	@Test
	public void test1() {
		JMaze maze = new JMaze();
		assertEquals(2, maze.getActualRow());
		assertEquals(2, maze.getActualColumn());
		assertEquals(true, maze.isPacManLookingUp());
	}

	@Test
	public void test2() {
		JMaze maze = new JMaze();
		maze.pacManRight();
		maze.tick();
		maze.tick();
		assertEquals(2, maze.getActualRow());
		assertEquals(4, maze.getActualColumn());
	}

}