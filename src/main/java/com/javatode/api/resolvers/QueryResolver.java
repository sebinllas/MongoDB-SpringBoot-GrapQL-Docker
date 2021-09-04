package com.javatode.api.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javatode.api.model.Author;
import com.javatode.api.model.Tutorial;
import com.javatode.api.services.AuthorService;
import com.javatode.api.services.TutorialService;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.Optional;

@Service
@CrossOrigin
public class QueryResolver implements GraphQLQueryResolver {
	@Autowired
    private AuthorService authorService;
	@Autowired
	private TutorialService tutorialService;
	
    public Author getAuthor(Tutorial tutorial) {
        return authorService.getAuthor(tutorial.getAuthorId());
    }
		
    public Iterable<Author> findAllAuthors() {
        return authorService.findAllAuthors();
    }
    
    public int countAuthors() {
        return authorService.countAuthors();
    }

    public Optional<Tutorial> findTutorial(String id){ return tutorialService.findTutorial(id);  }
    
    public Iterable<Tutorial> findAllTutorials() {
        return tutorialService.findAllTutorials();
    }
    
    public int countTutorials() {
        return tutorialService.countTutorials();
    }
	
}
