(ns hello-world.core)

(defn hello [] "Hello, world!")

(set! (.-innerHTML (js/document.getElementById "app")) (hello))
