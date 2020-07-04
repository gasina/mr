package it.hoseo.mr.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.hoseo.mr.Artist;
import it.hoseo.mr.Music;
import it.hoseo.mr.MusicRepositoryJPA;

@Controller
public class MusicController {
	
	
	@Autowired
	private MusicRepositoryJPA musicRepo;
	
	@PostConstruct
	void init() {
		//musicRepo.save(Music.builder().);
	}
	
	
	@RequestMapping(path = "/music", method = RequestMethod.GET)
	public String addMusicForm(ModelMap mm) {
		mm.put("musics", musicRepo.findAll());
		return "music";
	}
	
	@RequestMapping(path = "/music", method = RequestMethod.POST)
	public String addMusicForm(Music music) {
		musicRepo.save(music);
		return "redirect:music";
	}
	@RequestMapping(path = "/musiclist", method = RequestMethod.GET)
	public String musicForString(ModelMap mm) {
		mm.put("musiclist", musicRepo.findAll());
		return "musiclist";
	}
	
}
