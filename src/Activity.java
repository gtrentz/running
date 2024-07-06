/**
 * New running activity
 * @author gtrentz
 * Created: 07/05/2024
 */

public class Activity {
    private long seconds;
    private double distance;
    private String name;
    private String description;
    private String date;
    private String time;

    /**
     * Classic constructor - may have it default to "New Activity" for the name; will depend on the frontend
     * @param seconds
     * @param distance
     * @param name
     * @param description
     * @param date
     * @param time
     */
    public Activity(long seconds, double distance, String name, String description, String date, String time) {
        this.seconds = seconds;
        this.distance = distance;
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    /**
     * @return Duration of activity in seconds
     */
    public long getSeconds() {
        return seconds;
    }

    /**
     * @return Distance of activity in miles
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @return Name of activity
     */
    public String getName() {
        return name;
    }

    /**
     * @return Description of activity
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return Date of activity
     */
    public String getDate() {
        return date;
    }

    /**
     * @return Time of activity
     */
    public String getTime() {
        return time;
    }
}
