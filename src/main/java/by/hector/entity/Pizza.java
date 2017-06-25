package by.hector.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author i.sukach
 */
@Data
public class Pizza {

    private String name;
    private boolean thickDough;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Cuisine cuisine;
}
