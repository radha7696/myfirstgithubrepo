package strategies.bot_playing;

import javafx.util.Pair;
import models.Board;

public interface BotPlayingStrategy {
    Pair<Integer, Integer> getNextMove(Board board);
}
