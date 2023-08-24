
    package src.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import src.model.UserFollowProduct;

    import java.util.UUID;

@Repository
public interface IUserFollowProductRepository extends JpaRepository<UserFollowProduct, UUID> {
}

    