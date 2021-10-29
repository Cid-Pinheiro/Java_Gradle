package com.primeiroprojweb.sping.web.mvc.model;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class QueryExecution {
    public static void main(String[] args){
        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        //List<Aluno> alunos = alunoDAO.list();

        //alunos.stream().forEach(System.out::println);

        // ======================= 1.1 - Consulta com filtro ========================================
        //Aluno alunoParaConsulta = alunoDAO.getById(1);

        //System.out.println(alunoParaConsulta);

        // =========================== 2 - Inserção =================================================
        //Aluno alunoParaInsercao = new Aluno(
        //        4,
        //        "Juliana",
        //        17,
        //        "MG"
        //);

        //alunoDAO.create(alunoParaInsercao);

// =========================== 3 - Delete ===================================================
        //alunoDAO.delete(4);

        // =========================== 4 - Atualizar ================================================
        //Aluno alunoParaAtualizar = alunoDAO.getById(2);
        //alunoParaAtualizar.setNome("Cid Pinheiro");
        //alunoParaAtualizar.setIdade(46);
        //alunoParaAtualizar.setEstado("RS");

        //alunoDAO.update(alunoParaAtualizar);


    }
}
