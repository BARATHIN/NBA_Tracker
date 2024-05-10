package Metier;

public class Statistiques {
	private int points;
    private int rebonds;
    private int passesDecisives;
    private int interceptions;
    private int contres;
    private int minutesJouees;

    // Constructeur
    public Statistiques(int points, int rebonds, int passesDecisives, int interceptions, int contres, int minutesJouees) {
        this.points = points;
        this.rebonds = rebonds;
        this.passesDecisives = passesDecisives;
        this.interceptions = interceptions;
        this.contres = contres;
        this.minutesJouees = minutesJouees;
    }

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getRebonds() {
		return rebonds;
	}

	public void setRebonds(int rebonds) {
		this.rebonds = rebonds;
	}

	public int getPassesDecisives() {
		return passesDecisives;
	}

	public void setPassesDecisives(int passesDecisives) {
		this.passesDecisives = passesDecisives;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getContres() {
		return contres;
	}

	public void setContres(int contres) {
		this.contres = contres;
	}

	public int getMinutesJouees() {
		return minutesJouees;
	}

	public void setMinutesJouees(int minutesJouees) {
		this.minutesJouees = minutesJouees;
	}

}
