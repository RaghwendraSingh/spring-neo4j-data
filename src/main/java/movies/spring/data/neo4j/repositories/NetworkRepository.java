package movies.spring.data.neo4j.repositories;

import java.util.List;

import movies.spring.data.neo4j.domain.Network;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "networks", path = "nw")
public interface NetworkRepository extends PagingAndSortingRepository<Network, Long> {

    List<Network> findByUuid(@Param("uuid") String uuid);
    List<Network> findByName(@Param("name") String name);
    List<Network> findByArea(@Param("area") String area);

}
