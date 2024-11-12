package com.br.library.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.library.ResourceNotFoundException;
import com.br.library.model.Book;
import com.br.library.repository.BookRepository;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookDAO {

    @Autowired
    private BookRepository repository;

    // Listar todos os livros
    @GetMapping("/book")
    public List<Book> listar() {
        return this.repository.findAll();
    }

    // Consultar um livro por ID
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> consultar(@PathVariable Long id) {

        Book book = this.repository.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("Livro não encontrado: " + id));

        return ResponseEntity.ok(book);
    }

    // Inserir um novo livro
    @PostMapping("/book")
    public Book inserir(@RequestBody Book book) {
        return this.repository.save(book);
    }

    // Alterar um livro existente
    @PutMapping("/book/{id}")  // Corrigido para "/book/{id}"
    public ResponseEntity<Book> alterar(@PathVariable Long id, @RequestBody Book book) {
        Book bookRecuperado = this.repository.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("Livro não encontrado: " + id));

        bookRecuperado.setCodigo(book.getCodigo());
        bookRecuperado.setTitulo(book.getTitulo());
        bookRecuperado.setAutor(book.getAutor());
        bookRecuperado.setAno(book.getAno());

        Book atualizado = this.repository.save(bookRecuperado);
        
        return ResponseEntity.ok(atualizado);
    }

    // Excluir um livro
    @DeleteMapping("/book/{id}")  // Corrigido para "/book/{id}"
    public ResponseEntity<Map<String, Boolean>> excluir(@PathVariable Long id) {

        Book bookRecuperado = this.repository.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("Livro não encontrado: " + id));

        this.repository.delete(bookRecuperado);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Book excluido", Boolean.TRUE);

        return ResponseEntity.ok(response);
    }
}
