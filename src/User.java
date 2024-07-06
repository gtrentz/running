/**
 * Class to store user info
 * @author gtrentz
 * Created 07/05/2024
 */

public class User {
    private String name;
    private String email;
    private String password;
    private char gender;
    private float totalMiles;
    private float weeklyMiles;
    private float ytdMiles;

    /**
     * Classic constructor
     * @param name First & last name
     * @param email Email address
     * @param password Password
     * @param gender Gender - M, W, N
     */
    public User(String name, String email, String password, char gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.totalMiles = 0; this.weeklyMiles = 0; this.ytdMiles = 0;
    }

    /**
     * @return Name of user
     */
    public String getName() {
        return name;
    }

    /**
     * @return User's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return User's password
     * @deprecated Security risk? :)
     */
    @Deprecated
    public String getPassword() {
        return password;
    }

    /**
     * @return User's gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Publishes an activity to user's account; updates total, weekly, and YTD miles accordingly
     * @param a Activity to publish
     */
    public void publishActivity(Activity a) {
        this.totalMiles += a.getDistance();
        this.weeklyMiles += a.getDistance();
        this.ytdMiles += a.getDistance();
    }

}