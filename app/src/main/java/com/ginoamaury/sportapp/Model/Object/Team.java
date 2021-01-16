package com.ginoamaury.sportapp.Model.Object;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Team implements Serializable
{

    @SerializedName("idTeam")
    @Expose
    private String idTeam;
    @SerializedName("idSoccerXML")
    @Expose
    private String idSoccerXML;
    @SerializedName("idAPIfootball")
    @Expose
    private String idAPIfootball;
    @SerializedName("intLoved")
    @Expose
    private Object intLoved;
    @SerializedName("strTeam")
    @Expose
    private String strTeam;
    @SerializedName("strTeamShort")
    @Expose
    private Object strTeamShort;
    @SerializedName("strAlternate")
    @Expose
    private String strAlternate;
    @SerializedName("intFormedYear")
    @Expose
    private String intFormedYear;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("idLeague")
    @Expose
    private String idLeague;
    @SerializedName("strLeague2")
    @Expose
    private String strLeague2;
    @SerializedName("idLeague2")
    @Expose
    private String idLeague2;
    @SerializedName("strLeague3")
    @Expose
    private String strLeague3;
    @SerializedName("idLeague3")
    @Expose
    private Object idLeague3;
    @SerializedName("strLeague4")
    @Expose
    private String strLeague4;
    @SerializedName("idLeague4")
    @Expose
    private Object idLeague4;
    @SerializedName("strLeague5")
    @Expose
    private String strLeague5;
    @SerializedName("idLeague5")
    @Expose
    private Object idLeague5;
    @SerializedName("strLeague6")
    @Expose
    private Object strLeague6;
    @SerializedName("idLeague6")
    @Expose
    private Object idLeague6;
    @SerializedName("strLeague7")
    @Expose
    private Object strLeague7;
    @SerializedName("idLeague7")
    @Expose
    private Object idLeague7;
    @SerializedName("strDivision")
    @Expose
    private Object strDivision;
    @SerializedName("strManager")
    @Expose
    private String strManager;
    @SerializedName("strStadium")
    @Expose
    private String strStadium;
    @SerializedName("strKeywords")
    @Expose
    private String strKeywords;
    @SerializedName("strRSS")
    @Expose
    private String strRSS;
    @SerializedName("strStadiumThumb")
    @Expose
    private String strStadiumThumb;
    @SerializedName("strStadiumDescription")
    @Expose
    private String strStadiumDescription;
    @SerializedName("strStadiumLocation")
    @Expose
    private String strStadiumLocation;
    @SerializedName("intStadiumCapacity")
    @Expose
    private String intStadiumCapacity;
    @SerializedName("strWebsite")
    @Expose
    private String strWebsite;
    @SerializedName("strFacebook")
    @Expose
    private String strFacebook;
    @SerializedName("strTwitter")
    @Expose
    private String strTwitter;
    @SerializedName("strInstagram")
    @Expose
    private String strInstagram;
    @SerializedName("strDescriptionEN")
    @Expose
    private String strDescriptionEN;
    @SerializedName("strDescriptionDE")
    @Expose
    private Object strDescriptionDE;
    @SerializedName("strDescriptionFR")
    @Expose
    private Object strDescriptionFR;
    @SerializedName("strDescriptionCN")
    @Expose
    private Object strDescriptionCN;
    @SerializedName("strDescriptionIT")
    @Expose
    private Object strDescriptionIT;
    @SerializedName("strDescriptionJP")
    @Expose
    private Object strDescriptionJP;
    @SerializedName("strDescriptionRU")
    @Expose
    private Object strDescriptionRU;
    @SerializedName("strDescriptionES")
    @Expose
    private String strDescriptionES;
    @SerializedName("strDescriptionPT")
    @Expose
    private Object strDescriptionPT;
    @SerializedName("strDescriptionSE")
    @Expose
    private Object strDescriptionSE;
    @SerializedName("strDescriptionNL")
    @Expose
    private Object strDescriptionNL;
    @SerializedName("strDescriptionHU")
    @Expose
    private Object strDescriptionHU;
    @SerializedName("strDescriptionNO")
    @Expose
    private Object strDescriptionNO;
    @SerializedName("strDescriptionIL")
    @Expose
    private Object strDescriptionIL;
    @SerializedName("strDescriptionPL")
    @Expose
    private Object strDescriptionPL;
    @SerializedName("strGender")
    @Expose
    private String strGender;
    @SerializedName("strCountry")
    @Expose
    private String strCountry;
    @SerializedName("strTeamBadge")
    @Expose
    private String strTeamBadge;
    @SerializedName("strTeamJersey")
    @Expose
    private String strTeamJersey;
    @SerializedName("strTeamLogo")
    @Expose
    private String strTeamLogo;
    @SerializedName("strTeamFanart1")
    @Expose
    private String strTeamFanart1;
    @SerializedName("strTeamFanart2")
    @Expose
    private String strTeamFanart2;
    @SerializedName("strTeamFanart3")
    @Expose
    private String strTeamFanart3;
    @SerializedName("strTeamFanart4")
    @Expose
    private String strTeamFanart4;
    @SerializedName("strTeamBanner")
    @Expose
    private String strTeamBanner;
    @SerializedName("strYoutube")
    @Expose
    private String strYoutube;
    @SerializedName("strLocked")
    @Expose
    private String strLocked;
    private final static long serialVersionUID = -904584439615361307L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Team() {
    }

    /**
     *
     * @param intStadiumCapacity
     * @param strTeamShort
     * @param idLeague3
     * @param idLeague2
     * @param idLeague5
     * @param strSport
     * @param idLeague4
     * @param idLeague7
     * @param strDescriptionCN
     * @param idLeague6
     * @param strTeamJersey
     * @param strTeamFanart2
     * @param strTeamFanart3
     * @param strTeamFanart4
     * @param strStadiumDescription
     * @param strTeamFanart1
     * @param intLoved
     * @param idLeague
     * @param idSoccerXML
     * @param strTeamLogo
     * @param strDescriptionSE
     * @param strDescriptionJP
     * @param strDescriptionFR
     * @param strStadiumLocation
     * @param strDescriptionNL
     * @param strCountry
     * @param strRSS
     * @param strDescriptionRU
     * @param strTeamBanner
     * @param strDescriptionNO
     * @param strStadiumThumb
     * @param strDescriptionES
     * @param intFormedYear
     * @param strInstagram
     * @param strDescriptionIT
     * @param idTeam
     * @param strDescriptionEN
     * @param strWebsite
     * @param strYoutube
     * @param strDescriptionIL
     * @param idAPIfootball
     * @param strLocked
     * @param strAlternate
     * @param strTeam
     * @param strTwitter
     * @param strDescriptionHU
     * @param strGender
     * @param strDivision
     * @param strStadium
     * @param strFacebook
     * @param strTeamBadge
     * @param strLeague2
     * @param strLeague3
     * @param strLeague4
     * @param strLeague5
     * @param strDescriptionPT
     * @param strLeague6
     * @param strDescriptionDE
     * @param strLeague7
     * @param strLeague
     * @param strManager
     * @param strKeywords
     * @param strDescriptionPL
     */
    public Team(String idTeam, String idSoccerXML, String idAPIfootball, Object intLoved, String strTeam, Object strTeamShort, String strAlternate, String intFormedYear, String strSport, String strLeague, String idLeague, String strLeague2, String idLeague2, String strLeague3, Object idLeague3, String strLeague4, Object idLeague4, String strLeague5, Object idLeague5, Object strLeague6, Object idLeague6, Object strLeague7, Object idLeague7, Object strDivision, String strManager, String strStadium, String strKeywords, String strRSS, String strStadiumThumb, String strStadiumDescription, String strStadiumLocation, String intStadiumCapacity, String strWebsite, String strFacebook, String strTwitter, String strInstagram, String strDescriptionEN, Object strDescriptionDE, Object strDescriptionFR, Object strDescriptionCN, Object strDescriptionIT, Object strDescriptionJP, Object strDescriptionRU, String strDescriptionES, Object strDescriptionPT, Object strDescriptionSE, Object strDescriptionNL, Object strDescriptionHU, Object strDescriptionNO, Object strDescriptionIL, Object strDescriptionPL, String strGender, String strCountry, String strTeamBadge, String strTeamJersey, String strTeamLogo, String strTeamFanart1, String strTeamFanart2, String strTeamFanart3, String strTeamFanart4, String strTeamBanner, String strYoutube, String strLocked) {
        super();
        this.idTeam = idTeam;
        this.idSoccerXML = idSoccerXML;
        this.idAPIfootball = idAPIfootball;
        this.intLoved = intLoved;
        this.strTeam = strTeam;
        this.strTeamShort = strTeamShort;
        this.strAlternate = strAlternate;
        this.intFormedYear = intFormedYear;
        this.strSport = strSport;
        this.strLeague = strLeague;
        this.idLeague = idLeague;
        this.strLeague2 = strLeague2;
        this.idLeague2 = idLeague2;
        this.strLeague3 = strLeague3;
        this.idLeague3 = idLeague3;
        this.strLeague4 = strLeague4;
        this.idLeague4 = idLeague4;
        this.strLeague5 = strLeague5;
        this.idLeague5 = idLeague5;
        this.strLeague6 = strLeague6;
        this.idLeague6 = idLeague6;
        this.strLeague7 = strLeague7;
        this.idLeague7 = idLeague7;
        this.strDivision = strDivision;
        this.strManager = strManager;
        this.strStadium = strStadium;
        this.strKeywords = strKeywords;
        this.strRSS = strRSS;
        this.strStadiumThumb = strStadiumThumb;
        this.strStadiumDescription = strStadiumDescription;
        this.strStadiumLocation = strStadiumLocation;
        this.intStadiumCapacity = intStadiumCapacity;
        this.strWebsite = strWebsite;
        this.strFacebook = strFacebook;
        this.strTwitter = strTwitter;
        this.strInstagram = strInstagram;
        this.strDescriptionEN = strDescriptionEN;
        this.strDescriptionDE = strDescriptionDE;
        this.strDescriptionFR = strDescriptionFR;
        this.strDescriptionCN = strDescriptionCN;
        this.strDescriptionIT = strDescriptionIT;
        this.strDescriptionJP = strDescriptionJP;
        this.strDescriptionRU = strDescriptionRU;
        this.strDescriptionES = strDescriptionES;
        this.strDescriptionPT = strDescriptionPT;
        this.strDescriptionSE = strDescriptionSE;
        this.strDescriptionNL = strDescriptionNL;
        this.strDescriptionHU = strDescriptionHU;
        this.strDescriptionNO = strDescriptionNO;
        this.strDescriptionIL = strDescriptionIL;
        this.strDescriptionPL = strDescriptionPL;
        this.strGender = strGender;
        this.strCountry = strCountry;
        this.strTeamBadge = strTeamBadge;
        this.strTeamJersey = strTeamJersey;
        this.strTeamLogo = strTeamLogo;
        this.strTeamFanart1 = strTeamFanart1;
        this.strTeamFanart2 = strTeamFanart2;
        this.strTeamFanart3 = strTeamFanart3;
        this.strTeamFanart4 = strTeamFanart4;
        this.strTeamBanner = strTeamBanner;
        this.strYoutube = strYoutube;
        this.strLocked = strLocked;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    public void setIdSoccerXML(String idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    public String getIdAPIfootball() {
        return idAPIfootball;
    }

    public void setIdAPIfootball(String idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    public Object getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(Object intLoved) {
        this.intLoved = intLoved;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public Object getStrTeamShort() {
        return strTeamShort;
    }

    public void setStrTeamShort(Object strTeamShort) {
        this.strTeamShort = strTeamShort;
    }

    public String getStrAlternate() {
        return strAlternate;
    }

    public void setStrAlternate(String strAlternate) {
        this.strAlternate = strAlternate;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public String getStrLeague2() {
        return strLeague2;
    }

    public void setStrLeague2(String strLeague2) {
        this.strLeague2 = strLeague2;
    }

    public String getIdLeague2() {
        return idLeague2;
    }

    public void setIdLeague2(String idLeague2) {
        this.idLeague2 = idLeague2;
    }

    public String getStrLeague3() {
        return strLeague3;
    }

    public void setStrLeague3(String strLeague3) {
        this.strLeague3 = strLeague3;
    }

    public Object getIdLeague3() {
        return idLeague3;
    }

    public void setIdLeague3(Object idLeague3) {
        this.idLeague3 = idLeague3;
    }

    public String getStrLeague4() {
        return strLeague4;
    }

    public void setStrLeague4(String strLeague4) {
        this.strLeague4 = strLeague4;
    }

    public Object getIdLeague4() {
        return idLeague4;
    }

    public void setIdLeague4(Object idLeague4) {
        this.idLeague4 = idLeague4;
    }

    public String getStrLeague5() {
        return strLeague5;
    }

    public void setStrLeague5(String strLeague5) {
        this.strLeague5 = strLeague5;
    }

    public Object getIdLeague5() {
        return idLeague5;
    }

    public void setIdLeague5(Object idLeague5) {
        this.idLeague5 = idLeague5;
    }

    public Object getStrLeague6() {
        return strLeague6;
    }

    public void setStrLeague6(Object strLeague6) {
        this.strLeague6 = strLeague6;
    }

    public Object getIdLeague6() {
        return idLeague6;
    }

    public void setIdLeague6(Object idLeague6) {
        this.idLeague6 = idLeague6;
    }

    public Object getStrLeague7() {
        return strLeague7;
    }

    public void setStrLeague7(Object strLeague7) {
        this.strLeague7 = strLeague7;
    }

    public Object getIdLeague7() {
        return idLeague7;
    }

    public void setIdLeague7(Object idLeague7) {
        this.idLeague7 = idLeague7;
    }

    public Object getStrDivision() {
        return strDivision;
    }

    public void setStrDivision(Object strDivision) {
        this.strDivision = strDivision;
    }

    public String getStrManager() {
        return strManager;
    }

    public void setStrManager(String strManager) {
        this.strManager = strManager;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    public String getStrKeywords() {
        return strKeywords;
    }

    public void setStrKeywords(String strKeywords) {
        this.strKeywords = strKeywords;
    }

    public String getStrRSS() {
        return strRSS;
    }

    public void setStrRSS(String strRSS) {
        this.strRSS = strRSS;
    }

    public String getStrStadiumThumb() {
        return strStadiumThumb;
    }

    public void setStrStadiumThumb(String strStadiumThumb) {
        this.strStadiumThumb = strStadiumThumb;
    }

    public String getStrStadiumDescription() {
        return strStadiumDescription;
    }

    public void setStrStadiumDescription(String strStadiumDescription) {
        this.strStadiumDescription = strStadiumDescription;
    }

    public String getStrStadiumLocation() {
        return strStadiumLocation;
    }

    public void setStrStadiumLocation(String strStadiumLocation) {
        this.strStadiumLocation = strStadiumLocation;
    }

    public String getIntStadiumCapacity() {
        return intStadiumCapacity;
    }

    public void setIntStadiumCapacity(String intStadiumCapacity) {
        this.intStadiumCapacity = intStadiumCapacity;
    }

    public String getStrWebsite() {
        return strWebsite;
    }

    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    public String getStrFacebook() {
        return strFacebook;
    }

    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    public String getStrTwitter() {
        return strTwitter;
    }

    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    public String getStrInstagram() {
        return strInstagram;
    }

    public void setStrInstagram(String strInstagram) {
        this.strInstagram = strInstagram;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public Object getStrDescriptionDE() {
        return strDescriptionDE;
    }

    public void setStrDescriptionDE(Object strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    public Object getStrDescriptionFR() {
        return strDescriptionFR;
    }

    public void setStrDescriptionFR(Object strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    public Object getStrDescriptionIT() {
        return strDescriptionIT;
    }

    public void setStrDescriptionIT(Object strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    public Object getStrDescriptionJP() {
        return strDescriptionJP;
    }

    public void setStrDescriptionJP(Object strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    public Object getStrDescriptionRU() {
        return strDescriptionRU;
    }

    public void setStrDescriptionRU(Object strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    public String getStrDescriptionES() {
        return strDescriptionES;
    }

    public void setStrDescriptionES(String strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    public Object getStrDescriptionPT() {
        return strDescriptionPT;
    }

    public void setStrDescriptionPT(Object strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    public Object getStrDescriptionSE() {
        return strDescriptionSE;
    }

    public void setStrDescriptionSE(Object strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    public Object getStrDescriptionNL() {
        return strDescriptionNL;
    }

    public void setStrDescriptionNL(Object strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    public Object getStrDescriptionHU() {
        return strDescriptionHU;
    }

    public void setStrDescriptionHU(Object strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    public Object getStrDescriptionNO() {
        return strDescriptionNO;
    }

    public void setStrDescriptionNO(Object strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    public String getStrGender() {
        return strGender;
    }

    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    public String getStrTeamJersey() {
        return strTeamJersey;
    }

    public void setStrTeamJersey(String strTeamJersey) {
        this.strTeamJersey = strTeamJersey;
    }

    public String getStrTeamLogo() {
        return strTeamLogo;
    }

    public void setStrTeamLogo(String strTeamLogo) {
        this.strTeamLogo = strTeamLogo;
    }

    public String getStrTeamFanart1() {
        return strTeamFanart1;
    }

    public void setStrTeamFanart1(String strTeamFanart1) {
        this.strTeamFanart1 = strTeamFanart1;
    }

    public String getStrTeamFanart2() {
        return strTeamFanart2;
    }

    public void setStrTeamFanart2(String strTeamFanart2) {
        this.strTeamFanart2 = strTeamFanart2;
    }

    public String getStrTeamFanart3() {
        return strTeamFanart3;
    }

    public void setStrTeamFanart3(String strTeamFanart3) {
        this.strTeamFanart3 = strTeamFanart3;
    }

    public String getStrTeamFanart4() {
        return strTeamFanart4;
    }

    public void setStrTeamFanart4(String strTeamFanart4) {
        this.strTeamFanart4 = strTeamFanart4;
    }

    public String getStrTeamBanner() {
        return strTeamBanner;
    }

    public void setStrTeamBanner(String strTeamBanner) {
        this.strTeamBanner = strTeamBanner;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }


}