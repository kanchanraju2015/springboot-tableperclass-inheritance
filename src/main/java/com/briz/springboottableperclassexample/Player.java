package com.briz.springboottableperclassexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name="player")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Player
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
