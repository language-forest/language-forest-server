/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package language_forest.generated.api

import language_forest.generated.model.CreateStudyPracticeRequest
import language_forest.generated.model.CreateStudyPracticeResponse
import language_forest.generated.model.CreateStudyRequest
import language_forest.generated.model.CreateStudyResponse
import language_forest.generated.model.CreateStudySummaryResponse
import language_forest.generated.model.UpdateStudyPracticeRequest
import language_forest.generated.model.UpdateStudyPracticeResponse
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
interface StudyApi {

    fun getDelegate(): StudyApiDelegate = object: StudyApiDelegate {}


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/study"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createStudy( @Valid @RequestBody createStudyRequest: CreateStudyRequest): ResponseEntity<CreateStudyResponse> {
        return getDelegate().createStudy(createStudyRequest)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/study/{studyId}/practice"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createStudyPractice( @PathVariable("studyId") studyId: java.util.UUID, @Valid @RequestBody createStudyPracticeRequest: CreateStudyPracticeRequest): ResponseEntity<CreateStudyPracticeResponse> {
        return getDelegate().createStudyPractice(studyId, createStudyPracticeRequest)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/study/{studyId}/summary"],
            produces = ["application/json"]
    )
    fun createStudySummary( @PathVariable("studyId") studyId: java.util.UUID): ResponseEntity<CreateStudySummaryResponse> {
        return getDelegate().createStudySummary(studyId)
    }


    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/study/{studyId}/practice/{studyPracticeId}"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateStudyPractice( @PathVariable("studyId") studyId: java.util.UUID, @PathVariable("studyPracticeId") studyPracticeId: java.util.UUID, @Valid @RequestBody updateStudyPracticeRequest: UpdateStudyPracticeRequest): ResponseEntity<UpdateStudyPracticeResponse> {
        return getDelegate().updateStudyPractice(studyId, studyPracticeId, updateStudyPracticeRequest)
    }


    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/study/{studyId}/practice/{studyPracticeId}/retry"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateStudyPracticeRetry( @PathVariable("studyId") studyId: java.util.UUID, @PathVariable("studyPracticeId") studyPracticeId: java.util.UUID, @Valid @RequestBody updateStudyPracticeRequest: UpdateStudyPracticeRequest): ResponseEntity<UpdateStudyPracticeResponse> {
        return getDelegate().updateStudyPracticeRetry(studyId, studyPracticeId, updateStudyPracticeRequest)
    }
}
