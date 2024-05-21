(ns rock-paper-scissors)

(defn rps [p1 p2]
  (cond
    (= p1 p2) "Draw!"
    (case [p1 p2]
      ["scissors" "paper"] true
      ["paper" "rock"] true
      ["rock" "scissors"] true
      false) "Player 1 won!"
    :else "Player 2 won!"))

