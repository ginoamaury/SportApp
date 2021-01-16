package com.ginoamaury.sportapp.Model.Object;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event implements Serializable
{

    @SerializedName("idEvent")
    @Expose
    private String idEvent;
    @SerializedName("idSoccerXML")
    @Expose
    private Object idSoccerXML;
    @SerializedName("idAPIfootball")
    @Expose
    private String idAPIfootball;
    @SerializedName("strEvent")
    @Expose
    private String strEvent;
    @SerializedName("strEventAlternate")
    @Expose
    private String strEventAlternate;
    @SerializedName("strFilename")
    @Expose
    private String strFilename;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("idLeague")
    @Expose
    private String idLeague;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("strSeason")
    @Expose
    private String strSeason;
    @SerializedName("strDescriptionEN")
    @Expose
    private Object strDescriptionEN;
    @SerializedName("strHomeTeam")
    @Expose
    private String strHomeTeam;
    @SerializedName("strAwayTeam")
    @Expose
    private String strAwayTeam;
    @SerializedName("intHomeScore")
    @Expose
    private Object intHomeScore;
    @SerializedName("intRound")
    @Expose
    private String intRound;
    @SerializedName("intAwayScore")
    @Expose
    private Object intAwayScore;
    @SerializedName("intSpectators")
    @Expose
    private Object intSpectators;
    @SerializedName("strOfficial")
    @Expose
    private String strOfficial;
    @SerializedName("strHomeGoalDetails")
    @Expose
    private Object strHomeGoalDetails;
    @SerializedName("strHomeRedCards")
    @Expose
    private Object strHomeRedCards;
    @SerializedName("strHomeYellowCards")
    @Expose
    private Object strHomeYellowCards;
    @SerializedName("strHomeLineupGoalkeeper")
    @Expose
    private Object strHomeLineupGoalkeeper;
    @SerializedName("strHomeLineupDefense")
    @Expose
    private Object strHomeLineupDefense;
    @SerializedName("strHomeLineupMidfield")
    @Expose
    private Object strHomeLineupMidfield;
    @SerializedName("strHomeLineupForward")
    @Expose
    private Object strHomeLineupForward;
    @SerializedName("strHomeLineupSubstitutes")
    @Expose
    private Object strHomeLineupSubstitutes;
    @SerializedName("strHomeFormation")
    @Expose
    private Object strHomeFormation;
    @SerializedName("strAwayRedCards")
    @Expose
    private Object strAwayRedCards;
    @SerializedName("strAwayYellowCards")
    @Expose
    private Object strAwayYellowCards;
    @SerializedName("strAwayGoalDetails")
    @Expose
    private Object strAwayGoalDetails;
    @SerializedName("strAwayLineupGoalkeeper")
    @Expose
    private Object strAwayLineupGoalkeeper;
    @SerializedName("strAwayLineupDefense")
    @Expose
    private Object strAwayLineupDefense;
    @SerializedName("strAwayLineupMidfield")
    @Expose
    private Object strAwayLineupMidfield;
    @SerializedName("strAwayLineupForward")
    @Expose
    private Object strAwayLineupForward;
    @SerializedName("strAwayLineupSubstitutes")
    @Expose
    private Object strAwayLineupSubstitutes;
    @SerializedName("strAwayFormation")
    @Expose
    private Object strAwayFormation;
    @SerializedName("intHomeShots")
    @Expose
    private Object intHomeShots;
    @SerializedName("intAwayShots")
    @Expose
    private Object intAwayShots;
    @SerializedName("strTimestamp")
    @Expose
    private String strTimestamp;
    @SerializedName("dateEvent")
    @Expose
    private String dateEvent;
    @SerializedName("dateEventLocal")
    @Expose
    private Object dateEventLocal;
    @SerializedName("strDate")
    @Expose
    private Object strDate;
    @SerializedName("strTime")
    @Expose
    private String strTime;
    @SerializedName("strTimeLocal")
    @Expose
    private Object strTimeLocal;
    @SerializedName("strTVStation")
    @Expose
    private Object strTVStation;
    @SerializedName("idHomeTeam")
    @Expose
    private String idHomeTeam;
    @SerializedName("idAwayTeam")
    @Expose
    private String idAwayTeam;
    @SerializedName("strResult")
    @Expose
    private Object strResult;
    @SerializedName("strVenue")
    @Expose
    private String strVenue;
    @SerializedName("strCountry")
    @Expose
    private String strCountry;
    @SerializedName("strCity")
    @Expose
    private Object strCity;
    @SerializedName("strPoster")
    @Expose
    private Object strPoster;
    @SerializedName("strFanart")
    @Expose
    private Object strFanart;
    @SerializedName("strThumb")
    @Expose
    private String strThumb;
    @SerializedName("strBanner")
    @Expose
    private Object strBanner;
    @SerializedName("strMap")
    @Expose
    private Object strMap;
    @SerializedName("strTweet1")
    @Expose
    private Object strTweet1;
    @SerializedName("strTweet2")
    @Expose
    private Object strTweet2;
    @SerializedName("strTweet3")
    @Expose
    private Object strTweet3;
    @SerializedName("strVideo")
    @Expose
    private Object strVideo;
    @SerializedName("strStatus")
    @Expose
    private String strStatus;
    @SerializedName("strPostponed")
    @Expose
    private String strPostponed;
    @SerializedName("strLocked")
    @Expose
    private String strLocked;
    private final static long serialVersionUID = 4035692476129758817L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Event() {
    }

    /**
     *
     * @param strOfficial
     * @param intHomeShots
     * @param strSport
     * @param strHomeLineupDefense
     * @param strAwayLineupSubstitutes
     * @param strTweet1
     * @param strTweet2
     * @param strTweet3
     * @param idLeague
     * @param idSoccerXML
     * @param strHomeLineupForward
     * @param strTVStation
     * @param strHomeGoalDetails
     * @param strVideo
     * @param strAwayLineupGoalkeeper
     * @param strAwayLineupMidfield
     * @param idEvent
     * @param intRound
     * @param strHomeYellowCards
     * @param idHomeTeam
     * @param intHomeScore
     * @param dateEvent
     * @param strCountry
     * @param strTimestamp
     * @param strAwayTeam
     * @param strHomeLineupMidfield
     * @param strPostponed
     * @param strDate
     * @param strHomeFormation
     * @param strMap
     * @param idAwayTeam
     * @param strAwayRedCards
     * @param strBanner
     * @param strFanart
     * @param strDescriptionEN
     * @param dateEventLocal
     * @param strResult
     * @param intAwayShots
     * @param strFilename
     * @param strTime
     * @param strVenue
     * @param strAwayGoalDetails
     * @param strAwayLineupForward
     * @param strTimeLocal
     * @param idAPIfootball
     * @param strLocked
     * @param strSeason
     * @param intSpectators
     * @param strEventAlternate
     * @param strHomeRedCards
     * @param strHomeLineupGoalkeeper
     * @param strHomeLineupSubstitutes
     * @param strAwayFormation
     * @param strEvent
     * @param strAwayYellowCards
     * @param strAwayLineupDefense
     * @param strHomeTeam
     * @param strThumb
     * @param strLeague
     * @param intAwayScore
     * @param strCity
     * @param strPoster
     * @param strStatus
     */
    public Event(String idEvent, Object idSoccerXML, String idAPIfootball, String strEvent, String strEventAlternate, String strFilename, String strSport, String idLeague, String strLeague, String strSeason, Object strDescriptionEN, String strHomeTeam, String strAwayTeam, Object intHomeScore, String intRound, Object intAwayScore, Object intSpectators, String strOfficial, Object strHomeGoalDetails, Object strHomeRedCards, Object strHomeYellowCards, Object strHomeLineupGoalkeeper, Object strHomeLineupDefense, Object strHomeLineupMidfield, Object strHomeLineupForward, Object strHomeLineupSubstitutes, Object strHomeFormation, Object strAwayRedCards, Object strAwayYellowCards, Object strAwayGoalDetails, Object strAwayLineupGoalkeeper, Object strAwayLineupDefense, Object strAwayLineupMidfield, Object strAwayLineupForward, Object strAwayLineupSubstitutes, Object strAwayFormation, Object intHomeShots, Object intAwayShots, String strTimestamp, String dateEvent, Object dateEventLocal, Object strDate, String strTime, Object strTimeLocal, Object strTVStation, String idHomeTeam, String idAwayTeam, Object strResult, String strVenue, String strCountry, Object strCity, Object strPoster, Object strFanart, String strThumb, Object strBanner, Object strMap, Object strTweet1, Object strTweet2, Object strTweet3, Object strVideo, String strStatus, String strPostponed, String strLocked) {
        super();
        this.idEvent = idEvent;
        this.idSoccerXML = idSoccerXML;
        this.idAPIfootball = idAPIfootball;
        this.strEvent = strEvent;
        this.strEventAlternate = strEventAlternate;
        this.strFilename = strFilename;
        this.strSport = strSport;
        this.idLeague = idLeague;
        this.strLeague = strLeague;
        this.strSeason = strSeason;
        this.strDescriptionEN = strDescriptionEN;
        this.strHomeTeam = strHomeTeam;
        this.strAwayTeam = strAwayTeam;
        this.intHomeScore = intHomeScore;
        this.intRound = intRound;
        this.intAwayScore = intAwayScore;
        this.intSpectators = intSpectators;
        this.strOfficial = strOfficial;
        this.strHomeGoalDetails = strHomeGoalDetails;
        this.strHomeRedCards = strHomeRedCards;
        this.strHomeYellowCards = strHomeYellowCards;
        this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
        this.strHomeLineupDefense = strHomeLineupDefense;
        this.strHomeLineupMidfield = strHomeLineupMidfield;
        this.strHomeLineupForward = strHomeLineupForward;
        this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
        this.strHomeFormation = strHomeFormation;
        this.strAwayRedCards = strAwayRedCards;
        this.strAwayYellowCards = strAwayYellowCards;
        this.strAwayGoalDetails = strAwayGoalDetails;
        this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
        this.strAwayLineupDefense = strAwayLineupDefense;
        this.strAwayLineupMidfield = strAwayLineupMidfield;
        this.strAwayLineupForward = strAwayLineupForward;
        this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
        this.strAwayFormation = strAwayFormation;
        this.intHomeShots = intHomeShots;
        this.intAwayShots = intAwayShots;
        this.strTimestamp = strTimestamp;
        this.dateEvent = dateEvent;
        this.dateEventLocal = dateEventLocal;
        this.strDate = strDate;
        this.strTime = strTime;
        this.strTimeLocal = strTimeLocal;
        this.strTVStation = strTVStation;
        this.idHomeTeam = idHomeTeam;
        this.idAwayTeam = idAwayTeam;
        this.strResult = strResult;
        this.strVenue = strVenue;
        this.strCountry = strCountry;
        this.strCity = strCity;
        this.strPoster = strPoster;
        this.strFanart = strFanart;
        this.strThumb = strThumb;
        this.strBanner = strBanner;
        this.strMap = strMap;
        this.strTweet1 = strTweet1;
        this.strTweet2 = strTweet2;
        this.strTweet3 = strTweet3;
        this.strVideo = strVideo;
        this.strStatus = strStatus;
        this.strPostponed = strPostponed;
        this.strLocked = strLocked;
    }

    public String getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    public Object getIdSoccerXML() {
        return idSoccerXML;
    }

    public void setIdSoccerXML(Object idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    public String getIdAPIfootball() {
        return idAPIfootball;
    }

    public void setIdAPIfootball(String idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    public String getStrEvent() {
        return strEvent;
    }

    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    public String getStrEventAlternate() {
        return strEventAlternate;
    }

    public void setStrEventAlternate(String strEventAlternate) {
        this.strEventAlternate = strEventAlternate;
    }

    public String getStrFilename() {
        return strFilename;
    }

    public void setStrFilename(String strFilename) {
        this.strFilename = strFilename;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getStrSeason() {
        return strSeason;
    }

    public void setStrSeason(String strSeason) {
        this.strSeason = strSeason;
    }

    public Object getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(Object strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrHomeTeam() {
        return strHomeTeam;
    }

    public void setStrHomeTeam(String strHomeTeam) {
        this.strHomeTeam = strHomeTeam;
    }

    public String getStrAwayTeam() {
        return strAwayTeam;
    }

    public void setStrAwayTeam(String strAwayTeam) {
        this.strAwayTeam = strAwayTeam;
    }

    public Object getIntHomeScore() {
        return intHomeScore;
    }

    public void setIntHomeScore(Object intHomeScore) {
        this.intHomeScore = intHomeScore;
    }

    public String getIntRound() {
        return intRound;
    }

    public void setIntRound(String intRound) {
        this.intRound = intRound;
    }

    public Object getIntAwayScore() {
        return intAwayScore;
    }

    public void setIntAwayScore(Object intAwayScore) {
        this.intAwayScore = intAwayScore;
    }

    public Object getIntSpectators() {
        return intSpectators;
    }

    public void setIntSpectators(Object intSpectators) {
        this.intSpectators = intSpectators;
    }

    public String getStrOfficial() {
        return strOfficial;
    }

    public void setStrOfficial(String strOfficial) {
        this.strOfficial = strOfficial;
    }

    public Object getStrHomeGoalDetails() {
        return strHomeGoalDetails;
    }

    public void setStrHomeGoalDetails(Object strHomeGoalDetails) {
        this.strHomeGoalDetails = strHomeGoalDetails;
    }

    public Object getStrHomeRedCards() {
        return strHomeRedCards;
    }

    public void setStrHomeRedCards(Object strHomeRedCards) {
        this.strHomeRedCards = strHomeRedCards;
    }

    public Object getStrHomeYellowCards() {
        return strHomeYellowCards;
    }

    public void setStrHomeYellowCards(Object strHomeYellowCards) {
        this.strHomeYellowCards = strHomeYellowCards;
    }

    public Object getStrHomeLineupGoalkeeper() {
        return strHomeLineupGoalkeeper;
    }

    public void setStrHomeLineupGoalkeeper(Object strHomeLineupGoalkeeper) {
        this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
    }

    public Object getStrHomeLineupDefense() {
        return strHomeLineupDefense;
    }

    public void setStrHomeLineupDefense(Object strHomeLineupDefense) {
        this.strHomeLineupDefense = strHomeLineupDefense;
    }

    public Object getStrHomeLineupMidfield() {
        return strHomeLineupMidfield;
    }

    public void setStrHomeLineupMidfield(Object strHomeLineupMidfield) {
        this.strHomeLineupMidfield = strHomeLineupMidfield;
    }

    public Object getStrHomeLineupForward() {
        return strHomeLineupForward;
    }

    public void setStrHomeLineupForward(Object strHomeLineupForward) {
        this.strHomeLineupForward = strHomeLineupForward;
    }

    public Object getStrHomeLineupSubstitutes() {
        return strHomeLineupSubstitutes;
    }

    public void setStrHomeLineupSubstitutes(Object strHomeLineupSubstitutes) {
        this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
    }

    public Object getStrHomeFormation() {
        return strHomeFormation;
    }

    public void setStrHomeFormation(Object strHomeFormation) {
        this.strHomeFormation = strHomeFormation;
    }

    public Object getStrAwayRedCards() {
        return strAwayRedCards;
    }

    public void setStrAwayRedCards(Object strAwayRedCards) {
        this.strAwayRedCards = strAwayRedCards;
    }

    public Object getStrAwayYellowCards() {
        return strAwayYellowCards;
    }

    public void setStrAwayYellowCards(Object strAwayYellowCards) {
        this.strAwayYellowCards = strAwayYellowCards;
    }

    public Object getStrAwayGoalDetails() {
        return strAwayGoalDetails;
    }

    public void setStrAwayGoalDetails(Object strAwayGoalDetails) {
        this.strAwayGoalDetails = strAwayGoalDetails;
    }

    public Object getStrAwayLineupGoalkeeper() {
        return strAwayLineupGoalkeeper;
    }

    public void setStrAwayLineupGoalkeeper(Object strAwayLineupGoalkeeper) {
        this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
    }

    public Object getStrAwayLineupDefense() {
        return strAwayLineupDefense;
    }

    public void setStrAwayLineupDefense(Object strAwayLineupDefense) {
        this.strAwayLineupDefense = strAwayLineupDefense;
    }

    public Object getStrAwayLineupMidfield() {
        return strAwayLineupMidfield;
    }

    public void setStrAwayLineupMidfield(Object strAwayLineupMidfield) {
        this.strAwayLineupMidfield = strAwayLineupMidfield;
    }

    public Object getStrAwayLineupForward() {
        return strAwayLineupForward;
    }

    public void setStrAwayLineupForward(Object strAwayLineupForward) {
        this.strAwayLineupForward = strAwayLineupForward;
    }

    public Object getStrAwayLineupSubstitutes() {
        return strAwayLineupSubstitutes;
    }

    public void setStrAwayLineupSubstitutes(Object strAwayLineupSubstitutes) {
        this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
    }

    public Object getStrAwayFormation() {
        return strAwayFormation;
    }

    public void setStrAwayFormation(Object strAwayFormation) {
        this.strAwayFormation = strAwayFormation;
    }

    public Object getIntHomeShots() {
        return intHomeShots;
    }

    public void setIntHomeShots(Object intHomeShots) {
        this.intHomeShots = intHomeShots;
    }

    public Object getIntAwayShots() {
        return intAwayShots;
    }

    public void setIntAwayShots(Object intAwayShots) {
        this.intAwayShots = intAwayShots;
    }

    public String getStrTimestamp() {
        return strTimestamp;
    }

    public void setStrTimestamp(String strTimestamp) {
        this.strTimestamp = strTimestamp;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Object getDateEventLocal() {
        return dateEventLocal;
    }

    public void setDateEventLocal(Object dateEventLocal) {
        this.dateEventLocal = dateEventLocal;
    }

    public Object getStrDate() {
        return strDate;
    }

    public void setStrDate(Object strDate) {
        this.strDate = strDate;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    public Object getStrTimeLocal() {
        return strTimeLocal;
    }

    public void setStrTimeLocal(Object strTimeLocal) {
        this.strTimeLocal = strTimeLocal;
    }

    public Object getStrTVStation() {
        return strTVStation;
    }

    public void setStrTVStation(Object strTVStation) {
        this.strTVStation = strTVStation;
    }

    public String getIdHomeTeam() {
        return idHomeTeam;
    }

    public void setIdHomeTeam(String idHomeTeam) {
        this.idHomeTeam = idHomeTeam;
    }

    public String getIdAwayTeam() {
        return idAwayTeam;
    }

    public void setIdAwayTeam(String idAwayTeam) {
        this.idAwayTeam = idAwayTeam;
    }

    public Object getStrResult() {
        return strResult;
    }

    public void setStrResult(Object strResult) {
        this.strResult = strResult;
    }

    public String getStrVenue() {
        return strVenue;
    }

    public void setStrVenue(String strVenue) {
        this.strVenue = strVenue;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public Object getStrCity() {
        return strCity;
    }

    public void setStrCity(Object strCity) {
        this.strCity = strCity;
    }

    public Object getStrPoster() {
        return strPoster;
    }

    public void setStrPoster(Object strPoster) {
        this.strPoster = strPoster;
    }

    public Object getStrFanart() {
        return strFanart;
    }

    public void setStrFanart(Object strFanart) {
        this.strFanart = strFanart;
    }

    public String getStrThumb() {
        return strThumb;
    }

    public void setStrThumb(String strThumb) {
        this.strThumb = strThumb;
    }

    public Object getStrBanner() {
        return strBanner;
    }

    public void setStrBanner(Object strBanner) {
        this.strBanner = strBanner;
    }

    public Object getStrMap() {
        return strMap;
    }

    public void setStrMap(Object strMap) {
        this.strMap = strMap;
    }

    public Object getStrTweet1() {
        return strTweet1;
    }

    public void setStrTweet1(Object strTweet1) {
        this.strTweet1 = strTweet1;
    }

    public Object getStrTweet2() {
        return strTweet2;
    }

    public void setStrTweet2(Object strTweet2) {
        this.strTweet2 = strTweet2;
    }

    public Object getStrTweet3() {
        return strTweet3;
    }

    public void setStrTweet3(Object strTweet3) {
        this.strTweet3 = strTweet3;
    }

    public Object getStrVideo() {
        return strVideo;
    }

    public void setStrVideo(Object strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String strStatus) {
        this.strStatus = strStatus;
    }

    public String getStrPostponed() {
        return strPostponed;
    }

    public void setStrPostponed(String strPostponed) {
        this.strPostponed = strPostponed;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }


}
