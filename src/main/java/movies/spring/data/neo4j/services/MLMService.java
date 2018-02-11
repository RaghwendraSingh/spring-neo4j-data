package movies.spring.data.neo4j.services;

import java.util.*;

import movies.spring.data.neo4j.domain.Network;
import movies.spring.data.neo4j.repositories.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MLMService {

	@Autowired NetworkRepository networkRepository;
	
	public List<Network> getNetworkByUuid(String uuid) {
	    return networkRepository.findByUuid(uuid);
	}
	
	public List<Network> getNetworkByName(String name) {
	    return networkRepository.findByName(name);
	}
	
	public List<Network> getNetworkByArea(String area) {
	    return networkRepository.findByArea(area);
	}
	
}
