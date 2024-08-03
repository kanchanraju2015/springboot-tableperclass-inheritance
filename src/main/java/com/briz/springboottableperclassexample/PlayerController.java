package com.briz.springboottableperclassexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController
{
@Autowired
PlayerRepository prepo;
@RequestMapping("/test")
public String test()
{
	return "This is table per class test";
}
@RequestMapping("/save")
public String save()
{
	Player p=new Player();	p.setName("chanda");
	Footballer f=new Footballer();f.setName("sujeet");f.setTotalgoals(18);
	Cricketer c=new Cricketer(); c.setName("manish"); c.setTotalruns(2630);
prepo.save(p);
prepo.save(f);
prepo.save(c);
return "data saved into three tables";
}
@RequestMapping("/all")
public List<Player> all()
{
	return prepo.findAll();			
}
}
