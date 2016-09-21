package domain.comments

import org.joda.time.DateTime

/**
  * Created by hashcode on 2016/09/20.
  */
case class Comment(siteId:String,subjectId:String,commentId:String,comment:String, emailId:String, ipaddress:String,date:DateTime)

object Comment{

}
