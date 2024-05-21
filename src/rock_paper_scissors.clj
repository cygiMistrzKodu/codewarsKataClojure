(ns rock-paper-scissors
  (:require [clojure.core.match :refer [match]]))

(defn player_2_winner []
  "Player 2 won!"
  )

(defn player_1_winner []
  "Player 1 won!"
  )

(defn rps [p1 p2]


  (match [p1 p2]
         ["scissors" "rock"] (player_2_winner)
         ["paper" "scissors"] (player_2_winner)
         ["rock" "paper"] (player_2_winner)
         ["rock" "scissors"] (player_1_winner)
         ["scissors" "paper"] (player_1_winner)
         ["paper" "rock"] (player_1_winner)
         [_ _] "Draw!"
         )
  )