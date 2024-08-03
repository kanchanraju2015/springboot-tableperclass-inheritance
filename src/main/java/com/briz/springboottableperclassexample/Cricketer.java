package com.briz.springboottableperclassexample;

import jakarta.persistence.Entity;

@Entity
public class Cricketer extends Player
{
int totalruns;

public int getTotalruns() {
	return totalruns;
}

public void setTotalruns(int totalruns) {
	this.totalruns = totalruns;
}


}
