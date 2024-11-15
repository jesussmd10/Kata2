package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Jesus Santacruz/Desktop/IS2/pokemon.csv");
        List<Pokemon> pokemons = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Map<String, Boolean> stats = new HashMap<>();
        System.out.println(pokemons);
    }
}
