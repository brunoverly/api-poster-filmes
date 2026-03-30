package br.com.alura.api_poster_movies.api_poster_movies.repository;

import br.com.alura.api_poster_movies.api_poster_movies.model.Series;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
}
