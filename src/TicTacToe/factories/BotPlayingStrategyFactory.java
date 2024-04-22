package TicTacToe.factories;

import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;
import TicTacToe.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import TicTacToe.strategies.botplayingstrategy.HardBotPlayingStrategy;
import TicTacToe.strategies.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel == BotDifficultyLevel.EASY) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.MEDIUM) {
            return new MediumBotPlayingStrategy();
        } else {
            return new HardBotPlayingStrategy();
        }
    }

}
