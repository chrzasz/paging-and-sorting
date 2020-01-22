package pl.inome.pagingandsorting;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long> {
}
