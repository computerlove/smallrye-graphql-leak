package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Map;

@GraphQLApi
@ApplicationScoped
public class GQL {
    @Inject
    @RestClient
    ExtensionsService extensionsService;

    @Query
    public Uni<A> getOK() {
        return extensionsService.all().map(ok -> new A(ok));
    }
}
