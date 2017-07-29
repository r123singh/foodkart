package services;

import games.GameConsummables;
import games.GameType;

import java.util.Date;

public class Games {

	private String serviceIdentifier;
	private String serviceDesription;
	private int gameEmployees;
	private int totalCoost;
	private Date gamesDate;
	private GameType gameTypes;
	private int playingFrequency;
	private GameConsummables consummables;

	public String getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setServiceIdentifier(String serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public String getServiceDesription() {
		return serviceDesription;
	}

	public void setServiceDesription(String serviceDesription) {
		this.serviceDesription = serviceDesription;
	}

	public int getGameEmployees() {
		return gameEmployees;
	}

	public void setGameEmployees(int gameEmployees) {
		this.gameEmployees = gameEmployees;
	}

	public int getTotalCoost() {
		return totalCoost;
	}

	public void setTotalCoost(int totalCoost) {
		this.totalCoost = totalCoost;
	}

	public Date getGamesDate() {
		return gamesDate;
	}

	public void setGamesDate(Date gamesDate) {
		this.gamesDate = gamesDate;
	}

	public GameType getGameTypes() {
		return gameTypes;
	}

	public void setGameTypes(GameType gameTypes) {
		this.gameTypes = gameTypes;
	}

	public int getPlayingFrequency() {
		return playingFrequency;
	}

	public void setPlayingFrequency(int playingFrequency) {
		this.playingFrequency = playingFrequency;
	}

	public GameConsummables getConsummables() {
		return consummables;
	}

	public void setConsummables(GameConsummables consummables) {
		this.consummables = consummables;
	}

}
