package hello.dao;

import hello.model.TmpEntity;
import org.springframework.data.repository.CrudRepository;

public interface TmpEntityDao extends CrudRepository<TmpEntity, Long> {
}
