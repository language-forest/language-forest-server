/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package language_forest.generated.api

import language_forest.generated.model.BaseUserNotification
import language_forest.generated.model.CreateUserRequest
import language_forest.generated.model.ErrorResponse
import language_forest.generated.model.NotificationEnum
import language_forest.generated.model.UpdateUserNotificationRequest
import language_forest.generated.model.UpdateUserRequest
import language_forest.generated.model.UserResponse
import language_forest.generated.model.UserSocialResponse
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
interface UserApi {

    fun getDelegate(): UserApiDelegate = object: UserApiDelegate {}


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user"],
            consumes = ["application/json"]
    )
    fun createUser( @Valid @RequestBody createUserRequest: CreateUserRequest): ResponseEntity<Unit> {
        return getDelegate().createUser(createUserRequest)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/me"],
            produces = ["application/json"]
    )
    fun getUserMe(): ResponseEntity<UserResponse> {
        return getDelegate().getUserMe()
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/me/notification/{notification}"],
            produces = ["application/json"]
    )
    fun getUserMeNotification( @PathVariable("notification") notification: NotificationEnum): ResponseEntity<BaseUserNotification> {
        return getDelegate().getUserMeNotification(notification)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/me/social"],
            produces = ["application/json"]
    )
    fun getUserMeSocial(): ResponseEntity<UserSocialResponse> {
        return getDelegate().getUserMeSocial()
    }


    @RequestMapping(
            method = [RequestMethod.PATCH],
            value = ["/user/me"],
            consumes = ["application/json"]
    )
    fun updateUser( @Valid @RequestBody updateUserRequest: UpdateUserRequest): ResponseEntity<Unit> {
        return getDelegate().updateUser(updateUserRequest)
    }


    @RequestMapping(
            method = [RequestMethod.PATCH],
            value = ["/user/me/notification/{notification}"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateUserNotification( @PathVariable("notification") notification: NotificationEnum, @Valid @RequestBody updateUserNotificationRequest: UpdateUserNotificationRequest): ResponseEntity<BaseUserNotification> {
        return getDelegate().updateUserNotification(notification, updateUserNotificationRequest)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/me/delete"]
    )
    fun userMeDelete(): ResponseEntity<Unit> {
        return getDelegate().userMeDelete()
    }
}
