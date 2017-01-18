/**
 * File Name: JoggedHoursProject.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 17, 2017
 */
package com.sqa.ou.helpers;

import java.util.*;

/**
 * JoggedHoursProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursProject {

	public static void main(String[] args) {
		String appName = "Jogged Hours";
		String name = AppBasics.greetUserAndGetName(appName);
		AppBasics.tellUserWhatDayIsToday();
		int daysUserJogged = userSelectDayToday();
		int totalDaysJogged = askUserHowLongRunDaily(daysUserJogged);
		tellUserLevelOfJogger(totalDaysJogged);
		AppBasics.farewellUser(name, appName);
	}

	private static int askUserHowLongRunDaily(int args) {
		int userNumberSelect = args;
		int hours = 0;
		for (int i = 1; i <= userNumberSelect; i++) {
			if (i == 1) {
				hours = day1NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 2) {
				hours += day2NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 3) {
				hours += day3NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 4) {
				hours += day4NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 5) {
				hours += day5NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 6) {
				hours += day6NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else if (i == 7) {
				hours += day7NumHours();
				System.out.println("Week total " + hours + " hrs.");
				System.out.println("Your daily avarage is: " + hours / i + " hrs.");
			} else {
				System.out.println("Invalid Input");
			}
		}
		return hours;
	}

	private static int day1NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Sunday?");
		int day1 = reader.nextInt();
		return day1;
	}

	private static int day2NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Monday?");
		int day2 = reader.nextInt();
		return day2;
	}

	private static int day3NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Tuesday?");
		int day3 = reader.nextInt();
		return day3;
	}

	private static int day4NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Wednesday?");
		int day4 = reader.nextInt();
		return day4;
	}

	private static int day5NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Thursday?");
		int day5 = reader.nextInt();
		return day5;
	}

	private static int day6NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Friday?");
		int day6 = reader.nextInt();
		return day6;
	}

	private static int day7NumHours() {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many hours you jogged on Saturday?");
		int day7 = reader.nextInt();
		return day7;
	}

	private static void tellUserLevelOfJogger(int args) {
		Integer totalJog = args;
		System.out.println("Your total jogging time this week is " + totalJog + " hours.");
		System.out.println("Based on your total runtime you are ");
		if (totalJog > 40) {
			System.out.println(" a Premium Jogger.");
		} else if (totalJog > 20) {
			System.out.println(" an Advanced Jogger.");
		} else if (totalJog > 10) {
			System.out.println(" a Dedicated Runner.");
		} else {
			System.out.println(" an Amateur Runner");
		}
	}

	private static int userSelectDayToday() {
		String input = AppBasics.requestInfoFromUser(
				"Please, specify what day is today 1-Sunday, 2-Monday, 3-Tuesday, 4-Wednesday, 5-Thursday, 6-Friday, 7-Saturday");
		int daysUserJogeedThisWeek = Integer.parseInt(input);
		switch (daysUserJogeedThisWeek) {
		case 1:
			System.out.println("Today is Sunday! You jogged 1 day this week.");
			break;
		case 2:
			System.out.println("Today is Monday! You jogged 2 days this week.");
			break;
		case 3:
			System.out.println("Today is Tuesday! You jogged 3 days this week.");
			break;
		case 4:
			System.out.println("Today is Wednesday! You jogged 4 days this week.");
			break;
		case 5:
			System.out.println("Today is Thursday! You jogged 5 days this week.");
			break;
		case 6:
			System.out.println("Today is Friday! You jogged 6 days this week.");
			break;
		case 7:
			System.out.println("Today is Saturday! You jogged 7 days this week.");
			break;
		default:
			System.out.println("I am not sure I've understood your input.");
			break;
		}
		return daysUserJogeedThisWeek;
	}
}