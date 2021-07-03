package com.example.CRUDOperation.service;

import com.example.CRUDOperation.model.Album;
import com.example.CRUDOperation.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    /* public Album getAlbum() {
       return albumRepository.getAlbum();
    }*/


    public List<Album> getallAlbums() {
        return albumRepository.getallAlbums();

    }

    public Album getalbumById(int albumId) {
        return albumRepository.getalbumById(albumId);
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }


    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId,album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deleteAlbum(albumId);
    }
}
