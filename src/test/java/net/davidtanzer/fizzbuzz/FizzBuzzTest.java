package net.davidtanzer.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzTest {

	@Test
	public void OneReturnsOne() {
		List<String> result = fizzBuzz();
		assertThat(result.get(1-1)).isEqualTo("1");
	}

	@Test
	public void TwoReturnsTwo() {
		List<String> result = fizzBuzz();
		assertThat(result.get(2-1)).isEqualTo("2");
	}

	@Test
	public void Returns99Lines() {
		List<String> result = fizzBuzz();
		assertThat(result.size()).isEqualTo(99);
	}

	@Test
	public void ThreeReturnsFizz() {
		List<String> result = fizzBuzz();
		assertThat(result.get(3-1)).isEqualTo("Fizz");
	}

	@Test
	public void MultipleOfThreeReturnsFizz() {
		List<String> result = fizzBuzz();
		assertThat(result.get(6-1)).isEqualTo("Fizz");
		assertThat(result.get(9-1)).isEqualTo("Fizz");
		assertThat(result.get(12-1)).isEqualTo("Fizz");
	}

	private List<String> fizzBuzz() {
		return IntStream.range(1, 100)
				.mapToObj(this::x)
				.collect(Collectors.toList());
	}

	private String x(int i) {
		if (i % 3 == 0) {
			return "Fizz";
		}
		return Integer.toString(i);
	}
}
