package com.javatode.api.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javatode.api.model.Author;
import com.javatode.api.model.Tutorial;
import com.javatode.api.services.AuthorService;
import com.javatode.api.services.TutorialService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
@CrossOrigin
public class MutationResolver implements GraphQLMutationResolver {

	@Autowired
	private AuthorService authorService;
	@Autowired
	private TutorialService tutorialService;

	public Author createAuthor(String name, Integer age) {
		return authorService.createAuthor(name, age);
	}

	public Tutorial createTutorial(String title, String description, String authorId) {
		return tutorialService.createTutorial(title, description, authorId);
	}

	public Tutorial updateTutorial(String id, String title, String description) throws Exception {
		return tutorialService.updateTutorial(id, title, description);
	}

	public boolean deleteTutorial(String id) {
		return tutorialService.deleteTutorial(id);
	}


}
