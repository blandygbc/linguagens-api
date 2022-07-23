package com.glelk.linguagensapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.glelk.linguagensapi.models.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
