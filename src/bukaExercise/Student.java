package bukaExercise;

/**
 * @author Chin
 * @description
 * @date 2023/9/24 4:51 下午
 **/
public class Student {
    private String name;
    private  int  ChineseScore;
    private int MathScore;
    private int EnglishScore;

    public Student(String name, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        ChineseScore = chineseScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        this.MathScore = mathScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.EnglishScore = englishScore;
    }
}
