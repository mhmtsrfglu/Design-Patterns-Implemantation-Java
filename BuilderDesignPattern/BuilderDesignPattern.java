package BuilderDesignPattern;
import BuilderDesignPattern.model.Team;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		Team team = new Team.TeamBuilder()
				.teamName("Galatasaray")
				.teamColors("Sarı Kırmızı")
				.teamPlayerCount(11)
				.teamType("FUTBOL")
				.getYear(1905)
				.buildTeam();
		
		System.out.println(team.getTeamName());
	}
}
