package Backend;

import java.util.Map;

public class Profile {
    private String first_name;
    private String last_name;
    private String email;
    private Map<String, String> skills; // Map of interest name to interest description
    private Map<Position, Integer> positionRating; // Map of Position to skill level (1-10)

    public Profile(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.skills = new java.util.HashMap<>();
        this.positionRating = new java.util.HashMap<>();
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getSkills() {
        return skills;
    }

    public void addSkill(String skill, String description) {
        skills.put(skill, description);
    }

    public void populatePositionRatings() {
        positionRating.put(Setter.getInstance(), 0);
        positionRating.put(Libero.getInstance(), 0);
        positionRating.put(MiddleBlocker.getInstance(), 0);
        positionRating.put(OutsideHitter.getInstance(), 0);
        positionRating.put(OppositeHitter.getInstance(), 0);
    }
}