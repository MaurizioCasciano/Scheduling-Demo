package com.example.scheduling.api;

import com.example.scheduling.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("books")
public class BooksController {

    @GetMapping
    public Mono<Book> getBook(){
        return Mono.just(Book.builder()
                .title("My favourite book")
                .author("author.name@library.org")
                .build());
    }
}
