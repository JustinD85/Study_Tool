(defproject base "0.1.0-SNAPSHOT"
  :description "A backend for a studying tool"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"] 
                 [org.clojure/java.jdbc "0.7.8"] 
                 [mysql/mysql-connector-java "8.0.13"]
                 [ring "1.7.1"]
                 [compojure "1.6.1"]
                 [http-kit "2.2.0"]
                 [cheshire "5.8.1"]]
  :plugins [[lein-auto "0.1.3"]]
  :main ^:skip-aot base.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
