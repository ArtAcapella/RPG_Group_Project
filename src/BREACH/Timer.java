// Alice Leppert

import java.time.LocalTime;

public class Timer {

	public void Start(int seconds) {
		LocalTime start = LocalTime.now();
		System.out.println("Time starts now!");
		LocalTime next1 = start.plusSeconds(seconds);
		LocalTime next2 = next1.plusSeconds(seconds);
		LocalTime next3 = next2.plusSeconds(seconds);
		LocalTime next4 = next3.plusSeconds(seconds);
		LocalTime next5 = next4.plusSeconds(seconds);
		while (true) {
			if (LocalTime.now().compareTo(next1) == 0) {
				System.out.println("You have" + seconds * 4 + "seconds left.");
			} else if (LocalTime.now().compareTo(next2) == 0) {
				System.out.println("You have" + seconds * 3 + "seconds left.");
			} else if (LocalTime.now().compareTo(next3) == 0) {
				System.out.println("You have" + seconds * 2 + "seconds left.");
			} else if (LocalTime.now().compareTo(next4) == 0) {
				System.out.println("You have" + seconds + "seconds left.");
			} else if (LocalTime.now().compareTo(start) == 0) {
				System.out.println("Time is up!");
				break;
			}
		}

	}

}
