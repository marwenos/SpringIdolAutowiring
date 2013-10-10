package com.springIdol.autowiringTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	/*
	 * * You should add the asm jar and cglib jar jar to make it work !
	 */
	@Bean(name = "James1")
	public SaloonSinger James ()
	{
		SaloonSinger s = new SaloonSinger();
		s.setName("James");
		return s;
	}
	@Bean(name="Kevin1")
	public SaloonSinger Kevin ()
	{
		SaloonSinger s = new SaloonSinger();
		s.setName("Kevin");
		return s;
	}
	@Bean(name="CSong")
	public CountrySong CounSong()
	{
		return new CountrySong();
	}
}
