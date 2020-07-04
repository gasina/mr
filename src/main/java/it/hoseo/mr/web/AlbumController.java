package it.hoseo.mr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.hoseo.mr.Album;
import it.hoseo.mr.AlbumRepositoryJPA;

@Controller
public class AlbumController {
	
	@Autowired
	private AlbumRepositoryJPA repo;
	
	@RequestMapping(path = "/album2", method = RequestMethod.GET)
	public String addForm(ModelMap mm) {
		mm.put("albums", repo.findAll());
		return "album2";
	}
	
	@RequestMapping(path = "/album2", method = RequestMethod.POST)
	public String add(Album album) {
		repo.save(album);
		return "redirect:album2";
	}
	@RequestMapping(path = "/albumlist", method = RequestMethod.GET)
	public String addForString(ModelMap mm) {
		mm.put("albumlist", repo.findAll());
		return "albumlist";
	}
	
	
}
