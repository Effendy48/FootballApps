package id.ac.undip.ce.student.muhammadrizqi.footballapps.api
import id.ac.undip.ce.student.muhammadrizqi.footballapps.BuildConfig

object TheSportDBApi{

    private fun urlBuild(path: String, id: String? = null): String{
        val url = BuildConfig.BASE_URL+"api/v1/json/"+BuildConfig.TSDB_API_KEY+"/"+path
        return if(id.isNullOrEmpty()) url else url+"?id="+id
    }
    fun getPrevSchedule(id: String?) = urlBuild("eventspastleague.php", id)
    fun getNextSchedule(id: String?) = urlBuild("eventsnextleague.php", id)
    fun getMatchDetail(id: String?) = urlBuild("lookupevent.php", id)
    fun getTeams(league: String?) = urlBuild("search_all_teams.php?l="+league)
    fun getTeamDetail(id: String?) = urlBuild("lookupteam.php", id)
    fun getListLeague() = urlBuild("search_all_leagues.php?s=Soccer")
    fun getEvents(query: String?) = urlBuild("searchevents.php?e="+query)

}