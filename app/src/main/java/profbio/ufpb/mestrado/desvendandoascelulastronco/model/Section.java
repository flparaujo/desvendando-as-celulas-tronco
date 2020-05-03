package profbio.ufpb.mestrado.desvendandoascelulastronco.model;

import android.text.Spanned;

public class Section {

    private String title;
    private Spanned content;

    public Section(String title, Spanned content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public Spanned getContent() {
        return content;
    }
}
