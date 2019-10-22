/**
 * @author mehmet_serefoglu
 *
 */
package FactoryDesignPattern;

import FactoryDesignPattern.factory.TeamFactory;
import FactoryDesignPattern.models.Team;


public class FactoryDesignPattern {

	public static void main(String[] args) {
		Team myTeam = TeamFactory.createTeam("FUTBOL", "Galatasaray", 11, "Sarı Kırmızı", 1905);
		myTeam.teamName();
		myTeam.teamColors();
		myTeam.teamType();
		
		Team secondTeam = TeamFactory.createTeam("FUTBOL", "HataySpor", 11, "Bordo Beyaz", 1937);
		secondTeam.teamName();
		secondTeam.teamColors();
		secondTeam.teamType();
		
		
		Team basketbolTeam = TeamFactory.createTeam("BASKETBOL", "Beşiktaş", 5, "Siyah Beyaz", 1905);
		basketbolTeam.teamName();
		basketbolTeam.teamColors();
		basketbolTeam.teamType();

	}

}
