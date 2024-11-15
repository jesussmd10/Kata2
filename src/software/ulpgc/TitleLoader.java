package software.ulpgc;

import java.io.IOException;
import java.util.List;

public interface TitleLoader {
    List<Pokemon> load() throws IOException;
}
