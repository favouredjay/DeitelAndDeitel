package ourDiary;

import java.util.ArrayList;

public class Diary {
    ArrayList<Entry> entries = new ArrayList<>();
    public void addEntry(String entryBody) {
//        Entry entry = new Entry(entryBody);
        entries.add(new Entry(entryBody));
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }
}
