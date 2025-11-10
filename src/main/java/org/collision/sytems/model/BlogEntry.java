package org.collision.sytems.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BlogEntry {
    @Id
    private int id;
    private String title;
    private String message;
    private boolean nsfw;
}
