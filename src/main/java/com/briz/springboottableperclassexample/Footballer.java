package com.briz.springboottableperclassexample;

import jakarta.persistence.Entity;

@Entity
public class Footballer extends Player
{
int totalgoals;

public int getTotalgoals() {
	return totalgoals;
}

public void setTotalgoals(int totalgoals) {
	this.totalgoals = totalgoals;
}

}
