package com.lpoo.pokemon.logic;

public class Move {
	// ENUMS
	enum STATS {
		ATTACK, DEFENSE, SPECIALATTACK, SPECIALDEFENSE, SPEED, NULL
	}

	enum ELEMENTS {
		FIRE, WATER, ELECTRIC, ROCK, PHYSICAL, ICE, HEAL, FLYING
	}

	enum AILMENTS {
		NEUTRAL, CONFUSION, PARALYZE, SLEEP, POISON, BURN, FREEZE
	}

	// NESTED CLASSES
	class StatusEffect {
		AILMENTS ailment;
		int inflictChance;
		StatusEffect(AILMENTS ail, int ichance) {
			ailment = ail;
			inflictChance = ichance;
			
		}
	}

	class StatChanging {
		STATS changedstat;
		int duration;
		int quantity;

		StatChanging(STATS ch, int d, int q) {
			changedstat = ch;
			duration = d;
			quantity = q;
		}
	}

	class DotComponent {
		int DamagePerTurn;
		int duration; // lasting effects

		DotComponent(int dot, int d) {
			DamagePerTurn = dot;
			duration = d;
		}
	}

	// Fields
	int BaseDamage;
	boolean hitflyingenemy;
	String Name;
	ELEMENTS ElementType;
	int PP;
	int Accuracy;
	StatusEffect statusInflicted;
	DotComponent dotComponent;
	StatChanging statchanged;
	
	//Constructors
	public Move(String nome, ELEMENTS element, int damage, int pp, int acc,
			boolean hitfly, StatusEffect s, StatChanging ch, DotComponent dot) {
		Name = nome;
		ElementType = element;
		BaseDamage = damage;
		PP = pp;
		Accuracy = acc;
		statusInflicted = s;
		dotComponent = dot;
		statchanged = ch;
		hitflyingenemy = hitfly;
	}
	public Move(String nome,ELEMENTS element,int damage, int pp, int acc) {
		Name=nome;
		ElementType=element;
		BaseDamage=damage;
		PP=pp;
		Accuracy=acc;
	}
	public Move(){};
	//Getters
	String getName() {
		return Name;
	}
}
