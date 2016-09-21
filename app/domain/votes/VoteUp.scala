package domain.votes

import play.api.libs.json.Json

/**
 * Created by hashcode on 2015/05/11.
 */
case class VoteUp(commentIdOrResponseId:String,emailId:String,ipaddress:String,count:Int)

object VoteUp {
  implicit val voteUpFmt = Json.format[VoteUp]
}