package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import model.Player;
import java.util.Scanner;

import bo.SearchByCountry;
import bo.SearchByJerseyNumber;
import bo.SearchByName;
import bo.SearchBySkill;
import bo.SortByAge;
import bo.SortByHighestRuns;
import bo.SortByHighestWicketsTaken;
import bo.SortByRank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of players");
		int num = sc.nextInt();sc.nextLine();
		Player[] p = new Player[num];
		System.out.println("Enter "+num+" player details jersey Number, Player Name, Country, Skill, Player Innings Highest Runs, Player Innings Highest Wickets Taken , Age, Rank");
		for(int i=0;i<num;i++) {
			String s = sc.nextLine();
			String[] str = s.split(",");
			p[i] = new Player();
			p[i].setJerseyNum(Integer.valueOf(str[0]));
			p[i].setname(str[1]);
			p[i].setcountry(str[2]);
			p[i].setskill(str[3]);
			p[i].setinHighestRun(Integer.valueOf(str[4]));
			p[i].setinHighestWicketsTaken(Integer.valueOf(str[5]));
			p[i].setage(Integer.valueOf(str[6]));
			p[i].setrank(Integer.valueOf(str[7]));
		}
		System.out.println("Menu Driven\r\n"
				+ "1) Display Player Details\r\n"
				+ "2) Sort By Rank\r\n"
				+ "3) Sort By Highest Score\r\n"
				+ "4) Sort By Highest Wickets Taken\r\n"
				+ "5) Sort By Age\r\n"
				+ "6) Search By Name\r\n"
				+ "7) Search By Country\r\n"
				+ "8) Search By Skill\r\n"
				+ "9) Search By Jersey Number\r\n"
				+ "10) Exit");
		String decision = "Yes".toUpperCase();
		while(decision.equals("YES")) {
			System.out.println("Enter your choice");
			int k = sc.nextInt();
			switch (k) {
			case 1:{
				for(int i=0;i<p.length;i++) {
					System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", p[i].getJerseyNum(),p[i].getname(),p[i].getcountry(),p[i].getskill(),p[i].getinHighestRun(),p[i].getinHighestWicketsTaken(),p[i].getage(),p[i].getrank()));
				}
				break;
			}
			case 2:{
				List<Player> l = Arrays.asList(p);
				Collections.sort(l, new SortByRank());
				
				for(int i=0;i<l.size();i++) {
					System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", l.get(i).getJerseyNum(),l.get(i).getname(),l.get(i).getcountry(),l.get(i).getskill(),l.get(i).getinHighestRun(),l.get(i).getinHighestWicketsTaken(),l.get(i).getage(),l.get(i).getrank()));
				}
				break;
			}
			case 3:{
				List<Player> l = Arrays.asList(p);
				Collections.sort(l, new SortByHighestRuns());
				
				for(int i=0;i<l.size();i++) {
					System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", l.get(i).getJerseyNum(),l.get(i).getname(),l.get(i).getcountry(),l.get(i).getskill(),l.get(i).getinHighestRun(),l.get(i).getinHighestWicketsTaken(),l.get(i).getage(),l.get(i).getrank()));
				}
				break;
			}
			case 4:{
				List<Player> l = Arrays.asList(p);
				Collections.sort(l, new SortByHighestWicketsTaken());
				
				for(int i=0;i<l.size();i++) {
					System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", l.get(i).getJerseyNum(),l.get(i).getname(),l.get(i).getcountry(),l.get(i).getskill(),l.get(i).getinHighestRun(),l.get(i).getinHighestWicketsTaken(),l.get(i).getage(),l.get(i).getrank()));
				}
				break;
			}
			case 5:{
				List<Player> l = Arrays.asList(p);
				Collections.sort(l, new SortByAge());
				
				for(int i=0;i<l.size();i++) {
					System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", l.get(i).getJerseyNum(),l.get(i).getname(),l.get(i).getcountry(),l.get(i).getskill(),l.get(i).getinHighestRun(),l.get(i).getinHighestWicketsTaken(),l.get(i).getage(),l.get(i).getrank()));
				}
				break;
			}
			case 6:{
				List<Player> l = Arrays.asList(p);
				System.out.println("Enter Name");
				String name = sc.next();
				ArrayList<Player> al = new ArrayList<Player>(new SearchByName().searchByName(name, l));
				if(al.size()>0) {
					for(int i=0;i<al.size();i++) {
						System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", al.get(i).getJerseyNum(),al.get(i).getname(),al.get(i).getcountry(),al.get(i).getskill(),al.get(i).getinHighestRun(),al.get(i).getinHighestWicketsTaken(),al.get(i).getage(),al.get(i).getrank()));
					}
				}
				else {
					System.out.println("Player Name Not Found");
				}
				break;
			}
			case 7:{
				List<Player> l = Arrays.asList(p);
				System.out.println("Enter Country");
				String country = sc.next();
				ArrayList<Player> al = new ArrayList<Player>(new SearchByCountry().searchByCountry(country, l));
				if(al.size()>0) {
					for(int i=0;i<al.size();i++) {
						System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", al.get(i).getJerseyNum(),al.get(i).getname(),al.get(i).getcountry(),al.get(i).getskill(),al.get(i).getinHighestRun(),al.get(i).getinHighestWicketsTaken(),al.get(i).getage(),al.get(i).getrank()));
					}
				}
				else {
					System.out.println("Country Not Found");
				}
				break;
			}
			case 8:{
				List<Player> l = Arrays.asList(p);
				System.out.println("Enter Skill");
				String skill = sc.next();
				ArrayList<Player> al = new ArrayList<Player>(new SearchBySkill().searchBySkill(skill, l));
				if(al.size()>0) {
					for(int i=0;i<al.size();i++) {
						System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", al.get(i).getJerseyNum(),al.get(i).getname(),al.get(i).getcountry(),al.get(i).getskill(),al.get(i).getinHighestRun(),al.get(i).getinHighestWicketsTaken(),al.get(i).getage(),al.get(i).getrank()));
					}
				}
				else {
					System.out.println("Skill Not Found");
				}
				break;
			}
			case 9:{
				List<Player> l = Arrays.asList(p);
				System.out.println("Enter Jersey Number");
				int jnum = sc.nextInt();
				ArrayList<Player> al = new ArrayList<Player>(new SearchByJerseyNumber().searchByJerseyNumber(jnum, l));
				if(al.size()>0) {
					for(int i=0;i<al.size();i++) {
						System.out.println(String.format("%s,%s,%s,%s,%s,%s,%s,%s", al.get(i).getJerseyNum(),al.get(i).getname(),al.get(i).getcountry(),al.get(i).getskill(),al.get(i).getinHighestRun(),al.get(i).getinHighestWicketsTaken(),al.get(i).getage(),al.get(i).getrank()));
					}
				}
				else {
					System.out.println("Jersey Number Not Found");
				}
				break;
			}
			case 10:{
				break;
			}
		}
		System.out.println("do you want to continue (yes/no)?");
		decision = sc.next().toUpperCase();
	}
	System.out.println("Thank you");
	sc.close();
	}
	

}
