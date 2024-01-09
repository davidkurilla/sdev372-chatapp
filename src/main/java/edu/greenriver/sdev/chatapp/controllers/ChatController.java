// PACKAGE INFO
package edu.greenriver.sdev.chatapp.controllers;

// IMPORTS
import edu.greenriver.sdev.chatapp.models.Chat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// CLASS: ChatController
@RestController
public class ChatController {

    // FIELDS
    private final Chat[] CHATS = {
            new Chat("Friend 1", "Hey! How's it going?", false, null),
            new Chat("Friend 2", "Not bad! Just finished a workout. You?", false, null),
            new Chat("Friend 1", "Nice! I'm binge-watching a new series. Wanna join later?", false, null)
    };

    // METHOD: chats
    @GetMapping("chats/all")
    public Chat[] chats() {
        return CHATS;
    }
}
