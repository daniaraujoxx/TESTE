package br.com.rdevs.EstudoProva.controller;

import br.com.rdevs.EstudoProva.dto.LojaDTO;
import br.com.rdevs.EstudoProva.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LojaController {

    @Autowired
    private LojaService service;

    @GetMapping("/loja")
    public ResponseEntity buscarTodas(){
        return ResponseEntity.ok().body(service.buscarTodas());

    }

    @PostMapping("/loja")
    public ResponseEntity inserir(@RequestBody LojaDTO dto){
        service.inserir(dto);

        return ResponseEntity.ok().body(dto);
    }

    @PutMapping("/loja")
    public ResponseEntity atualizar(@RequestBody LojaDTO dto) {

        service.atualizar(dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/loja/{codigo}")
    public ResponseEntity excluirPorId(@PathVariable("codigo")Integer codigo){
        LojaDTO dto = service.excluirPorId(codigo);

        return ResponseEntity.ok().body(dto);
    }

}
