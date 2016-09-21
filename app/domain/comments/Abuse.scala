package domain.comments

import org.joda.time.DateTime

/**
  * Created by hashcode on 2016/09/21.
  */
case class Abuse(siteId:String,subjectId:String, commentIdOrResponseId:String, abuseId:String, details:String, emailId:String, date:DateTime)
object Abuse{

}
