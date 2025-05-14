package com.projeto.diadasmaes.Controller.Services;

import com.projeto.diadasmaes.MaeModel;
import com.projeto.diadasmaes.MaeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MaeService {

    @Autowired
    private MaeRepository repository;

    public void salvarNome(String nome){
        MaeModel mae = new MaeModel();
        mae.setNome(nome);
        repository.save(mae);

    }

}