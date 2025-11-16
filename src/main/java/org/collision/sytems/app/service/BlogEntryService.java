package org.collision.sytems.app.service;

import org.collision.sytems.app.model.Entry;
import org.collision.sytems.app.repository.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Supplier;

@Service
public class BlogEntryService implements IBlogEntryService {

    private final BlogEntryRepository repository;

    @Autowired
    public BlogEntryService(BlogEntryRepository blogEntryRepository) {
        this.repository = blogEntryRepository;
    }

    @Override
    public Iterable<Entry> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Entry> getEntryById(long id) {
        return repository.findById(id);
    }

    @Override
    public Entry createEntry(Entry entry) {
        return repository.save(entry);
    }

    @Override
    public Entry updateEntryById(long id, Entry newEntry) {
        if (repository.existsById(id)) {
            return repository.save(newEntry);
        }
        return newEntry;
    }

    @Override
    public Entry deleteEntryById(long id) {
        Optional<Entry> result = Optional.empty();
        if (repository.existsById(id)) {
            result = repository.findById(id);
            repository.deleteById(id);
        }
        return result.map(Entry::new).orElseGet(Entry::new);
    }
}
