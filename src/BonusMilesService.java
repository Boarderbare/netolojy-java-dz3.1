public class BonusMilesService {
    public int calculate(int cost){
        int bonusAmount = 20;
        int bonus = cost / bonusAmount;
        return bonus;
    }
}
