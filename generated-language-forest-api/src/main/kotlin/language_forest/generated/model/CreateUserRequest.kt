package language_forest.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import language_forest.generated.model.GenderEnum
import language_forest.generated.model.LevelEnum
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

/**
 * 
 * @param nickname 유저 닉네임 (필수)
 * @param language 대표 언어 (필수)
 * @param gender 
 * @param yearOfBirth 옵션 - 태어난 해
 * @param occupation 옵션 - 직업
 * @param interest 옵션 - 관심사
 * @param level 
 * @param purpose 옵션 - 학습 목적
 * @param languageSecond 옵션 - 2차 언어 (ex. JP)
 * @param studyPlace 옵션 - 학습 장소 (ex. ONLINE, OFFLINE)
 * @param mbti 옵션 - MBTI
 */
data class CreateUserRequest(

    @get:JsonProperty("nickname", required = true) val nickname: kotlin.String,

    @get:JsonProperty("language", required = true) val language: kotlin.String,

    @field:Valid
    @get:JsonProperty("gender") val gender: GenderEnum? = null,

    @get:JsonProperty("yearOfBirth") val yearOfBirth: kotlin.Int? = null,

    @get:JsonProperty("occupation") val occupation: kotlin.String? = null,

    @get:JsonProperty("interest") val interest: kotlin.String? = null,

    @field:Valid
    @get:JsonProperty("level") val level: LevelEnum? = null,

    @get:JsonProperty("purpose") val purpose: kotlin.String? = null,

    @get:JsonProperty("languageSecond") val languageSecond: kotlin.String? = null,

    @get:JsonProperty("studyPlace") val studyPlace: kotlin.String? = null,

    @get:JsonProperty("mbti") val mbti: kotlin.String? = null
    ) {

}

