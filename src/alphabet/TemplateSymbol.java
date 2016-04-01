package alphabet;

/**
 * Represents "template symbol" for Markov Algorithms command
 */
public class TemplateSymbol {

    /**Alias of template symbol*/
    private char alias;
    /**Alphabet that includes this template symbol*/
    private Alphabet alphabet;
    /**Shows that template symbol means string from Alphabet*/
    private boolean isTemplateString;

    public TemplateSymbol(char alias, Alphabet alphabet, boolean isTemplateString) {
        this.alias = alias;
        this.alphabet = alphabet;
        this.isTemplateString = isTemplateString;
    }

    public TemplateSymbol(char alias, Alphabet alphabet) {
        this(alias, alphabet, false);
    }

    public char getAlias() {
        return alias;
    }

    public void setAlias(char alias) {
        this.alias = alias;
    }

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void setTemplateString(boolean flag) {
        isTemplateString = flag;
    }

    public boolean isTemplateString() {
        return isTemplateString;
    }

    @Override
    public String toString() {

        return "Alias: " + getAlias() + "\n" +
               "Alphabet: " + getAlphabet() + "\n" +
               "isTemplateString: " + isTemplateString() + "\n";
    }
}
