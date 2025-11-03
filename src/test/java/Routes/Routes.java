package Routes;

public class Routes {

    //baseurl
    public static String baseUrlQA = "https://qa-dashboard.cliquidator.info";

    //login
    public static String login = baseUrlQA + "/login";

    //assert promotion
    public static String getAllAssets = baseUrlQA + "/v1/crm/asset-promotion";
    public static String getDistricts = baseUrlQA + "/v1/districts";
    public static String getRegions = baseUrlQA + "/v1/regions";
    public static String getUpcomingAuctions = baseUrlQA + "/v2/leads/listall/upcomingauctions";
    public static String getEmployeeInfo = baseUrlQA + "/v1/employees/{employee_Id}";
    public static String postFilters = baseUrlQA + "/v1/inventory/filter";


}

