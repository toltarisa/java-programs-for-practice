package Codewars;

public class CodeWarsRankingSystem {

    private Integer rank;
    private Integer progress;

    public CodeWarsRankingSystem() {
        this.rank = -8;
        this.progress = 0;
    }

    public Integer getFormulaResult(Integer difference) {
        return 10 * (difference) * (difference);
    }

    public void incProgress(Integer givenRank) {

        if(givenRank < -8 ||givenRank.equals(0) || givenRank > 8)
            throw new IllegalArgumentException("You're not in the givenRank range, givenRank must be between -8 and 8");

        Integer difference= (this.rank) - (givenRank);
        Integer currentProgress = getFormulaResult(difference);
        this.progress += currentProgress;

        if(this.progress.equals(100)) {
            this.rank += 1;
            this.progress = 0;
        }

        while(this.progress > 100) {
            int remaining = this.progress - 100;

            if(this.rank.equals(-1))
                this.rank = 1;

            if(this.rank >= 8) {
                this.progress = 0;
                break;
            }

            this.rank += 1;
            this.progress = remaining;
        }
    }

    public static void main(String[] args) {
        CodeWarsRankingSystem codeWarsRankingSystem = new CodeWarsRankingSystem();
        System.out.println(codeWarsRankingSystem.rank); // => -8
        System.out.println(codeWarsRankingSystem.progress);; // => 0
        codeWarsRankingSystem.incProgress(-7);
        System.out.println(codeWarsRankingSystem.progress);; // => 10
        codeWarsRankingSystem.incProgress(-5); // will add 90 progress
        System.out.println(codeWarsRankingSystem.progress);; // => 0 // progress is now zero
        System.out.println(codeWarsRankingSystem.rank);

    }
}
