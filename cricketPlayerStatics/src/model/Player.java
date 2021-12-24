package model;

public class Player {
	private Integer jerseyNumber;
	private String name;
	private String country;
	private String skill;
	private Integer inHighestRun;
	private Integer inHighestWicketsTaken;
	private Integer age;
	private Integer rank;
	public int getJerseyNum() {
		return this.jerseyNumber;
	}
	public void setJerseyNum(int n) {
		this.jerseyNumber=n;
	}
	public String getname() {
		return this.name;
	}
	public void setname(String s) {
		this.name=s;
	}
	public String getcountry() {
		return this.country;
	}
	public void setcountry(String s) {
		this.country=s;
	}
	public String getskill() {
		return this.skill;
	}
	public void setskill(String s) {
		this.skill=s;
	}
	public int getinHighestRun() {
		return this.inHighestRun;
	}
	public void setinHighestRun(int n) {
		this.inHighestRun=n;
	}
	public int getinHighestWicketsTaken() {
		return this.inHighestWicketsTaken;
	}
	public void setinHighestWicketsTaken(int n) {
		this.inHighestWicketsTaken=n;
	}
	public int getage() {
		return this.age;
	}
	public void setage(int n) {
		this.age=n;
	}
	public int getrank() {
		return this.rank;
	}
	public void setrank(int n) {
		this.rank=n;
	}

}
