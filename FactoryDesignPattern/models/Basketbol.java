package FactoryDesignPattern.models;

public class Basketbol implements Team {

	private String teamNameAttr;
	private int teamPlayerCountAttr;
	private String teamColorsAttr;
	private int year;
	
	public Basketbol(String teamNameAttr, int teamPlayerCountAttr, String teamColorsAttr, int year) {
		this.teamNameAttr = teamNameAttr;
		this.teamPlayerCountAttr = teamPlayerCountAttr;
		this.teamColorsAttr = teamColorsAttr;
		this.year = year;
	}

	@Override
	public void teamName() {
		System.out.println("Takım Adı : "+ this.teamNameAttr);
	}
	
	@Override
	public void teamType() {
		System.out.println("Basketbol");
	}
	@Override
	public void teamPlayerCount() {
		// TODO Auto-generated method stub
		System.out.println("Oyuncu Sayısı : "+ this.teamPlayerCountAttr);

	}
	@Override
	public void teamColors() {
		// TODO Auto-generated method stub
		System.out.println("Takım Renkleri : "+ this.teamColorsAttr);

	}
	@Override
	public void getYear() {
		// TODO Auto-generated method stub
		System.out.println("Kuruluş Yılı : "+ this.year);

	}
}
