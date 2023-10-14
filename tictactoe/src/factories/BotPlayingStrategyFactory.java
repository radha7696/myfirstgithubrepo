package factories;

import models.BotLevel;
import strategies.bot_playing.BotPlayingStrategy;
import strategies.bot_playing.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategy(BotLevel botLevel){
        switch (botLevel){
            case LOW:
            case HIGH:
            case MEDIUM:
                return new EasyBotPlayingStrategy();
        }
        throw new UnsupportedOperationException("Bot type" + botLevel + " is not supported");
    }
}
