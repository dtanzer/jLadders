package net.davidtanzer.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzTest {

	@Test
	public void OneReturnsOne() {
		List<String> result = fizzBuzz();
		assertThat(result.get(0)).isEqualTo("1");
	}

	@Test
	public void TwoReturnsTwo() {
		List<String> result = fizzBuzz();
		assertThat(result.get(1)).isEqualTo("2");
	}

	private List<String> fizzBuzz() {
		return Arrays.asList("1", "2");
	}
}
