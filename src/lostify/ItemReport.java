package lostify;

public abstract class ItemReport {
    private final String id, name, category, colour, location, date, description;

    public ItemReport(String id, String name, String category, String colour,
                      String location, String date, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.colour = colour;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    public abstract String getReportType();

    public void displayDetails() {
        System.out.println("\n[" + getReportType() + "] " + id + " | " + name);
        System.out.println("Category: " + category + " | Colour: " + colour);
        System.out.println("Location: " + location + " | Date: " + date);
        System.out.println("Description: " + description);
    }

    public String toStorageLine() {
        return String.join("|", getReportType(), id, name, category, colour, location, date, description);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getColour() { return colour; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getDescription() { return description; }
}
