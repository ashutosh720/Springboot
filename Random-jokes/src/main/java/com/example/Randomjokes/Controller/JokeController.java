package com.example.Randomjokes.Controller;


import com.example.Randomjokes.Model.Joke;
import com.example.Randomjokes.Service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @GetMapping("/home")
    public String home(){
        return "Welcome to Random jokes Model";
    }

    @GetMapping("/all-jokes")
    public List<Joke> getJokes(){

        return this.jokeService.getJokes();

    }

    @GetMapping("/get-joke/Id/{Id}")
    public Joke getJoke(@PathVariable int Id){

        return this.jokeService.getJoke(Id);
    }

    @PostMapping("/add-joke")
    public Joke addJoke(@RequestBody Joke joke){

        return this.jokeService.addJoke(joke);
    }

    @PutMapping("/update-joke")
    public Joke updateJoke(@RequestBody Joke joke){

        return this.jokeService.updateJoke(joke);
    }

    @DeleteMapping("/delete-joke/Id/{Id}")
    public  void deleteJoke(@PathVariable int Id){
        this.jokeService.deleteJokes(Id);
    }


}



