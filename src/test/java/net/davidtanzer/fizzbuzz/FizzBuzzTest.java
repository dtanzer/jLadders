package net.davidtanzer.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FizzBuzzTest {

	@Test
	void OneReturnsOne() {
		List<String> result = fizzBuzz();
		assertThat(result.get(1 - 1)).isEqualTo("1");
	}

	@Test
	void TwoReturnsTwo() {
		List<String> result = fizzBuzz();
		assertThat(result.get(2 - 1)).isEqualTo("2");
	}

	@Test
	void Returns99Lines() {
		List<String> result = fizzBuzz();
		assertThat(result.size()).isEqualTo(99);
	}

	@Test
	void ThreeReturnsFizz() {
		List<String> result = fizzBuzz();
		assertThat(result.get(3 - 1)).isEqualTo("Fizz");
	}

	@Test
	void MultipleOfThreeReturnsFizz() {
		List<String> result = fizzBuzz();
		assertAll(IntStream.iterate(3, i -> i + 3)
				.takeWhile(i -> i <= 99)
				.filter(i -> i % 5 != 0)
				.mapToObj(i -> () -> assertThat(result.get(i - 1)).isEqualTo("Fizz")));
	}

	@Test
	void FiveReturnsBuzz() {
		List<String> result = fizzBuzz();
		assertThat(result.get(5 - 1)).isEqualTo("Buzz");
	}

	@Test
	void MultipleOfFiveReturnsBuzz() {
		List<String> result = fizzBuzz();
		assertAll(IntStream.iterate(5, i -> i + 5)
				.takeWhile(i -> i <= 99)
				.filter(i -> i % 3 != 0)
				.mapToObj(i -> () -> assertThat(result.get(i - 1)).isEqualTo("Buzz")));
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
		if (i % 5 == 0) {
			return "Buzz";
		}
		// etc
		return Integer.toString(i);
	}
}
