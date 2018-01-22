;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns sunset-desert
  (:require [gorilla-plot.core :as plot]))
(+ 3 4)
(plot/list-plot [5 4 3 9 10 1])
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"data":[{"name":"eed22190-d8cc-44d5-b609-68c80c4406ef","values":[{"x":0,"y":5},{"x":1,"y":4},{"x":2,"y":3},{"x":3,"y":9},{"x":4,"y":10},{"x":5,"y":1}]}],"marks":[{"type":"symbol","from":{"data":"eed22190-d8cc-44d5-b609-68c80c4406ef"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"fill":{"value":"steelblue"},"fillOpacity":{"value":1}},"update":{"shape":"circle","size":{"value":70},"stroke":{"value":"transparent"}},"hover":{"size":{"value":210},"stroke":{"value":"white"}}}}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"eed22190-d8cc-44d5-b609-68c80c4406ef","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"eed22190-d8cc-44d5-b609-68c80c4406ef","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :data [{:name \"eed22190-d8cc-44d5-b609-68c80c4406ef\", :values ({:x 0, :y 5} {:x 1, :y 4} {:x 2, :y 3} {:x 3, :y 9} {:x 4, :y 10} {:x 5, :y 1})}], :marks [{:type \"symbol\", :from {:data \"eed22190-d8cc-44d5-b609-68c80c4406ef\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 1}}, :update {:shape \"circle\", :size {:value 70}, :stroke {:value \"transparent\"}}, :hover {:size {:value 210}, :stroke {:value \"white\"}}}}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"eed22190-d8cc-44d5-b609-68c80c4406ef\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"eed22190-d8cc-44d5-b609-68c80c4406ef\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}]}}"}
;; <=

;; @@
(ns sunset-desert1
  (:require [gorilla-plot.core :as plot]))
(+ 3 4)
(plot/list-plot [5 4 3 9 10 9 3 2])
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"data":[{"name":"a1a60480-8a3e-4534-970b-2210bd775e94","values":[{"x":0,"y":5},{"x":1,"y":4},{"x":2,"y":3},{"x":3,"y":9},{"x":4,"y":10},{"x":5,"y":9},{"x":6,"y":3},{"x":7,"y":2}]}],"marks":[{"type":"symbol","from":{"data":"a1a60480-8a3e-4534-970b-2210bd775e94"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"fill":{"value":"steelblue"},"fillOpacity":{"value":1}},"update":{"shape":"circle","size":{"value":70},"stroke":{"value":"transparent"}},"hover":{"size":{"value":210},"stroke":{"value":"white"}}}}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"a1a60480-8a3e-4534-970b-2210bd775e94","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"a1a60480-8a3e-4534-970b-2210bd775e94","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :data [{:name \"a1a60480-8a3e-4534-970b-2210bd775e94\", :values ({:x 0, :y 5} {:x 1, :y 4} {:x 2, :y 3} {:x 3, :y 9} {:x 4, :y 10} {:x 5, :y 9} {:x 6, :y 3} {:x 7, :y 2})}], :marks [{:type \"symbol\", :from {:data \"a1a60480-8a3e-4534-970b-2210bd775e94\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 1}}, :update {:shape \"circle\", :size {:value 70}, :stroke {:value \"transparent\"}}, :hover {:size {:value 210}, :stroke {:value \"white\"}}}}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"a1a60480-8a3e-4534-970b-2210bd775e94\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"a1a60480-8a3e-4534-970b-2210bd775e94\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}]}}"}
;; <=

;; @@

;; @@
