package us.jsadi.enums;

public enum Team {
    PACKERS("Packers", "Green Bay"), LIONS("Lions", "Detroit"), BEARS("Bears", "Chicago"), VIKINGS("Vikings", "Minnesota"),
    GIANTS("Giants", "New York"), REDSKINS("Redskins", "Washington"), COWBOYS("Cowboys", "Dallas"), EAGLES("Eagles", "Philadelphia"),
    BUCCANEERS("Buccaneers", "Tampa Bay"), FALCONS("Falcons", "Atlanta"), CARDINALS("Cardinals", "Arizona"), PANTHERS("Panthers", "Carolina"),
    RAMS("Rams", "Los Angeles"), SEAHAWKS("Seahawks", "Seattle"), FORTYNINERS("Forty-niners", "San Francisco");


    String mascot, location;

    private Team(String mascot, String location) {
        this.mascot = mascot;
        this.location = location;
    }
}
