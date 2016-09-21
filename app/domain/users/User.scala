package domain.users

import play.api.libs.json.Json

/**
  * Created by hashcode on 2016/08/12.
  */
case class User(emailId: String,
                screenName: String,
                password: String,
                userStatus: String
               ) {
}

object User {
  implicit val userFmt = Json.format[User]
}