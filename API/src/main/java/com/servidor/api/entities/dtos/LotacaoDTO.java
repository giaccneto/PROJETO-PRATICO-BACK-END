package com.servidor.api.entities.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LotacaoDTO {

  private Long pessoaId;

  private Long unidadeId;

  private String portaria;

  private LocalDate dataLocacao;

  private LocalDate dataRemocao;
}
