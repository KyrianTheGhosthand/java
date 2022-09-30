package testpack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
	public static void main (String[] args) {
		Part3();
	}
	static void Part1() {
		String[] langs = {"Java", "C#", "C++", "PHP", "Javascript"};
		List<Integer> nums = Arrays.asList(7, 2, 5, 4, 2, 1);
		Stream<String> s1 = Arrays.stream(langs);
		s1.forEach(s -> System.out.println(s));
		System.out.println("Nums stream: \n");
		nums.stream().forEach(s -> System.out.println(s));
	}
	static void Part2() {
		String[] langs = {"Java", "C#", "C++", "PHP", "Javascript"};
		List<Integer> nums = Arrays.asList(7, 2, 5, 4, 2, 1);
		Stream<String> s1 = Arrays.stream(langs).parallel();
		s1.forEach(s -> System.out.println(s));
		System.out.println("Nums stream: \n");
		nums.stream().parallel().forEach(s -> System.out.println(s));
	}
	static void Part3() {
		IntStream.range(0,8).forEach(System.out::println);
		DoubleStream.of(1,3,4,8).forEach(System.out::println);
	}

	static void Part4() {
		List<Integer> nums = Arrays.asList(7, 2, 5, 4, 2, 1);
		nums.stream()
		.distinct()
		.filter(s -> s >=5)
		.forEach(System.out::println);	
	}
	static void Part5() {
		String[] langs = {"Java", "C#", "C++", "PHP", "Javascript"};
		Stream<String> s1 = Arrays.stream(langs).map(l -> l.toUpperCase());
		s1.forEach(s -> System.out.println(s));
	}
}
