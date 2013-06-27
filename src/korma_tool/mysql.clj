(ns korma-tool.mysql
  (:require [korma.db :refer :all]
            [korma.core :refer [exec-raw]]
            [conf-er :refer [config]]
            [clojure.pprint :refer [pprint]]
            [clj-time.format :refer [unparse formatter-local]]
            [clj-time.local :refer [to-local-date-time]]
            [doric.core  :refer [table html raw] :as d]
            )
  (:gen-class))
(defn -main
  [& args]
  (defdb db (mysql (config :mysql)))
  (print (table  ^{:format html} [:Database]  (exec-raw "show databases" :results)))
  (print (table  ^{:format html} [{:a 1 :b 2}{:a 1 :b 2}]))
  )

(comment
  (print (table  ^{:format html} [{:a 1 :b 2}{:a 1 :b 2}]))
  )
