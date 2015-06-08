package com.lpoo.pokemon.logic;

import java.util.Vector;

public class Trainer {
	//Fields
	Vector<Pokemon> team;
	String Name;
	
	//Constructors
	public Trainer(String nome, Vector<Pokemon> pk) {
		Name = nome;
		team=pk;
	}
	public Trainer(String nome) {
		Name = nome;
		team=new Vector<Pokemon>();
	}
	
	//Getters
	public Pokemon getActivePokemon(){ 
		for(int i=0;i<team.size();i++)
			if(team.get(i).getStat())
				return team.get(i);
		
		return null;
	}
	public Pokemon getBenchedPokemon(){ 
		for(int i=0;i<team.size();i++)
			if(!team.get(i).getStat())
				return team.get(i);
		
		return null;
	}
	public String getName(){
		return Name;
	}
	public void setName(String name){
		Name=name;
	}
	
	//Modifiers
	public void addPokemon(Pokemon poke){
		if(team.size()==2)
			return;
		
		if(team.isEmpty())
			poke.changeStat(true);
		else
			poke.changeStat(false);
		team.addElement(poke);
	}
	public void changePokemon(){ 
		if(team.get(0).getStat()){
			team.get(1).changeStat(true);
			team.get(0).changeStat(false);
		}
		else{
			team.get(0).changeStat(true);
			team.get(1).changeStat(false);
		}
	}
	public Vector<Pokemon> getTeam(){
		return team;
	}
	//Checks
	public boolean TrainerLost(){ 
		if(team.get(0).isDead()&&team.get(1).isDead()){
			return true;
		}
		return false;
	}

}
