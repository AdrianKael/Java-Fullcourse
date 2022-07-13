package Abstract;

public class Principal {
    public static void main(String[] args) {
        Plant plant=new Plant();
        Carnivorous carnivorous=new Carnivorous();

        plant.feed();
        carnivorous.feed();
    }
}
