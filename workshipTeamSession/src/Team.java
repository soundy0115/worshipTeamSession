import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Member> teamMembers;
    public Team(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public ArrayList<Member> getTeamMembers() {
        return teamMembers;
    }
    public void setTeamMembers(ArrayList<Member> teamMembers) {
        this.teamMembers = teamMembers;
    }
    
}
