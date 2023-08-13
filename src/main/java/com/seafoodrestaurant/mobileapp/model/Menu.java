```java
package com.seafoodrestaurant.mobileapp.model;

import java.util.List;

public class Menu {

    private List<Dish> dishes;

    public Menu(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public static class Dish {
        private String name;
        private String description;
        private double price;
        private String image;
        private boolean isVegetarian;
        private boolean isGlutenFree;

        public Dish(String name, String description, double price, String image, boolean isVegetarian, boolean isGlutenFree) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.image = image;
            this.isVegetarian = isVegetarian;
            this.isGlutenFree = isGlutenFree;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public boolean isVegetarian() {
            return isVegetarian;
        }

        public void setVegetarian(boolean vegetarian) {
            isVegetarian = vegetarian;
        }

        public boolean isGlutenFree() {
            return isGlutenFree;
        }

        public void setGlutenFree(boolean glutenFree) {
            isGlutenFree = glutenFree;
        }
    }
}
```