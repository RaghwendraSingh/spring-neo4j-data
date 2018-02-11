package movies.spring.data.neo4j.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Network {

	@GraphId private Long id;

    private String uuid;
	private String name;
	private String area;

    public String getUuid() {
        return uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getArea() {
	    return area;
	}
	
	public void setArea(String area) {
	
	    this.area = area;
	}

}
