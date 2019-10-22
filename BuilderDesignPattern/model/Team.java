package BuilderDesignPattern.model;

import BuilderDesignPattern.builder.IBuilder;

public class Team {
	private String teamName;
	private String teamType;
	private int count;
	private String colors;
	private int year;
	
	private Team(TeamBuilder builder) {
		this.teamName = builder.teamNameAttr;
		this.teamType = builder.teamTypeAttr;
		this.count = builder.countAttr;
		this.colors = builder.colorsAttr;
		this.year = builder.yearAttr;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamType() {
		return teamType;
	}
	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public static class TeamBuilder implements IBuilder<TeamBuilder,Team> {
		private String teamNameAttr;
		private String teamTypeAttr;
		private int countAttr;
		private String colorsAttr;
		private int yearAttr;
		public TeamBuilder() {}
		public TeamBuilder(String teamNameAttr, String teamTypeAttr, int countAttr, String colorsAttr, int yearAttr) {
			this.teamNameAttr = teamNameAttr;
			this.teamTypeAttr = teamTypeAttr;
			this.countAttr = countAttr;
			this.colorsAttr = colorsAttr;
			this.yearAttr = yearAttr;
		}

		@Override
		public TeamBuilder teamName(String teamName) {
			this.teamNameAttr = teamName;
			return this;
		}

		@Override
		public TeamBuilder teamType(String teamType) {
			this.teamTypeAttr = teamType;
			return this;
		}

		@Override
		public TeamBuilder teamPlayerCount(int count) {
			this.countAttr = count;
			return this;
		}

		@Override
		public TeamBuilder teamColors(String colors) {
			this.colorsAttr = colors;
			return this;
		}

		@Override
		public TeamBuilder getYear(int year) {
			this.yearAttr = year;
			return this;
		}

		@Override
		public Team buildTeam() {
			return new Team(this);
		}
	}
}
