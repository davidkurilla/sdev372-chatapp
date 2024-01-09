// PACKAGE INFO
package edu.greenriver.sdev.chatapp.models;

// IMPORTS
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// CLASS: Chat
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {

    // FIELDS
    private String sender;
    private String message;
    private boolean isAttachment;
    private String attachmentType;
}
