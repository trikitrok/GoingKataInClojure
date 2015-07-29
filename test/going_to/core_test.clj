(ns going-to.core-test
  (:use midje.sweet)
  (:require [going-to.core :refer [factorial]]))

(facts
  "about factorial"

  (fact
    "can compute the factorial of small numbers"
    (map factorial [0 1 2 3 4 5 6 ]) => [1 1 2 6 24 120 720])

  (fact
    "can compute the factorial of much bigger numbers"
    (factorial 400) => 64034522846623895262347970319503005850702583026002959458684445942802397169186831436278478647463264676294350575035856810848298162883517435228961988646802997937341654150838162426461942352307046244325015114448670890662773914918117331955996440709549671345290477020322434911210797593280795101545372667251627877890009349763765710326350331533965349868386831339352024373788157786791506311858702618270169819740062983025308591298346162272304558339520759611505302236086810433297255194852674432232438669948422404232599805551610635942376961399231917134063858996537970147827206606320217379472010321356624613809077942304597360699567595836096158715129913822286578579549361617654480453222007825818400848436415591229454275384803558374518022675900061399560145595206127211192918105032491008000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000N))
