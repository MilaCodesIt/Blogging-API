package org.collision.sytems.app.service;

import org.collision.sytems.app.model.Entry;

import java.util.Optional;


public interface IBlogEntryService {
    public Iterable<Entry> getAll();

    public Optional<Entry> getEntryById(long id);

    public Entry createEntry(Entry entry);

    public Entry updateEntryById(long id, Entry newEntry);

    public Entry deleteEntryById(long id);
}
