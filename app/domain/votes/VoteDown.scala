package domain.votes

import play.api.libs.json.Json

/**
 * Created by hashcode on 2015/05/11.
 */
case class VoteDown(commentIdOrResponseId:String,emailId:String,ipaddress:String,count:Int)

object VoteDown {
  implicit val commentFmt = Json.format[VoteDown]
}