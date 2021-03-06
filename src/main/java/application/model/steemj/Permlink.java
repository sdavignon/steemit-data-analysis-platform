package application.model.steemj;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Permlink {
    public String link;
    @GraphId
    Long id;

    public Permlink() {
    }

    public Permlink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
