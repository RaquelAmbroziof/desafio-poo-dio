package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private Nivel nivel;

    public Curso(String titulo, String descricao, int cargaHoraria, Nivel nivel) {
        super(titulo, descricao, cargaHoraria);
        this.nivel = nivel;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * super.getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + super.getCargaHoraria() +
                '}';
    }
}
