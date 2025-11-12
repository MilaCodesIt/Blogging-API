package org.collision.sytems.service;

import ch.qos.logback.core.joran.event.BodyEvent;
import org.collision.sytems.model.BlogEntry;

import java.util.List;

public interface IBlogEntryService {
    public List<BlogEntry> getAll();
    public BlogEntry getEntryById(long id);
    public void createEntry(BlogEntry entry);
    public void updateEntryById(long id);
    public void deleteEntryById(long id);
}
