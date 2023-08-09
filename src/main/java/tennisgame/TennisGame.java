package tennisgame;

public class TennisGame
{
   private int playerOneScore;

   private int playerTwoScore;


   public void playerOneScores()
   {
      this.playerOneScore++;
   }


   public void playerTwoScores()
   {
      this.playerTwoScore++;
   }


   public String getScore()
   {
      if ( this.playerOneScore == this.playerTwoScore )
      {
         if ( this.playerOneScore > 2 )
         {
            return "Deuce";
         }
         return getPlayerScore( this.playerOneScore ) + " All";
      }
      else
      {
         if ( this.playerOneScore >= 3 && this.playerTwoScore >= 3 )
         {
            if ( this.playerOneScore > this.playerTwoScore )
            {
               return "Player1 Advantage";
            }
            return "Player2 Advantage";
         }
         else
         {
            final String playerOneScore = getPlayerScore( this.playerOneScore );
            final String playerTwoScore = getPlayerScore( this.playerTwoScore );
            return playerOneScore + " " + playerTwoScore;
         }

      }
   }


   private String getPlayerScore( final int playerScore )
   {
      switch ( playerScore )
      {
         case 0:
            return "Love";
         case 1:
            return "Fifteen";
         case 2:
            return "Thirty";
         case 3:
            return "Forty";
         default:
            return "";
      }
   }

}
