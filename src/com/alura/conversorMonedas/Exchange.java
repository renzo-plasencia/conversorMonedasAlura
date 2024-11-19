package com.alura.conversorMonedas;

public record Exchange(String base_code,
                       String target_code,
                       double conversion_rate
                       ) {
    @Override
    public String toString() {
        return "Exchange{" +
                "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                '}';
    }
}
