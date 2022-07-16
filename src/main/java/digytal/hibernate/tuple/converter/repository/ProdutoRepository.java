package digytal.hibernate.tuple.converter.repository;

import digytal.hibernate.tuple.converter.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Integer> {
}
