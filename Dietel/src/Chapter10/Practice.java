package Chapter10;

public abstract class Practice {
private int many;
private String words;
private String numbers;

public Practice(int many, String words, String numbers){
    this.many = many;
    this.numbers = numbers;
    this.words = words;
}

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", many, words, numbers);
    }
    public abstract void plenny();
}
