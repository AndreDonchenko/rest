package ua.andre.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.andre.entities.EmployeeEntity;

/**
 * Created by andre on 05.03.17.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
