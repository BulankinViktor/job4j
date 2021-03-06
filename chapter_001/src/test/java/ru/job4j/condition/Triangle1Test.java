package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class Triangle1Test {
	@Test
	public void whenExist() {
		boolean result = Triangle.exist(2.0, 2.0, 2.0);
		assertThat(result, is(true));
	}

	@Test
	public void notExist() {
		boolean result = Triangle.exist(2.0, 3.0, 0.0);
		assertThat(result, is(true));
	}
}

