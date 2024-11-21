package software.ulpgc;

import java.io.IOException;
import java.util.List;
public interface PokemonLoader {
    List<Pokemon> load() throws IOException;
}
