public class Calculate {
    public static void main(String[] args) {

        int hours = 6;
        double meters = 5;

        Time time = new Time();
        int minutes = time.hoursToMinutes(hours);
        int seconds = time.minutesToSeconds(minutes);
        int miliseconds =time.secondsToMiliseconds(seconds);

        System.out.println(hours + " godzin to " + minutes + " minut oraz " +  miliseconds + " milisekund");

        Unit unit = new Unit();
        double centimeteres = unit.metersToCentimeters(meters);
        double millimeters = unit.centimetersToMillimeters(centimeteres);
        double meters1 = unit.centimetersToMeters(centimeteres);
        double meters2 = unit.millimetersToMeters(millimeters);

        System.out.println(meters + " metrów to " + centimeteres + " centymetrów oraz " +  millimeters + " milimetrów");






    }
}
