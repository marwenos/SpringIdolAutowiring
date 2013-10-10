package com.springIdol.autowiringTest;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Component;
@Component("Jack")
public class SaloonSinger implements Singer {

	private Song song ;
	//@Value("Jack") : we can have here a regular expression !
	private String name;
	public Song getSong() {
		return song;
	}
	@Inject
	@Named("CSong")
	public void setSong(Song song) {
		this.song = song;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sing() {
		System.out.println("I AM : "+name+" and here is my song : \n"+song.sound());
	}
}
