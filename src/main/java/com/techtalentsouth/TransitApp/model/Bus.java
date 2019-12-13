package com.techtalentsouth.TransitApp.model;

public class Bus {
	public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;
    
    private Location getCoordinates(String description) {
        description = description.replace(" ", "+");
        String url = geocodingUrl + description + "+GA&key=" + googleApiKey;
        RestTemplate restTemplate = new RestTemplate();
        GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
        return response.results.get(0).geometry.location;
    }

}
