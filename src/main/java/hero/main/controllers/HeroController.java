package hero.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hero.main.Hero;
import hero.main.HeroRepository;

@RestController
@RequestMapping("/heroes")
public class HeroController {

	@Autowired
	private HeroRepository heroRepository;

	@GetMapping("/get")
	public Iterable<Hero> getHeroes() {
		return heroRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public Hero getHero(@PathVariable("id") Long id) {
		return heroRepository.findById(id).get();
	}

	@PutMapping("/put/{id}")
	public ResponseEntity<Object> updateHero(@RequestBody Hero hero, @PathVariable long id) {
		hero.setId(id);
		heroRepository.save(hero);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/get")
	public void addHeroe(@RequestBody Hero hero) {
		heroRepository.save(hero);
	}

	@DeleteMapping("/get/{id}")
	public void deleteHero(@RequestBody long id) {
		heroRepository.deleteById(id);
	}
}
