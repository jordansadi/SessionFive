package us.jsadi.enums;

/**
 * This enum defines the list of teams.
 * Each NFC team except the New Orleans Saints is represented.
 * Created by jsadi on 9/19/2018
 * @author Jordan Sadi
 * @version 2018 0919 .3
 */
public enum Team {
    PACKERS("Packers", "Green Bay"), LIONS("Lions", "Detroit"), BEARS("Bears", "Chicago"), VIKINGS("Vikings", "Minnesota"),
    GIANTS("Giants", "New York"), REDSKINS("Redskins", "Washington"), COWBOYS("Cowboys", "Dallas"), EAGLES("Eagles", "Philadelphia"),
    BUCCANEERS("Buccaneers", "Tampa Bay"), FALCONS("Falcons", "Atlanta"), CARDINALS("Cardinals", "Arizona"), PANTHERS("Panthers", "Carolina"),
    RAMS("Rams", "Los Angeles"), SEAHAWKS("Seahawks", "Seattle"), FORTYNINERS("Forty-niners", "San Francisco");

    String mascot, location;

    /**
     * This constructor defines a Team; each Team must have a mascot and a location.
     * @param mascot String the mascot of the Team
     * @param location String the location (city or state) of the Team
     */
    Team(String mascot, String location) {
        this.mascot = mascot;
        this.location = location;
    }
}
