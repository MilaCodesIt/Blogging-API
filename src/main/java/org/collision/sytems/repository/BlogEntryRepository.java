package org.collision.sytems.repository;

import org.collision.sytems.model.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BlogEntryRepository implements JpaRepository<BlogEntry, Long> {
    @Override
    public <S extends BlogEntry> S save(S entity) {
        return null;
    }

    @Override
    public Optional<BlogEntry> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
