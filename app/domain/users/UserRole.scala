package domain.users

import play.api.libs.json.Json

/**
  * Created by hashcode on 2016/08/12.
  */
case class UserRole( emailId: String,
                     roleId: String
                   )
object UserRole {
  implicit val userroleFmt = Json.format[UserRole]
}