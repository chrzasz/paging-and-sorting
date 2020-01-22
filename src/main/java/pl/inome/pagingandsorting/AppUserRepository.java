package pl.inome.pagingandsorting;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long> {
}
