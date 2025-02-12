package language_forest.repository

import language_forest.entity.UserInfoEntity
import language_forest.repository.softDelete.JpaRepositoryWithSoftDelete
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserInfoRepository : JpaRepositoryWithSoftDelete<UserInfoEntity, UUID> {
}