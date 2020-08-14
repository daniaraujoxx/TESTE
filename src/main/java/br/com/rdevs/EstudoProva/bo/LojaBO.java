package br.com.rdevs.EstudoProva.bo;

import br.com.rdevs.EstudoProva.dto.LojaDTO;
import br.com.rdevs.EstudoProva.entity.LojaEntity;
import org.springframework.stereotype.Component;

@Component
public class LojaBO {

    public LojaDTO parseToDTO(LojaEntity entity){
        LojaDTO dto = new LojaDTO();

        if(entity == null)
            return dto;

        dto.setCodigo(entity.getCodigo());
        dto.setNome(entity.getNome());
        dto.setCidade(entity.getCidade());
        dto.setLogomarca(entity.getLogomarca());

        return dto;
    }

    public LojaEntity parseToEntity(LojaDTO dto, LojaEntity entity){
        if(entity == null)
            entity = new LojaEntity();

        if(dto == null)
            return entity;

        entity.setCodigo(dto.getCodigo());
        entity.setCidade(dto.getCidade());
        entity.setLogomarca(dto.getLogomarca());
        entity.setNome(dto.getNome());

        return entity;
    }

}
