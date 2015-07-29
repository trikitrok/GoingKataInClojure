(ns going-to.core-test
  (:use midje.sweet)
  (:require [going-to.core :refer [factorial]]))

(facts
  "about factorial"
  (map factorial [0 1 2 3 4 5 6 ]) => [1 1 2 6 24 120 720])
