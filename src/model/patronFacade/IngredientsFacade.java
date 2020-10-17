/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patronFacade;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author programador
 */
public class IngredientsFacade {
    
    private Foods foods;
    private Poisons poisons;

    public IngredientsFacade(int cantFoods, int cantPoisons) {
        this.foods =  new Foods(cantFoods);
        this.poisons = new Poisons(cantPoisons);
    }
    
    public void callOnce() {
        this.foods.callOnce();
    }
    
    public void randomFoodColorInitializer(){
        this.foods.randomFoodColorInitializer();
    }
    
    public void drawFood(Graphics2D g2) {
        this.foods.drawFood(g2);
    }
    
    public void initializeFoods() {
        this.foods.initializeFoods();
    }
    
    public Ellipse2D.Double[] getFoods(){
        return this.foods.getFoods();
    }
    
    public void setFoods(Ellipse2D.Double[] foods){
        this.foods.setFoods(foods);
    }
    
    public Color[] getFoodColors(){
        return this.foods.getFoodColors();
    }
    
    public void setFoodColors(Color[] foodColors){
        this.foods.setFoodColors(foodColors);
    }
    
    public void drawPoisons(Graphics2D g2){
        this.poisons.drawPoisons(g2);
    }
    
    public void initializePoisons(){
        this.poisons.initializePoisons();
    }
    
    public Ellipse2D.Double[] getPoisons(){
        return this.poisons.getPoisons();
    }
    
    public void setPoisons(Ellipse2D.Double[] poisons){
        this.poisons.setPoisons(poisons);
    }
    
    public Color getColor(){
        return this.poisons.getColor();
    }
    
    public void setColor(Color color){
        this.poisons.setColor(color);
    }
    
    
    
    
}
