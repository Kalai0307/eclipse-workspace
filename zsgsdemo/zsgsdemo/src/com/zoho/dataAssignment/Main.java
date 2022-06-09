package com.zoho.dataAssignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface ShowDate {
	void Date();

}

class YesterdayDate implements ShowDate {
	      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	      LocalDateTime now = LocalDateTime.now();

	public void Date() {

		System.out.println(dtf.format(now));

	}
}

public class Main {

	public static void main(String[] args) {

		YesterdayDate y = new YesterdayDate();
		y.Date();

		ShowDate date = new ShowDate() {

			public void Date() {
				String date = "08/06/2022";
				System.out.println(" yesterrday date:" + date);
			}

		};
		date.Date();

	}

}
