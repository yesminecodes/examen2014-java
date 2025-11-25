public class ConditionAge implements ConditionAccess{
    private int AgeMin;
    public ConditionAge(int ageMin){
        AgeMin = ageMin;
    }
    @Override
    public boolean accessPossible(Personne p) {
        return p.getAge() > AgeMin;
    }

}
