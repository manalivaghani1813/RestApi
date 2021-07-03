package com.example.CRUDOperation.repository;

import com.example.CRUDOperation.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList<>();

    /* public Album getAlbum() {
        Album album = new Album("CoreJava","Intro to Advanced Course","javatpoint.com");
         return album;
    }*/

    public List<Album> getallAlbums() {
        return albumList;
    }

    public Album getalbumById(int albumId) {
        for(Album album : albumList){
            if(album.getAlbumId()== albumId){
                return album;
            }
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size()+1);
        albumList.add(album);
        return album;
    }


    public Album updateAlbum(int albumId, Album album) {
        for(Album updateal : albumList){
            if(updateal.getAlbumId() == albumId){
                updateal.setName(album.getName());
                updateal.setDescription(album.getDescription());
                updateal.setCoverPicUrl(album.getCoverPicUrl());
                return updateal;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deleteAlbum = null;
        for(Album deleterecord : albumList){
            if(deleterecord.getAlbumId()==albumId){
                deleteAlbum = deleterecord;
                albumList.remove(deleterecord);
                return deleteAlbum;
            }
        }
        return deleteAlbum;
    }
}
