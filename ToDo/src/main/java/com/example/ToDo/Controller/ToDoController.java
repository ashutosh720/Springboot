package com.example.ToDo.Controller;

import com.example.ToDo.Model.ToDo;
import com.example.ToDo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoApp")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/getAll")
    public List<ToDo> findAllTodos() { // controller is talking to the service layer
        return toDoService.findAll();
    }

    @GetMapping("/find-todo/id/{id}")
    //@RequestMapping(value="/find-todo/id/{id}")
    public ToDo findTodoById(@PathVariable int id) {
        return toDoService.findById(id);
    }

    @PostMapping("/add-todo")
    public void createTodo(@RequestBody ToDo todo) {
        toDoService.createTodo(todo);
    }

    @PutMapping("update-todo/id/{id}")
    public void updateTodo(@PathVariable int id,@RequestBody ToDo todo) {
        toDoService.updateTodo(id,todo);
    }

    @DeleteMapping("delete-todo/id/{id}")
    public void deleteTodo(@PathVariable int id) {
        toDoService.deleteTodo(id);
    }


}
