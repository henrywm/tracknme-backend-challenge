package util;

public class Constants {
    public final static String DATABASE_NAME = "Tracknme";
    public final static String LOCATIONS_COLLECTION_NAME = "Locations";
    public final static String TRACKER_COLLECTION_NAME = "Tracker";
    public final static String MONGO_CLIENT_URI = "mongodb+srv://admin:admin@maincluster-v4ypi.mongodb.net/test?retryWrites=true";

    /* LOCATION FIELDS NAME */
    public final static String FIELD_ID = "id";
    public final static String FIELD_DATE_TIME = "dateTime";
    public final static String FIELD_TRACKER_ID = "trackerId";
    public final static String FIELD_LATITUDE = "latitude";
    public final static String FIELD_LONGITUDE = "longitude";

    public final static int MIN_DISTANCE_BETWEEN_LOCATIONS = 10;

}
