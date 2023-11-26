package com.upx.energiasolar.controllers;

import com.upx.energiasolar.models.PlacaSolar;
import com.upx.energiasolar.models.ProducaoEnergia;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.management.DescriptorKey;
import java.math.BigDecimal;

@RestController
public class ProducaoEnergiaController {
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/api/producaoenergia/calcular")
    public ProducaoEnergia calcular(@RequestBody PlacaSolar placaSolar){
        double precoPorKw = 0.9;
        double kwTotal = (double) (placaSolar.getQuantidadeDePlacas() * placaSolar.getQuantidadeKwPorPlaca()) / 1000;
        double kwDiaria = (kwTotal * placaSolar.getMediaLocal()) * 0.8;
        double kwMensal = kwDiaria * 30;
        double rendimentoDiario = kwDiaria * precoPorKw;
        BigDecimal rendimentoMensal = new BigDecimal(kwMensal * precoPorKw).setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(placaSolar);
        return new ProducaoEnergia(kwDiaria, kwMensal, rendimentoDiario, rendimentoMensal);
    }
}
