package com.javatode.api.resolvers;

import com.javatode.api.model.Author;
import com.javatode.api.model.Tutorial;
import com.javatode.api.repository.AuthorRepository;
import com.javatode.api.services.AuthorService;
import com.javatode.api.services.TutorialService;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	
    @Autowired
    private AuthorService authorService;
    
    public Author getAuthor(Tutorial tutorial) {
        return authorService.getAuthor(tutorial.getAuthorId());
    }

}
