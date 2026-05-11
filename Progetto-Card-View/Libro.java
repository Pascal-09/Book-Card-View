public class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private String genere;
    private double prezzo;
    
    // Campi aggiuntivi necessari per il layout
    private String urlImmagine;      // Per caricare la copertina
    private int percentualeSconto;   // Per il badge "25% OFF"
    private double rating;           // Per le stelle (es. 4.0)
    private int numeroRecensioni;    // Per il testo "128 recensioni"
    private boolean disponibile;     // Per il pallino verde "Disponibile"
    private String editore;          // Per il testo "[Panini Comics, 2001]"
    private String descrizione;      // Per il corpo del testo
}
