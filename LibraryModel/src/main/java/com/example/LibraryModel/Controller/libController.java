package com.example.LibraryModel.Controller;

import com.example.LibraryModel.Model.library;
import com.example.LibraryModel.Service.libService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class libController {

    @Autowired
    private libService libservice;

    @GetMapping("/home")
    public String home(){
        return "Welcome to Library Model";
    }

    @GetMapping("/all-libraries")
    public List<library> getLibraries(){

        return this.libservice.getLibraries();

    }

    @GetMapping("/get-library/name/{name}")
    public library getLibrary(@PathVariable String name){

        return this.libservice.getLibrary(name);
    }

    @PostMapping("/add-library")
    public library addLibrary(@RequestBody library Lib){

        return this.libservice.addLibrary(Lib);
    }

    @PutMapping("/update-library")
    public library updateLibrary(@RequestBody library Lib){

        return this.libservice.updateLibrary(Lib);
    }

    @DeleteMapping("/delete-library/name/{name}")
    public  void deleteLibrary(@PathVariable String name){
        this.libservice.deleteLibrary(name);
    }


}
