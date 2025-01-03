/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package language_forest.generated.api

import language_forest.generated.model.CreateUserInfoRequest
import language_forest.generated.model.UserInfoDto
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
interface UserInfoApi {

    fun getDelegate(): UserInfoApiDelegate = object: UserInfoApiDelegate {}


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user-info"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createUserInfo( @Valid @RequestBody createUserInfoRequest: CreateUserInfoRequest): ResponseEntity<UserInfoDto> {
        return getDelegate().createUserInfo(createUserInfoRequest)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user-info/me"],
            produces = ["application/json"]
    )
    fun getUserInfoMe(): ResponseEntity<UserInfoDto> {
        return getDelegate().getUserInfoMe()
    }
}
