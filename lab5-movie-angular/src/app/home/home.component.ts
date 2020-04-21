import { Genre } from './../model/genre.model';
/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-21 17:28:16
 * @modify date 2020-04-21 17:28:16
 * @desc Home Component
 */
import { Movie } from './../model/movie.model';
import { MovieService } from './../service/movie.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  movies: Movie[] = [];
  genres = Genre;

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.fetchAllMovies();
    console.log(this.genres);

  }

  public fetchAllMovies() {
    this.movieService.fetchAllMovies().subscribe((response) => {
      this.movies = response;
    });
  }

  public fetchByGenre(genre: string){
    this.movieService.fetchByGenre(genre).subscribe(response=>{
      this.movies = response;
    });
  }
}
