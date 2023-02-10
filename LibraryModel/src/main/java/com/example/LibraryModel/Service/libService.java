package com.example.LibraryModel.Service;

import com.example.LibraryModel.Model.library;

import java.util.List;
public interface libService {

    public List<library> getLibraries();

    public library getLibrary(String name);

    public library addLibrary(library Lib);

    public library updateLibrary(library Lib);

    void deleteLibrary(String name);
}
