fun main(){
    var Tina = Human("Tina",23,20)
    Tina.eat(24)
    println(Tina.weight)
    Tina.speak("Keep on keeping up")
    Tina.birthday()
    val Christine = User("Christine","Anne","annechristineadhiambo@gmail.com","0745118379","Chris99!")
    println(Christine.firstName)
    println(Christine.email)
}
class Human (var name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak (speech:String){
    }
    fun birthday(){
        println(age++)
    }
}
data class User( var firstName:String, var lastName:String, var email:String,var phoneNumber:String,var passWord:String)