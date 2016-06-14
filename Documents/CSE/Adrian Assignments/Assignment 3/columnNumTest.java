package ExcelSheet;

import static org.junit.Assert.*;

import org.junit.Test;

public class columnNumTest {

	@Test
	public void test() {
		ExcelSheet test = new ExcelSheet();
		assertEquals(1, test.columnNum("A"));
		assertEquals(27, test.columnNum("AA"));
		assertEquals(26, test.columnNum("Z"));
		assertEquals(52, test.columnNum("AZ"));
		assertEquals(53, test.columnNum("BA"));
	}

}
