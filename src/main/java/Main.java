public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65,68));
    }

    public static String getDurationString(int seconds){
        int minutes;
        if (seconds < 0) {
            return "Invalid second(s) input.";
        }else{
            minutes = seconds / 60;
        }
        return getDurationString(minutes, seconds);
    }


    public static String getDurationString(int minutes, int seconds){
        int hours;
        int remainingMinutes;
        int remainingSeconds;
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid input for minutes of seconds. \r" +
                    "Minutes must be greater than zero and seconds should be between 0 and 59.";
        }else{
            hours = minutes / 60;
            System.out.println("hours: " + hours);

            remainingMinutes = minutes % 60;
            System.out.println("minutes: " + minutes);
            System.out.println("remaining minutes: " + remainingMinutes);
            remainingSeconds = seconds % 60;
        }

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
