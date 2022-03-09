fun main(){
    groupOfName()
    capitalcities()
    sum()
    println(names().contentToString())







}
fun groupOfName() {
    var name = arrayOf("Jane","Laura","Lona","Bakhita")
    println(name.contentToString())


}
fun capitalcities(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{
        cities->
        println(cities.capitalize())
    }

}
fun sum(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var t = numbers[2]+numbers[5]
    println(t)
    println(numbers.get(11))
    var sortednumbers= numbers.sortedArray()
    println(sortednumbers.contentToString())


}
fun names(): Array<String> {
    var name= arrayOf("Jane","Mercy","Sharon")
    return name
}




