public class CompetitionJudging {
    int[] judgescores = new int[5];

    CompetitionJudging(int[] scores){
        this.judgescores = scores;
    }

    public double calculateScore(){
        int maxi = 0;
        for (int i: judgescores){
            if(i>maxi){
                maxi = i;
            }
        }
        int mini = 6;
        for (int i: judgescores){
            if(i<mini){
                mini = i;
            }
        }

        int mean=0;
        int elements=0;
        for(int i: judgescores){
            if(i==maxi || i == mini){
                continue;
            } else {
                mean+=i;
                elements++;
            }
        }
        return mean/elements;
    }
}