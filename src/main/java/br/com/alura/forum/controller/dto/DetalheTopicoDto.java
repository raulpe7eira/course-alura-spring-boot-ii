package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DetalheTopicoDto {

    private final Long id;
    private final String titulo;
    private final String mensagem;
    private final LocalDateTime dataCriacao;
    private final String autor;
    private final StatusTopico status;
    private final List<RespostaDto> repostas;

    public DetalheTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.autor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.repostas = RespostaDto.converter(topico.getRespostas());
    }

    public static List<DetalheTopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(DetalheTopicoDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public List<RespostaDto> getRepostas() {
        return repostas;
    }

}
