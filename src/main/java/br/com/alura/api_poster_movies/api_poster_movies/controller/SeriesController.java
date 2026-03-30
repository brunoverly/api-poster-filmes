package br.com.alura.api_poster_movies.api_poster_movies.controller;

import br.com.alura.api_poster_movies.api_poster_movies.dto.SeriesDto;
import br.com.alura.api_poster_movies.api_poster_movies.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService service;

    @GetMapping("/frases")
    public SeriesDto getData(){
        return service.getResponse();
    }
}
