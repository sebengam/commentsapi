package factories.sites

import domain.sites.Site

/**
  * Created by hashcode on 2016/09/21.
  */
object SiteFactory {

  def getSite(values:Map[String,String]):Site={
    Site(name = values("name"),siteId = values("siteId"),url = values("url"))
  }
}
