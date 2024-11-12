package com.br.library.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "usuario_codigo")
    private Long usuario_codigo;

    @Column(name = "livro_codigo")
    private Long livro_codigo;

    @Column(name = "data_emprestimo")
    private Date dataEmprestimo;

    @Column(name = "data_devolucao")
    private Date dataDevolucao;

    @Column(name = "status")
    private String status; // "ativo", "atrasado", "devolvido"

    public Emprestimo(Long codigo, Long usuario_codigo, Long livro_codigo, Date dataEmprestimo, Date dataDevolucao, String status) {
        this.codigo = codigo;
        this.usuario_codigo = usuario_codigo;
        this.livro_codigo = livro_codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    // Getters and setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getUsuarioCodigo() {
        return usuario_codigo;
    }

    public void setUsuarioCodigo(Long usuario_codigo) {
        this.usuario_codigo = usuario_codigo;
    }

    public Long getLivroCodigo() {
        return livro_codigo;
    }

    public void setLivroCodigo(Long livro_codigo) {
        this.livro_codigo = livro_codigo;
    }
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
