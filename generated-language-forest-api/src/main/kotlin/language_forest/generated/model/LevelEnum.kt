package language_forest.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
* 학습 수준 (A/B/C/D/E)
* Values: A,B,C,D,E
*/
enum class LevelEnum(@get:JsonValue val value: kotlin.String) {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LevelEnum {
                return values().first{it -> it.value == value}
        }
    }
}

