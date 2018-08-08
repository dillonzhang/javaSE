package com.test.java.section5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

import java.util.*;
import java.util.stream.Collectors;

public class SteamTest {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian,
				2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012,
						710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

		List<Transaction> tr2011 = transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(Collectors.toList());

		List<String> cities = transactions.stream()
				.map(t -> t.getTrader().getCity()).distinct()
				.collect(Collectors.toList());

		Set<String> cities1 = transactions.stream()
				.map(t -> t.getTrader().getCity()).collect(Collectors.toSet());

		String traderStr = transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct().sorted().collect(Collectors.joining());

		transactions.stream()
				.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.map(Transaction::getValue).forEach(System.out::println);

		Optional<Transaction> highestValue = transactions.stream().max(
				comparing(Transaction::getValue));
		Map<Integer, List<Transaction>> transactionsByCurrencies = transactions.stream().collect(groupingBy(Transaction::getValue));
	}
}
