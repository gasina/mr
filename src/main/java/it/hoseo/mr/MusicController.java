package it.hoseo.mr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class MusicController {
	
	@Autowired
	AlbumRepositoryJPA albumRepo;
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/addAlbum")
	public String addAlbum() {
		return "album";
	}
	
	@RequestMapping(path = "/addAlbum", method = RequestMethod.POST)
	public String addAlbum(Album album) {
		albumRepo.save(album);
		return "redirect:/";
	}
}


