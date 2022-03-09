package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/extensions")
@RegisterRestClient(configKey = "extensions")
public interface ExtensionsService {

    @GET
    Uni<List<Extension>> all();

    class Extension {

        public String id;
        public String name;
        public String shortName;
        public List<String> keywords;

    }
}
