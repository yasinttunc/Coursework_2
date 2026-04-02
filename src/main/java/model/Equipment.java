package model;

public class Equipment extends Resource {
    
    // Constructor
    public Equipment(String resourceId, String resourceName) {
        super(resourceId, resourceName, ResourceType.AV_EQUIPMENT);
    }
}
