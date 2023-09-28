public class Team {
	
	private String teamName;
	private int teamRank;
	private String name;

public Team (String name, String teamName, int teamRank){

this.teamName = teamName;
this.teamRank = teamRank;
this.name = name;
}

public void setName (String name){
	this.name = name;
}

public void setTeamName (String teamName){
	this.teamName = teamName;
}

public void setTeamRank (int teamRank){
	this.teamRank = teamRank;
}

public String toString (){
return "Hold:" + teamName + "Rank:" + teamRank;
}
}

