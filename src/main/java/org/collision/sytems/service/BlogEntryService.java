package org.collision.sytems.service;

import org.collision.sytems.model.BlogEntry;
import org.collision.sytems.repository.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogEntryService implements IBlogEntryService{

    @Autowired
    BlogEntryRepository repository;

    @Override
    public List<BlogEntry> getAll() {
        return null;
    }

    @Override
    public BlogEntry getEntryById(long id) {
        return null;
    }

    @Override
    public void createEntry(BlogEntry entry) {

    }

    @Override
    public void updateEntryById(long id) {

    }

    @Override
    public void deleteEntryById(long id) {

    }
}
