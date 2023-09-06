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
    @JoinColumn(name="id_artista")
    private Artista artista;
    @OneToOne
    @JoinColumn(name="id_temperamento")
    private Temperamento temperamento;
    @OneToMany
    @JoinColumn(name="id_canciones")
    private Canciones canciones;

    public Genero() {
    }

    public Genero(int id_genero, String nameGenero, Artista artista, Temperamento temperamento, Canciones canciones) {
        this.id_genero = id_genero;
        this.nameGenero = nameGenero;
        this.artista = artista;
        this.temperamento = temperamento;
        this.canciones = canciones;
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
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
