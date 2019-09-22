package ru.job4j;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
	@Test
	public void when5() {
		CheckPrimeNumber prime = new CheckPrimeNumber();
		boolean rsl = prime.check(5);
		assertThat(rsl, is(true));
	}

	@Test
	public void when4() {
		CheckPrimeNumber prime = new CheckPrimeNumber();
		boolean rsl = prime.check(4);
		assertThat(rsl, is(false));
	}
}