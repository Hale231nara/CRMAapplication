package services;

import model.Interaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.InteractionRepository;

import java.util.List;

@Service
public class InteractionService {
    @Autowired
    private InteractionRepository interactionRepository;

    public List<Interaction> getAllInteraction() {
        return interactionRepository.findAll();
    }

    public Interaction getInteractionById(Long id) {
        return interactionRepository.findById(id).orElse(null);
    }

    public Interaction saveInteraction(Interaction interaction){
        return interactionRepository.save(interaction);
    }
}
