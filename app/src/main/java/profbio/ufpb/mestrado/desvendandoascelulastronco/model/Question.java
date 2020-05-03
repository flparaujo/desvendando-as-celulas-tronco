package profbio.ufpb.mestrado.desvendandoascelulastronco.model;

public class Question {

    private int id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String keyword;
    private int correctId;

    public Question(int id, String question, String answer1, String answer2, String answer3, String keyword, int correctId) {
        this.id = id;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.keyword = keyword;
        this.correctId = correctId;
    }


    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getKeyword() { return keyword; }

    public int getCorrectId() {
        return correctId;
    }
}
