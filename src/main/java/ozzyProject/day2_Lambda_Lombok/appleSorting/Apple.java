package ozzyProject.day2_Lambda_Lombok.appleSorting;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Apple {
    public Apple(int weight, Color color){
        this.color=color;
        this.weight=weight;
    }

    private Color color;
    private int weight;
}
