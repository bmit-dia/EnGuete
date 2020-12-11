package ch.espas.enguete;

public class Recipe {
    long id;
    String cookTime;
    String description;
    String[] ingredients;
    String[] instructions;

    public void recipes(){

    }

    // ID Access
    // Getter
    public long getId() {
        return id;
    }

    // Setter
    public void setId(long id1) {
        this.id = id1;
    }

    // CookTime
    // Getter
    public String getCookTime() {
        return cookTime;
    }

    // Setter
    public void setCookTime(String ct) {
        this.cookTime = ct;
    }

    // Description
    // Getter
    public String getDescription() {
        return description;
    }

    // Setter
    public void setDescription(String desc) {
        this.description = desc;
    }

    // Ingredients
    // Getter
    public String[] getIngredients() {
        return ingredients;
    }

    // Setter
    public void setIngredients(String[] food) {
        this.ingredients = food;
    }

    // Instructions
    // Getter
    public String[] getInstructions() {
        return instructions;
    }

    // Setter
    public void setInstructions(String[] tutorial) {
        this.instructions = tutorial;
    }
}
