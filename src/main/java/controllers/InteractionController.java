package controllers;

import model.Interaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.InteractionService;

import java.util.List;

@RestController
@RequestMapping("/api/interaction")
public class InteractionController {
    @Autowired
    private InteractionService interactionService;


    @GetMapping
    public List<Interaction> getAllInteraction() {
        return interactionService.getAllInteraction();
    }
    @GetMapping("{/id}")
    public Interaction getInteractionById(@PathVariable Long id){
        return interactionService.getInteractionById(id);
    }
    @PostMapping
    public Interaction saveInteraction(@RequestBody Interaction interaction){
        return interactionService.saveInteraction(interaction);
    }
}
