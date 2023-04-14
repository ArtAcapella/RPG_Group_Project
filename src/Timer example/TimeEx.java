import java.time.LocalTime;

public class TimeEx {

	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		System.out.println("Time starts now!");
		LocalTime next1 = start.plusMinutes(1);
		LocalTime next2 = next1.plusMinutes(1);
		LocalTime next3 = next2.plusMinutes(1);
		LocalTime next4 = next3.plusMinutes(1);
		LocalTime next5 = next4.plusMinutes(1);		
		while(true) {
			if (LocalTime.now().compareTo(next1) ==0) {
			System.out.println("You have 4 minutes left.");
			} else if (LocalTime.now().compareTo(next2) ==0) {
				System.out.println("You have 3 minutes left.");
			}else if (LocalTime.now().compareTo(next3) ==0) {
				System.out.println("You have 2 minutes left.");
			}else if (LocalTime.now().compareTo(next4) ==0) {
				System.out.println("You have 1 minutes left.");
			}else if (LocalTime.now().compareTo(next5) ==0) {
				System.out.println("Time is up!");
				break;
			}
		}

	}

}
