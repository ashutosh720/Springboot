package com.example.LibraryModel.Service;

import com.example.LibraryModel.Model.library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class libServiceImpl implements libService{

    List<library> libraryList;

    public libServiceImpl(){
        libraryList=new ArrayList<>();
        libraryList.add(new library("State Library","Near Buddha Chowk",2001134556, new String[]{"Latest books","Digitalized library","Good hygiene","No fine for passing first due date"}));
        libraryList.add(new library("Queen's Public Library","Queen's College near W.C Road",2001145671, new String[]{"Special section for History Enthusiasts","Also accepting your second hand books","No fine for passing first due date"} ));
        libraryList.add(new library("Vidya Mandir Library","Near Lansdowne Chowk",2001134786, new String[]{"Latest books on Science","Digitalized library","Good hygiene","No fine for passing first due date"}));
        libraryList.add(new library("Vishwakarma Library"," Worker Chowk",2001134106, new String[]{"Latest books","Digitalized library","ALso publishing Research papers","No fine for passing first due date"}));
        libraryList.add(new library("National Library","39-A,Curzon Road",2001134596, new String[]{"Latest books and Research Papers","Digitalized section for old books","Weekly appearances of renowned authors ","No fine for passing first due date"}));
    }


    @Override
    public List<library> getLibraries() {
        return libraryList;
    }

    @Override
    public library getLibrary(String name) {

        library lib=null;
        for(library ll:libraryList){

            if(ll.getName().equals(name)){
                lib=ll;
                break;
            }

        }
        return lib;
    }

    @Override
    public library addLibrary(library Lib) {

        libraryList.add(Lib);
        return Lib;

    }

    @Override
    public library updateLibrary(library Lib) {
        return Lib;
    }

    @Override
    public void deleteLibrary(String name) {
        library lib=null;
        for(library ll:libraryList){

            if(ll.getName().equals(name)){
                lib=ll;
            }

        }
        libraryList.remove(lib);

        for(library Ll:libraryList){
            System.out.println(Ll);
        }

    }
}
