package homework3.Entities.Concrete;

import homework3.Entities.Abstract.Entity;

public class Campaign implements Entity {

	private int id;
	private int gameId;
	private String name;
	private String startDate;
	private String endDate;

	public Campaign() {

	}

	public Campaign(int id, int gameId, String name, String startDate, String endDate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
