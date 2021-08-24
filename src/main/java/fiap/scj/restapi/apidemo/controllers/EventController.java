package fiap.scj.restapi.apidemo.controllers;

import fiap.scj.restapi.apidemo.models.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final static List<Event> REPOSITORIO = new ArrayList<>();
    static {
        Event e = new Event();
        e.setActive(true);
        e.setId(1);
        e.setDescription("Balada remota");
        e.setStartIn(new Date());
        e.setEndId(null);
        REPOSITORIO.add(e);
    }

    @GetMapping("/test")
    public String test() {
        // GET http://localhost:8080/event/test
        return "Teste efetuado com sucesso!";
    }

    // Retrieve All
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    public List<Event> listAll() {
        // GET http://localhost:8080/events
        return REPOSITORIO;
    }

    // Retrieve by id
    @GetMapping("/{id}")
    public ResponseEntity<Event> listById(@PathVariable Integer id) {
        // GET http://localhost:8080/events/1
        for (Event event: REPOSITORIO) {
            if (event.getId().equals(id)) {
                return ResponseEntity.ok(event);
            }
        }
        return ResponseEntity.noContent().build();
    }

    // Exercício: Criar o restante dos métodos CRUD:

    // Create

    // Update

    // Delete

}
