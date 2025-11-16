package org.collision.sytems.app.controller;


import jakarta.validation.Valid;
import org.collision.sytems.app.model.Entry;
import org.collision.sytems.app.service.BlogEntryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BlogEntryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogEntryController.class);
    private final BlogEntryService entryService;

    @Autowired
    public BlogEntryController(BlogEntryService entryService) {
        this.entryService = entryService;
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Entry> createEntry(
            @Valid
            @RequestBody final Entry newEntry) {
        LOGGER.info("POST REQUEST With body: {}", newEntry);
        try {
            Entry entry = entryService.createEntry(newEntry);
            LOGGER.info("Successfully stored: {}", newEntry);
            return new ResponseEntity<>(entry, HttpStatus.CREATED);
        } catch (Exception exception) {
            LOGGER.info("Wrong request with body {}:", newEntry);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Entry>> getAllEntries() {
        LOGGER.info("GET REQUEST : ");
        Iterable<Entry> result = entryService.getAll();
        LOGGER.info("Found a collection of next registers: {}", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> getById(
            @PathVariable("id") final long id) {
        Optional<Entry> result = entryService.getEntryById(id);

        return result.map(entry -> new ResponseEntity<>(entry, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Entry> updateById(
            @Valid
            @PathVariable("id") final long id,
            @RequestBody final Entry newEntry) {
        Entry entry = entryService.updateEntryById(id, newEntry);
        return new ResponseEntity<>(entry, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Entry> deleteById(
            @Valid
            @PathVariable("id") long id) {
        Entry entry = entryService.deleteEntryById(id);

        return (entry != null) ? new ResponseEntity<>(entry, HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
