package ozzyProject.day3.task_Lambda;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange>inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(300).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());

        //OrangeFormater simpleFormatter= o-> System.out::println("orange test "+o.getWeight()+" "+o.getColor());
       //prettyPrintApple(inventory,simpleFormatter);
        //prettyPrintApple(inventory,orange->"An orange of "+orange.getWeight()+"g");

//        OrangeFormater fancyFormatter = orange -> {
//            String characteristic= orange.getWeight()>150 ? "Heavy" : "Light";
//            return "A "+characteristic+" "+orange.getColor()+ " orange";
//        };
        //prettyPrintApple(inventory, fancyFormatter);


    }

    private static void prettyPrintApple(List<Orange>inventory, OrangeFormater orangeFormater){
        for (Orange orange: inventory) {
            if(orange.getColor().equals(Color.GREEN)) {
                orangeFormater.accept(orange);
            }
        }

    }
}
