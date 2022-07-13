package Abstract;

public class Plant extends LivingBeing{
    @Override // can be put but will not affect if it's not there
    public void feed() {
        System.out.println("Plants feed by photosynthesis");
    }
}
