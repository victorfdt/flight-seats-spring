package com.victorfdt.logwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TestLogWriter implements LogWriter {

	private String algorithm = "";
	private String fileLocation = "/home/victorfdt/projects/flight-seats-spring/TestLogWriter.log";
	private long time = 0;

	public TestLogWriter(String algorithm, long time) {
		super();
		this.algorithm = algorithm;
		this.time = time;
	}

	public TestLogWriter() {
	}

	@Override
	public void writeLog() {

		try {
			String currentDateTime = LocalDateTime.now()
					.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
			String str = "[" + currentDateTime + "]: Algorithm: " + algorithm + " / " + "Time: " + time + "ms";

			// writing the log file
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation, true));
			writer.write(str + "\n");
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException("It was not possible to write the file:", e);
		}
	}

	public List<String> getLogContent() {
		try {
			return Files.readAllLines(Paths.get(fileLocation));
		} catch (IOException e) {
			throw new RuntimeException("It was not possible to read the file:", e);
		}
	}

}
