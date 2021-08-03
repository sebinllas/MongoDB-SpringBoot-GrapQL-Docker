package com.javatode.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatode.api.model.Author;
import com.javatode.api.model.Tutorial;
import com.javatode.api.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
    public Author getAuthor(String author_Id) {
        return authorRepository.findById(author_Id).orElseThrow(null);
    }
		
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
    
    public int countAuthors() {
        return (int) authorRepository.count();
    }
    
    public Author createAuthor(String name, Integer age) {
        Author author = new Author();
        author.setName(name);
        author.setAge(age);
        authorRepository.save(author);
        return author;
    }

}
