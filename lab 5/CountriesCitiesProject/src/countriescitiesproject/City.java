/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countriescitiesproject;

/**
 *
 * @author eng. mahmoud hassan
 */
public class City {
    
    private int id;
    private String name;
    private int population;
    private String countryCode;
    
    public City(){

    }
    
    public City(int i,String nam,int pop,String counCode){
        
        id = i;
        name = nam;
        population = pop;
        countryCode = counCode;
   
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
