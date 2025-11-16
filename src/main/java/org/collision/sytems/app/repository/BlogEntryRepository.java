package org.collision.sytems.app.repository;

import org.collision.sytems.app.model.Entry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogEntryRepository extends CrudRepository<Entry, Long> {

}
