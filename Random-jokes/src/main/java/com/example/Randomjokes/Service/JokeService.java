package com.example.Randomjokes.Service;

import com.example.Randomjokes.Model.Joke;

import java.util.List;

public interface JokeService {
    public List<Joke> getJokes();

    public Joke getJoke(int Id);

    public Joke addJoke(Joke joke);

    public Joke updateJoke(Joke joke);

    void deleteJokes(int Id);
}
