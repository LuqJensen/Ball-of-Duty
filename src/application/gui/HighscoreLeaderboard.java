package application.gui;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class HighscoreLeaderboard extends ListView<HighscoreLeaderboard.Entry>
{
    private ObservableList<Entry> entries;
    private Map<Integer, Entry> addedEntries;

    private Queue<Entry> removeQueue;
    private Queue<Entry> addQueue;
    public static final int SCORE_LIMIT = 100;

    public class Entry
    {
        public String nickName;
        public double score;
        public int id;
        public int position;

        public Entry(String name, int id, double score)
        {
            this.nickName = name;
            this.id = id;
            this.score = score;
        }

        @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + id;
            result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
            long temp;
            temp = Double.doubleToLongBits(score);
            result = prime * result + (int)(temp ^ (temp >>> 32));
            return result;
        }

        public String toString()
        {
            String startText = String.format("#%s: %s [%s]", position, nickName, id);
            return String.format("%s     | Score: %s", startText, score);
        }

        private HighscoreLeaderboard getOuterType()
        {
            return HighscoreLeaderboard.this;
        }
    }

    public HighscoreLeaderboard()
    {
        removeQueue = new ConcurrentLinkedQueue<>();
        addQueue = new ConcurrentLinkedQueue<>();
        entries = FXCollections.observableArrayList();
        addedEntries = new HashMap<>();
        setItems(entries);
        setStyle("-fx-font: 20 arial; ");
    }

    public void refresh()
    {

        while (addQueue.peek() != null)
        {
            entries.add(addQueue.poll());

        }
        while (removeQueue.peek() != null)
        {
            entries.remove(removeQueue.poll());

        }
        entries.sort((c1, c2) -> Double.compare(c2.score, c1.score));
        for (int i = 0; i < entries.size(); i++)
        {
            entries.get(i).position = i + 1;
        }
    }

    public void addEntry(String nickname, int id, double score)
    {

        if (score > SCORE_LIMIT && !addedEntries.keySet().contains(id))
        {
            Entry entry = new Entry(nickname, id, score);
            addQueue.add(entry);
            addedEntries.put(id, entry);
        }

    }

    public void remove(int id)
    {
        removeQueue.add(addedEntries.get(id));
        addedEntries.remove(id);
    }
}
