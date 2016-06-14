package AddDigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class digitsSumTest {

	@Test
	public void test() {
		AddDigits test = new AddDigits();;
		assertEquals(6, test.digitSum(321));
		assertEquals(1, test.digitSum(1));
		assertEquals(81, test.digitSum(999999999));
		assertEquals(45, test.digitSum(123456789));
	}

}
