import java.util.ArrayList;

public class Member {
    private String name;
    private Team team;
    private ArrayList<Session> availableSession;
    private boolean availability;
    
    public Member(String name, Team team, ArrayList<Session> availableSession, boolean availability) {
        this.name = name;
        this.team = team;
        this.availableSession = availableSession;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public ArrayList<Session> getAvailableSession() {
        return availableSession;
    }

    public void setAvailableSession(ArrayList<Session> availableSession) {
        this.availableSession = availableSession;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


}
