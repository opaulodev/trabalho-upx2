package com.upx.energiasolar.models;

public class PlacaSolar {

    private int quantidadeDePlacas;
    private int quantidadeKwPorPlaca;
    private double mediaLocal;

    @Override
    public String toString() {
        return "PlacaSolar{" +
                "quantidadeDePlacas=" + quantidadeDePlacas +
                ", quantidadeKwPorPlaca=" + quantidadeKwPorPlaca +
                ", mediaLocal=" + mediaLocal +
                '}';
    }

    public int getQuantidadeDePlacas() {
        return quantidadeDePlacas;
    }

    public void setQuantidadeDePlacas(int quantidadeDePlacas) {
        this.quantidadeDePlacas = quantidadeDePlacas;
    }

    public int getQuantidadeKwPorPlaca() {
        return quantidadeKwPorPlaca;
    }

    public void setQuantidadeKwPorPlaca(int quantidadeKwPorPlaca) {
        this.quantidadeKwPorPlaca = quantidadeKwPorPlaca;
    }

    public double getMediaLocal() {
        return mediaLocal;
    }

    public void setMediaLocal(double mediaLocal) {
        this.mediaLocal = mediaLocal;
    }
}
