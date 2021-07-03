package com.example.CRUDOperation.resources;


import com.example.CRUDOperation.model.Album;
import com.example.CRUDOperation.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResouce {

    @Autowired
    AlbumService albumService;

   /* @GetMapping("/albums")
    public Album getAlbum(){
        return albumService.getAlbum();
    }*/

    @GetMapping("/album")
    public List<Album> getallAlbums(){
        return albumService.getallAlbums();
    }

    @GetMapping("/album/{albumId}")
    public Album getalbumById(@PathVariable("albumId") int albumId){
       return albumService.getalbumById(albumId);
   }
   @PostMapping("/album")
   public Album saveAlbum(@RequestBody Album album){
      return albumService.saveAlbum(album);
   }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return albumService.updateAlbum(albumId,album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    }







}
