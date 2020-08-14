package br.com.rdevs.EstudoProva.service;

import br.com.rdevs.EstudoProva.bo.LojaBO;
import br.com.rdevs.EstudoProva.dto.LojaDTO;
import br.com.rdevs.EstudoProva.entity.LojaEntity;
import br.com.rdevs.EstudoProva.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository repository;

    @Autowired
    private LojaBO lojaBO;

    public List<LojaDTO> buscarTodas(){
        List<LojaEntity> listEntity = repository.findAll();
        List<LojaDTO> listDTO = new ArrayList<>();

        for(LojaEntity entity : listEntity){
            LojaDTO dto = lojaBO.parseToDTO(entity);
            listDTO.add(dto);
        }
        return listDTO;
    }

    public LojaDTO buscarPorId(Integer codigo) {
        return lojaBO.parseToDTO(repository.getOne(codigo));

    }
    public void inserir(LojaDTO dto) {
        LojaEntity entity = lojaBO.parseToEntity(dto, null);
        if(entity.getNome() != null)
            repository.save(entity);

    }

    public void atualizar(LojaDTO dto) {

        LojaEntity entity = repository.getOne(dto.getCodigo());
        if(entity != null) {
            entity = lojaBO.parseToEntity(dto, entity);
            repository.save(entity);
        }
    }
    public LojaDTO excluirPorId(Integer codigo){
        LojaEntity entity = repository.getOne(codigo);
        LojaDTO dto = new LojaDTO();

        if(entity != null){
            dto = lojaBO.parseToDTO(entity);
            repository.delete(entity);
        }
        return dto;
    }
    public List<LojaEntity> buscarPorNome(String nome){
        return repository.findByNome(nome);
    }
}
