package software.ulpgc;

public class Pokemon {
    private final String pokemon;
    private final String type;
    private final String type2;
    private final int generationPokemon;

    public Pokemon(String pokemon, String type, String type2, int generationPokemon) {
        this.pokemon = pokemon;
        this.type = type;
        this.type2 = type2;
        this.generationPokemon = generationPokemon;
    }

    public String getPokemon() {
        return pokemon;
    }

    public String getType() {
        return type;
    }

    public String getType2() {
        return type2;
    }

    public int getGenerationPokemon() {
        return generationPokemon;
    }

    @Override
    public String toString() {
        return "pokemon='" + pokemon + '\'' +
                ", type=" + type +
                ", type2=" + type2 +
                ", generation=" + generationPokemon;
    }
}
