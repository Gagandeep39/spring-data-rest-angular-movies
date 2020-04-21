import { Genre } from './../model/genre.model';
import { MovieService } from './../service/movie.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  genres = Genre;
  rating: number;

  constructor(private movieService: MovieService, private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(ngForm: NgForm){
    if(ngForm.valid){
      this.movieService.addMovie(ngForm.value).subscribe(
        ()=>this.redirectHome()
      );
    }
  }

  redirectHome(){
    this.router.navigate(['/home']);
  }

}
