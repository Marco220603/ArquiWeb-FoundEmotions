package com.example.demo.entities;

@Entity
@Table(name="generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_genero;
    @Column(name="nameGenero",length = 40, nullable = false)
    private String nameGenero;
    @OneToMany
    @JoinColumn(name="idArtista")
    private Artista artista;

    public Genero() {
    }

    public Genero(int id_genero, String nameGenero, Artista artista) {
        this.id_genero = id_genero;
        this.nameGenero = nameGenero;
        this.artista = artista;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNameGenero() {
        return nameGenero;
    }

    public void setNameGenero(String nameGenero) {
        this.nameGenero = nameGenero;
    }
}
