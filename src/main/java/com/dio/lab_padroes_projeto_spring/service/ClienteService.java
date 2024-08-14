package com.dio.lab_padroes_projeto_spring.service;

import com.dio.lab_padroes_projeto_spring.model.Cliente;
import org.springframework.stereotype.Service;


/**
 *  Interface que define o padrão strategy no domínio de cliente. Com isso, se necessário podemos
 *  ter múltiplas implementações dessa interface.
 *
 * */

@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
