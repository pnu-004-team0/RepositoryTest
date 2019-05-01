import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibrarymanagerTest {

	@Test
	public void testAdd() {
		Librarymanager lib = new Librarymanager();
		double result = lib.add(10, 50);
		assertEquals(60, result, 0);
		
	}
}
