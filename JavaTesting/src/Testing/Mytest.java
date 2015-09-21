package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mytest {

	@Test
	public void test() {
		squaretesting test=new squaretesting();
		int output=test.square(5);
		assertEquals(25,output);
	}

}
