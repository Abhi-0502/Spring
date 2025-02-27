package com.xworkz.app.dto;

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
@NamedQuery(name = "getAllDetails",query = "select movie from MovieDto movie")
@NamedQuery(name = "DeleteUserById", query = "DELETE FROM MovieDto movie WHERE movie.id = :id")
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
    private String language;

    @Column(name = "movie_genre")
    private String genre;

    @Column(name = "movie_duration")
    private int duration;

    @Column(name = "movie_rating")
    private double rating;

    @Column(name = "movie_director")
    private String director;


}
