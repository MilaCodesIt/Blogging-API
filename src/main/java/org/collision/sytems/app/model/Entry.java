package org.collision.sytems.app.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "entry")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title", length = 25)
    @Size(max = 25)
    private String title;

    @Column(name = "content", length = 100)
    @Size(max = 100)
    private String content;
    
    @Column(name = "nsfw")
    private boolean nsfw;

    public Entry (Entry entry) {
        this.content = entry.getContent();
        this.nsfw = entry.isNsfw();
        this.title = entry.getTitle();
        this.id = entry.getId();
    }
}
