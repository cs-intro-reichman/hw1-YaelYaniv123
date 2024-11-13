// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
		int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
		String daytime;
		if (hours > 12) {
			daytime = "PM";
			hours = hours - 12;
		}
		else {
			if (hours < 12){
				daytime = "AM";
			}
			else {
				daytime = "PM";
			}
		}
		String timeFinal = "" + hours;
		if (minutes < 10){
				timeFinal = timeFinal + ":0" + minutes;
		}
		else {
				timeFinal = timeFinal + ":" + minutes;
		}
		System.out.println(timeFinal + " " + daytime);
	}
}