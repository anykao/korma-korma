(defproject korma-tool "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-time "0.5.0"]
                 [com.oracle/ojdbc "1.4"]
                 [mysql/mysql-connector-java "5.1.21"]
                 [korma  "0.3.0-RC5"]
                 [doric  "0.8.0"];; Clojure table layout
                 [conf-er  "1.0.1"]
                 [log4j "1.2.15"
                  :exclusions [javax.mail/mail
                               javax.jms/jms
                               com.sun.jdmk/jmxtools
                               com.sun.jmx/jmxri]]
                 ]
  :plugins  [[s3-wagon-private  "1.1.2"]
             [lein-localrepo  "0.5.0"]]
  :profiles  {:dev  {:dependencies  [[alembic  "0.1.3"]]}}
  :jvm-opts  ["-Dconfig=config.clj"]
  :repositories  [["private"  {:url  "s3p://mybucketofme/releases/"}]]
  :main korma-tool.mysql)
