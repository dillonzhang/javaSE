package com.test.java.section5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileStreamTest {

	private static Stream<String> lines;

	public static void main(String[] args) {
		long uniqueWords = 0;
		try {
			lines = Files
					.lines(Paths.get("data.txt"), Charset.defaultCharset());
			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
					.distinct().count();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(uniqueWords);
	}
}
