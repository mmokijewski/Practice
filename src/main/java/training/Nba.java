package training;
import java.util.Arrays;

class Nba {

    public static String nbaCup(String resultSheet, String toFind) {
        int win = 0;
        int draw = 0;
        int lost = 0;
        int scoredPoints = 0;
        int concededPoints = 0;
        int rank;

        if (toFind.equals(""))
            return "";

        String[] teamNameWords = toFind.split(" ");
        int teamNameWordsQuantity = teamNameWords.length;
        String teamNameFirstWord = teamNameWords[0];
        String teamNameLastWord = teamNameWords[teamNameWords.length - 1];

        String[] matches = resultSheet.split(",");
        for (String i : matches) {
            if (i.contains(toFind)) {
                String[] oneMatchWords = i.split(" ");

                int teamNameFirstWordIndex = Arrays.asList(oneMatchWords).indexOf(teamNameFirstWord);
                int findTeamPoints;
                int opponentPoints;

                if (i.contains("."))
                    return "Error(float number):" + i;

                if (teamNameFirstWordIndex == 0) {
                    findTeamPoints = Integer.parseInt(oneMatchWords[teamNameWordsQuantity]);
                    opponentPoints = Integer.parseInt(oneMatchWords[oneMatchWords.length - 1]);
                } else {
                    findTeamPoints = Integer.parseInt(oneMatchWords[oneMatchWords.length - 1]);
                    opponentPoints = Integer.parseInt(oneMatchWords[teamNameFirstWordIndex - 1]);
                }

                if (findTeamPoints == opponentPoints)
                    draw += 1;
                else if (findTeamPoints > opponentPoints)
                    win += 1;
                else
                    lost += 1;

                scoredPoints += findTeamPoints;
                concededPoints += opponentPoints;
            }
        }
        rank = 3 * win + draw;

        if (resultSheet.contains(toFind + " "))
            return toFind + ":W=" + win + ";D=" + draw + ";L=" + lost + ";Scored=" + scoredPoints + ";Conceded=" + concededPoints + ";Points=" + rank;
        else
            return toFind + ":This team didn't play!";
    }
}

