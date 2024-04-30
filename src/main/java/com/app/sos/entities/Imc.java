package com.app.sos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_Imc")
public class Imc {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
   private Double peso;

   Double calculo;

    @Setter
    @Getter
    private Double altura;

    public Imc(){

    }
    public void calcularImc(Double peso, Double altura, Double calculo){

        this.calculo = calculo;
        this.peso = peso;
        this.altura = altura;

        calculo = peso * Math.sqrt(altura);

        System.out.println(calculo);


    }

}

