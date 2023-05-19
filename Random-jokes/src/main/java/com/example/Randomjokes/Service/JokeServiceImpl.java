package com.example.Randomjokes.Service;

import com.example.Randomjokes.Model.Joke;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokeServiceImpl implements JokeService{


    List<Joke> jokeList;


    public JokeServiceImpl(){
        jokeList=new ArrayList<>();
        jokeList.add(new Joke(1, "Why don't scientists trust atoms?Because they make up everything!"));
        jokeList.add(new Joke(2, "I asked the gym instructor if he could teach me to do the splits.He replied,How flexible are you?I said,I can't make it on Tuesdays."));
        jokeList.add(new Joke(3, "Why don't skeletons fight each other? They don't have the guts!"));
        jokeList.add(new Joke(4, "What did one wall say to the other wall? I'll meet you at the corner."));
        jokeList.add(new Joke(5, "Why don't scientists trust stairs? Because they're always up to something!"));
    }
    @Override
    public List<Joke> getJokes() {
        return jokeList;
    }

    @Override
    public Joke getJoke(int Id) {
        Joke joke=null;
        for(Joke jk:jokeList){

            if(jk.getId()==Id){
                joke=jk;
                break;
            }

        }
        return joke;
    }

    @Override
    public Joke addJoke(Joke joke) {
        jokeList.add(joke);
        return joke;
    }

    @Override
    public Joke updateJoke(Joke joke) {
        return joke;
    }

    @Override
    public void deleteJokes(int Id) {

        Joke joke=null;
        for(Joke jk:jokeList){

            if(jk.getId()==Id){
                joke=jk;
                break;
            }

        }
        jokeList.remove(joke);
        for(Joke jk:jokeList){
            System.out.println(jk);
        }
    }
}
