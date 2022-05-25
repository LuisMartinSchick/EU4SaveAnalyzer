package General;

import java.util.ArrayList;

/**
 * This class is used to represent each in-game country that is chosen. Only relevant data is stored
 */
public class Country {
    private String strTag;
    private String strName;
    private String strCapitalName;
    private int intTotalDev;
    private int intTechMil;
    private int intTechDiplo;
    private int intTechAdmin;
    private int intManpower;
    private int intGovRank;
    private int intMercantilism;
    private double douCash;
    private double douIncome;
    private double douExpenses;
    private double douInflation;
    private double douDebtAmount;
    private double douDebtCount;
    private double douProfessionalism;
    private ArrayList<Boolean> arlContinents = new ArrayList<>(); //https://eu4.paradoxwikis.com/Regions
    private ArrayList<Boolean> arlInstitutions = new ArrayList<>();
    private GovType govType;

}
