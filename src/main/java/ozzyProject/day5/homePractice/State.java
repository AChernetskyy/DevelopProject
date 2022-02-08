package ozzyProject.day5.homePractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
    private String state;
    private List<String>cities;
    private int statePopulation;

}
