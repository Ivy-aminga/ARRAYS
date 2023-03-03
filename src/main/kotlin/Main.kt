fun main() {
    names("Nyeliep","Mumo","Aniso","Mideva")
    place()
    number()
    namee("Mumo","Nyeliep","Aniso")
    println(namee("Mumo","Nyeliep","Aniso"))
}


//1. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun names(mate1:String,mate2:String,mate3:String,mate4: String){
    var mates= arrayOf(mate1,mate2,mate3,mate4)
    println(mates.contentToString())
}

//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun place(){
    var cities = arrayOf("harare","mumbai","dodoma","jarkarta")
    println(cities.map { it.capitalize()   })
}

//3. Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun number(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var nos=numbers[1]+numbers[4]
    println(nos)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}


//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun namee (pal1:String,pal2:String,pal3:String ):String{
    var namee = arrayOf(pal1,pal2,pal3)
    return namee.contentToString()
}







