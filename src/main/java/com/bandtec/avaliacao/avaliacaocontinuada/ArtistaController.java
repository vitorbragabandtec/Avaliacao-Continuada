package com.bandtec.avaliacao.avaliacaocontinuada;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {


    private List <Artista> artista = new ArrayList<>();

    @PostMapping("/animador")
    public ResponseEntity criarAnimador (@RequestBody Animador animador){
        artista.add(animador);
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/escultor")
    public ResponseEntity criarEscultor (@RequestBody Escultor escultor){
        artista.add(escultor);
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/cartunista")
    public ResponseEntity criarCartunista (@RequestBody Cartunista cartunista){
        artista.add(cartunista);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity pegarArtistas (){
        if (artista.isEmpty()){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok().body(artista);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity pegarArtista(@PathVariable Integer id){
        if(artista.size() >= id){
            return ResponseEntity.ok().body(artista.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity apagarArtista(@PathVariable Integer id){
        if(artista.size() >= id){
            artista.remove(id -1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}