package inner_classes


fun main(){
    Plane().startMainEngines()
}

class Plane {
    var isFirstEngineStarted = false
    var isSecondEngineStarted = false
    private inner class FirstEngine{
        fun startEngineOne(){
            this@Plane.isFirstEngineStarted=true
            println("first engine started")
        }
    }

    private inner class SecondEngine{
        fun startEngineTwo(){
            this@Plane.isSecondEngineStarted=true
            println("second engine started")
        }
    }

    fun startMainEngines(){
        FirstEngine().startEngineOne()
        SecondEngine().startEngineTwo()
    }
}