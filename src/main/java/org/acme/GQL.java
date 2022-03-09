package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Map;

@GraphQLApi
public class GQL {
    private final ExtensionsService extensionsService;

    public GQL(@RestClient ExtensionsService extensionsService) {
        this.extensionsService = extensionsService;
    }

    @Query
    public Uni<A> getOK() {
        return extensionsService.all().map(ok -> new A(ok));
    }
}
