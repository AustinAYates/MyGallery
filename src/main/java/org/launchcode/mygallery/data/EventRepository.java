package org.launchcode.mygallery.data;

import org.launchcode.mygallery.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kevin Buss
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
