package com.servidor.api.entities.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ServidorTemporarioDTO {

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate dataAdmissao;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate dataDemissao;
}
