package test.java.it.unife.reactive.demo2.model;

import java.lang.annotation.Inherited;

@Table("chat_message")
@Data
public class ChatMessage {
    @Id
    private Long id;
    private String nickname;
    private String message;
    private LocalDateTime createdAt;

    
}
