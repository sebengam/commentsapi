package domain.votes

import play.api.libs.json.Json

/**
 * Created by hashcode on 2015/05/11.
 */
case class VoterRegister(commentIdOrResponseId:String,emailId:String,ipaddress:String)

object VoterRegister {
  implicit val voterRegisterFmt = Json.format[VoterRegister]
}