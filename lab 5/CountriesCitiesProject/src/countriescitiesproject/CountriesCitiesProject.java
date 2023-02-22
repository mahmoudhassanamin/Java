/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countriescitiesproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;




/**
 *
 * @author eng. mahmoud hassan
 */
public class CountriesCitiesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File countryFile = new File("Countries.csv");
        File cityFile = new File("Cities.csv");
        List<Country> countries = new ArrayList<>();
        List<City> cities = new ArrayList<>();
        try {
            Scanner reader = new Scanner(countryFile);
            String [] line;
            while(reader.hasNext()){
                line = reader.nextLine().split(",");
                countries.add(new Country(line[0],line[1],line[2],Double.parseDouble(line[3]),Integer.parseInt(line[4]),Double.parseDouble(line[5]),Integer.parseInt(line[6])));
            }
            reader = new Scanner(cityFile);
            while(reader.hasNext()){
                line = reader.nextLine().split(",");
                cities.add(new City(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2]),line[3]));
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
///////////////////////////////  task 1 : highest city in country  /////////////////
        for(Country c : countries){
            
            City highPop = cities.stream()
            .filter((elem)-> elem.getCountryCode().equals(c.getCode()))
            .reduce(null,(pre,elem)->{
                if(pre == null){
                    pre=elem;
                }
                if(elem.getPopulation() > pre.getPopulation()){
                    return elem;
                }
                else{
                    return pre;
                }
                    });
                try{
                    System.out.println(highPop.getName() + " in "+ c.getName() + " is hightest of population about " + highPop.getPopulation() );
                }catch(NullPointerException e){
                    System.out.println("null");
                }
        }
        

//////////////////////////////  task 2 : highest city in continent  /////////////////
        countries.stream().map(elem->elem.getContinent()).distinct().forEach((continent)->{
            List<City> cityArray = new ArrayList<>();
            countries.stream().filter(elem->elem.getContinent().equals(continent)).forEach((countryElem)->{
                cityArray.add(cities.stream().filter(elem->elem.getCountryCode().equals(countryElem.getCode()))
                .reduce(null,(pre,elem)->{
                    if(pre == null){
                        pre=elem;
                    }
                    if(elem.getPopulation() > pre.getPopulation()){
                        return elem;
                    }
                    else{
                        return pre;
                    }
                
                }));
                
            });
            
            City arrayOfhighCities = cityArray.stream().reduce(null,(pre,elem)->{
                    if(pre == null){
                        pre=elem;
                    }
                    
                    if(elem != null && elem.getPopulation() > pre.getPopulation()){
                        return elem;
                    }
                    else{
                        return pre;
                    }
                
                });
            
                try{
                    System.out.println("the highest city in " + continent + " is " + arrayOfhighCities.getName() + " about " + arrayOfhighCities.getPopulation());
                }catch(NullPointerException e){
                    System.out.println("null");
                }  
        });
        
//////////////////////////////  task 3 : highest capital of population  /////////////////
        List<City> arrList = new ArrayList<>();
        countries.stream().forEach((countryObject)->{
            cities.stream().forEach((elem)->{
               if(elem.getId() == countryObject.getCapital()){
                   arrList.add(elem);
               } 
            });
        });
        
        City hightCapital = arrList.stream().reduce(null,(pre,elem)->{
                                if(pre == null){
                                    pre=elem;
                                }

                                if(elem != null && elem.getPopulation() > pre.getPopulation()){
                                    return elem;
                                }
                                else{
                                    return pre;
                                }
                            });
        
        System.out.println("the highest capital is " + hightCapital.getName() + " its population about " + hightCapital.getPopulation());
        
    }
    
}
