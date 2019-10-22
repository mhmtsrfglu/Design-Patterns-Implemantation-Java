package FactoryDesignPattern.factory;

import FactoryDesignPattern.models.Basketbol;
import FactoryDesignPattern.models.Futbol;
import FactoryDesignPattern.models.Team;
import FactoryDesignPattern.models.Voleybol;

public class TeamFactory {
	public static Team createTeam(String teamType,String teamNameAttr, int teamPlayerCountAttr, String teamColorsAttr, int year) {
		if(teamType == null)
			return null;
		
		if(teamType.equalsIgnoreCase("FUTBOL")) {
			return new Futbol(teamNameAttr, teamPlayerCountAttr, teamColorsAttr, year);
		}else if(teamType.equalsIgnoreCase("VOLEYBOL")) {
			return new Voleybol(teamNameAttr, teamPlayerCountAttr, teamColorsAttr, year);
		}else if(teamType.equalsIgnoreCase("BASKETBOL")) {
			return new Basketbol(teamNameAttr, teamPlayerCountAttr, teamColorsAttr, year);
		}
		
		return null;
	}
}
