import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        

        // initialize teams
        Team teamA = new Team("A");
        Team teamB = new Team("B");
        
        // initialize members
        ArrayList<Session> defaultSession = new ArrayList<>();
        defaultSession.add(Session.Drum);
        defaultSession.add(Session.AcousticGuitar);
        defaultSession.add(Session.BassGuitar);
        defaultSession.add(Session.Media);
        defaultSession.add(Session.Singer);


        Member JuhanLee = new Member("이주한", teamB, defaultSession, true);
    }
}
