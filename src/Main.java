public class Main {

    public static void main(String[] args) {

        FirePokemon charmander = new FirePokemon("Charmander", 100, 1, 0, 10, 5, 10, 5);

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 100, 1, 0, 10, 5, 10, 5);

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 100, 1, 0, 10, 5, 10, 5);

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 100, 1, 0, 10, 5, 10, 5);


        charmander.fireBlast(squirtle);

        pikachu.speak();

        pikachu.thunderShock(charmander);

        bulbasaur.attack(pikachu);







    }
}
