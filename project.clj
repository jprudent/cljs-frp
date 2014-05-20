(defproject jmge-clj "0.1.0-SNAPSHOT"
  :description "A demo of FRP style with ClojureScript"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]
                 [ring/ring-core "1.2.0"]
                 [ring/ring-jetty-adapter "1.2.0"]
                 [ring/ring-json "0.2.0"]
                 [org.clojure/data.json "0.2.4"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"] [lein-ring "0.8.7"]]
  :ring {:handler services.core/app}
  :uberjar-name "cljs-frp-standalone.jar"
  :min-lein-version "2.0.0"
  :cljsbuild {
    :builds [{:id "cljs-frp"
              :source-paths ["src"]
              :compiler {
                :output-to "resources/public/generated-js/cljs-frp.js"
                :output-dir "resources/public/generated-js/out"
                :optimizations :none
                :source-map true}}]})

