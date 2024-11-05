package com.br.library.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookDAO {

    @Autowired
    private BookRepository repository;

    //listar
	@GetMapping("/book")
    public List<Book> findAll() {
        return repository.findAll();
    }

    //consultar
    @GetMapping("/book/{id}")
    public Book findById(@PathVariable Long id) {
        BookDAO bookDAO = this.repository.findById(id).orElseThrow(() 
        -> new ResourseNotFoundException("Livro não encontrado"));
        return ResponseEntity.ok(book);

    }

    //inserir   
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return this.repository.save(book);
    }

}
