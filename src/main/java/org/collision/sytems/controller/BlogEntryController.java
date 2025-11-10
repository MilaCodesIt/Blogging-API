package org.collision.sytems.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.collision.sytems.service.BlogEntryService;
import org.collision.sytems.model.BlogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlogEntryController {
    private static final Logger LOGGER = LogManager.getLogger();
    private final BlogEntryService entryService;

    @Autowired
    public BlogEntryController(BlogEntryService entryService) {
        this.entryService = entryService;
    }

    @PostMapping("/new")
    public ResponseEntity<String> createEntry(@RequestBody final BlogEntry entry) {
        LOGGER.info("Create a new entry with : {} as body.", entry);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogEntry> getEntryById(@PathVariable final long id) {
        BlogEntry result = new BlogEntry();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BlogEntry>> getAllEntries() {
        List<BlogEntry> result = new ArrayList<>();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEntryById(@PathVariable final long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEntryById(@PathVariable final long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
