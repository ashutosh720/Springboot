package com.example.ToDo.Service;

import com.example.ToDo.Model.ToDo;
import com.example.ToDo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() { // Business Logic
        return toDoRepository.findAll();
    }
    public ToDo findById(int id) { // business Logic
        return toDoRepository.findById(id).get();
    }


    public void createTodo(ToDo todo) {
        toDoRepository.save(todo);
    }

    public void deleteTodo(int id) {
        toDoRepository.deleteById(id);
    }

    public void updateTodo(int id, ToDo newTodo) {
        //step 1: find todo to be update
        //Step 2: update todo

        ToDo todo=toDoRepository.findById(id).get();

        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setDescription(newTodo.getDescription());

        toDoRepository.save(todo);
    }



    public ToDo getToDoById(int id) {
        return toDoRepository.findById(id).orElse(null);
    }

    public void deleteToDoById(int id) {
        toDoRepository.deleteById(id);
    }
}