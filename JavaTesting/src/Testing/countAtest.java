package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAtest {

	@Test
	public void test() {
		squaretesting test = new squaretesting();
		int output = test.countA("Aaqib");
		assertEquals(2,output);
	}

}
