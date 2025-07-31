# Esercizio Spring MVC: Creazione di un Controller con più rotte

## Descrizione

In questo esercizio si crea un nuovo progetto Spring MVC con l’obiettivo di esercitarsi con la gestione delle rotte e la restituzione di pagine HTML.

### Obiettivi:

- Creare un Controller Spring che gestisca più rotte (endpoint).
- Ogni rotta deve restituire una pagina HTML diversa, presa dalla cartella `templates`.
- Testare l’applicazione avviandola e verificando che ogni URL restituisca la pagina corretta.

### Indicazioni:

- Utilizzare l’annotazione `@Controller` per definire il controller.
- Definire i metodi mappati con `@GetMapping` o `@RequestMapping` per ogni rotta.
- Le pagine HTML devono essere posizionate nella cartella `src/main/resources/templates`.
- Usare Thymeleaf (o altro motore di template configurato) per il rendering delle pagine.
