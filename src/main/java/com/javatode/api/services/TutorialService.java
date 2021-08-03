package com.javatode.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatode.api.model.Tutorial;
import com.javatode.api.repository.TutorialRepository;

@Service
public class TutorialService {
	
	@Autowired
	private TutorialRepository tutorialRepository;
	
    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }
    
    public int countTutorials() {
        return (int) tutorialRepository.count();
    }
    
    public Tutorial createTutorial(String title, String description, String authorId) {
        Tutorial book = new Tutorial();
        book.setAuthorId(authorId);
        book.setTitle(title);
        book.setDescription(description);

        tutorialRepository.save(book);

        return book;
    }
    
    public Tutorial updateTutorial(String id, String title, String description) throws Exception {
        Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

        if (optTutorial.isPresent()) {
            Tutorial tutorial = optTutorial.get();

            if (title != null)
                tutorial.setTitle(title);
            if (description != null)
                tutorial.setDescription(description);

            tutorialRepository.save(tutorial);
            return tutorial;
        }

        throw new Exception("Not found Tutorial to update!");
    }
    
    public boolean deleteTutorial(String id) {
        tutorialRepository.deleteById(id);
        return true;
    }
    
}
