package domain.users

import org.joda.time.DateTime
import play.api.libs.json.Json

/**
  * Created by hashcode on 2016/08/12.
  */
case class UserSession(email:String,
                       userSessionId:String,
                       startTime:DateTime,
                       ipaddress:String,
                       browserSession:String,
                       status:String,
                       tokenId:String
                       )

object UserSession{
    implicit val usersessionFmt = Json.format[UserSession]
}