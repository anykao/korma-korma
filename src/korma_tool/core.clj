(ns korma-tool.core
  (:gen-class))
(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "hello world")
  )
