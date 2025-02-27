package com.xworkz.movies.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "movie_details")
@NamedQueries({@NamedQuery(name = "getmovieNameById",query = "select movies.movieName from MovieDto  movies where movies.id = :i"),
        @NamedQuery(name = "getlanguageById",query = "select movies.language from MovieDto  movies where movies.id = :i"),
        @NamedQuery(name = "getgenreAnddirectorById",query = "select movies.genre,movies.director from MovieDto movies where movies.id =:i"),
        @NamedQuery(name = "getheroAndmovieNameById",query = "select movies.hero,movies.movieName from MovieDto movies where movies.id =:id"),
        @NamedQuery(name = "getheroAndheroinById",query = "select movies.hero,movies.heroin from MovieDto movies where movies.id =:id")})
public class MovieDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "movie_hero")
    private String hero;
    @Column(name = "movie_heroin")
    private String heroin;
    @Column(name = "movie_releasing_year")
    private int releaseYear;

    @Column(name = "movie_language")
    private String language; // Renamed to follow camelCase

    @Column(name = "movie_genre")
    private String genre;

    @Column(name = "movie_duration")
    private int duration; // in minutes

    @Column(name = "movie_rating")
    private double rating; // e.g., 7.5 out of 10

    @Column(name = "movie_director")
    private String director;


}
