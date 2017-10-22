
package DTO;


public class seriesDTO {
    private int id;
    private String nome;
    private String genero;
    private String critica;
    private String nota;

    public seriesDTO(String nome, String genero, String nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    
    public seriesDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCritica() {
        return critica;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
