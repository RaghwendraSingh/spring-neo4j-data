package movies.spring.data.neo4j.controller;

import java.util.*;

import movies.spring.data.neo4j.domain.Network;
import movies.spring.data.neo4j.services.MLMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raghwendra Singh
 */
@RestController("/")
public class MLMController {

	final MLMService mlmService;

	@Autowired
	public MLMController(MLMService mlmService) {
		this.mlmService = mlmService;
	}

	@RequestMapping("/mlm")
	public List<Network> mlm(@RequestParam(value = "area",required = true) String area) {
		return mlmService.getNetworkByArea(area);
	}
}
