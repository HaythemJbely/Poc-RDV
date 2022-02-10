package poc.inetum.flowable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poc.inetum.flowable.domain.Rdv;

public interface RdvRepository extends JpaRepository<Rdv,Long> {
}
