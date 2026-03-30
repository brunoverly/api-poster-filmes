package br.com.alura.api_poster_movies.api_poster_movies.service;


import br.com.alura.api_poster_movies.api_poster_movies.dto.SeriesDto;
import br.com.alura.api_poster_movies.api_poster_movies.model.Series;
import br.com.alura.api_poster_movies.api_poster_movies.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeriesService {
    @Autowired
    private SeriesRepository seriesRepository;

    public SeriesDto getResponse(){
        int totalSeries = (int) seriesRepository.count();
        int randomId = (int) (Math.random() * totalSeries) + 1;

        Optional<Series> series = seriesRepository.findById(Long.valueOf(randomId));
        if(series.isPresent()){
            return new SeriesDto(series.get().getTitulo(),
                    series.get().getFrase(),
                    series.get().getPersonagem(),
                    series.get().getPoster());
        }
        return null;
    }
}
