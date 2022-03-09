package org.acme;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Repo {
    public Uni<B> getB() {
        return Uni.createFrom().item(new B(System.currentTimeMillis() + ""));
    }

    public class B {
        public final String bee;

        public B(String bee) {
            this.bee = bee;
        }
    }
}
