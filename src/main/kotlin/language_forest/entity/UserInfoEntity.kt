package language_forest.entity

import com.vladmihalcea.hibernate.type.json.JsonStringType
import jakarta.persistence.*
import language_forest.generated.model.GenderEnum
import language_forest.generated.model.LanguageEnum
import language_forest.generated.model.LevelEnum
import org.hibernate.annotations.Filter
import org.hibernate.annotations.Type
import org.hibernate.annotations.UuidGenerator
import java.util.UUID

@Entity
@Table(name = "user_info")
@Filter(name = "softDeleteFilter", condition = "deleted_at IS NULL")
class UserInfoEntity(
    @Id val uid: UUID,

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    var gender: GenderEnum?,
    var yearOfBirth: Int?,
    var occupation: String?,

    @Type(value = JsonStringType::class)
    var interest: List<String>?,

    var purpose: String?,

    @Enumerated(EnumType.STRING)
    @Column(name = "language_second")
    var languageSecond: LanguageEnum?,
    var studyPlace: String?,
    var mbti: String?,
) : BaseTimestampEntity() {}
