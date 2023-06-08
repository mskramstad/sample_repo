import java.util.ArrayList;

public class JavaMain {

    public JavaMain() {

    }

    public void start() {
        ArrayList<String> teams = new ArrayList<String>();

        teams.add("Atlanta Braves");
        teams.add("Los Angeles Dodgers");
        teams.add("Los Angeles Angels");

        for (String team : teams) {
            System.out.println(team);
        }
    }
}
