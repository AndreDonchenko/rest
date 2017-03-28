package ua.andre.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.andre.entities.PositionEntity;

/**
 * Created by andre on 05.03.17.
 */
@Repository
public interface PositionRepository extends CrudRepository<PositionEntity, String> {
}
