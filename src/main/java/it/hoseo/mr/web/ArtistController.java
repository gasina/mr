package it.hoseo.mr.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.hoseo.mr.Artist;
import it.hoseo.mr.ArtistRepositoryJPA;

@Controller
public class ArtistController {
	
	
	@PostConstruct
	void init() {
		repo.save(Artist.builder().name("고길동").build());
	}
	
	@Autowired
	private ArtistRepositoryJPA repo;
	
	@RequestMapping(path = "/artist1", method = RequestMethod.GET)
	public String addForm(ModelMap mm) {
		mm.put("artists", repo.findAll());
		return "artist1";
	}
	
	@RequestMapping(path = "/artist1", method = RequestMethod.POST)
	public String add(Artist artist) {
		repo.save(artist);
		return "redirect:artist1";
	}
	
	@RequestMapping(path = "/artistlist", method = RequestMethod.GET)
	public String addForString(ModelMap mm) {
		mm.put("artistlist", repo.findAll());
		return "artistlist";
	}
}
