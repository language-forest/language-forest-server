package language_forest.entity

import jakarta.persistence.*
import language_forest.generated.model.LanguageEnum
import language_forest.generated.model.LevelEnum
import language_forest.generated.model.VoiceTypeEnum
import org.hibernate.annotations.Filter
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "user_study_info")
@Filter(name = "softDeleteFilter", condition = "deleted_at IS NULL")
class UserStudyInfoEntity(
    @Id val id: UUID,

    val uid: UUID,

    @Enumerated(EnumType.STRING)
    @Column(name = "level")
    var level: LevelEnum,

    @Enumerated(EnumType.STRING)
    @Column(name = "voice_type")
    var voiceType: VoiceTypeEnum,

    @Enumerated(EnumType.STRING)
    @Column(name = "language")
    val language: LanguageEnum,

    var streakDays: Int,
    var sentenceAmount: Int,
) : BaseTimestampEntity()
