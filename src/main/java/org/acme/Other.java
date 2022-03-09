package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@GraphQLApi
@ApplicationScoped
public class Other {
    @Inject
    Repo repo;

    public Uni<Repo.B> bbbb(@Source A a) {
        return repo.getB();
    }


}
