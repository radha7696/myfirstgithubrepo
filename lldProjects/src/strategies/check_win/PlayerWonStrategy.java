package strategies.check_win;

import models.Move;

public interface PlayerWonStrategy {

    boolean hasWon(Move move);

    void handleUndo(Move move);
}
