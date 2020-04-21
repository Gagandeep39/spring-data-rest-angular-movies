import { map } from 'rxjs/operators';

import { environment } from './../../environments/environment.prod';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class MovieService {
  constructor(private http: HttpClient) {}

  public fetchAllMovies() {
    return this.http
      .get(environment.url)
      .pipe(map((response) => response['_embedded']['movies']));
  }

  public fetchMovieById(id: number){
    return this.http
      .get(environment.url + environment.fetchById + id)
      .pipe(map((response) => response['_embedded']['movies']));
  }

  public fetchByGenre(genre: string){
    return this.http
      .get(environment.url + environment.fetchByGenre + genre)
      .pipe(map((response) => response['_embedded']['movies']));

  }
}
