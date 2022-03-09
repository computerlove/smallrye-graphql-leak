package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

import javax.inject.Inject;

@GraphQLApi
public class Other {
    private final Repo repo;

    @Inject
    public Other(Repo repo) {
        this.repo = repo;
    }

    public Uni<Repo.B> bbbb(@Source A a) {
        return repo.getB();
    }


}
