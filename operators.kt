import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime
import java.time.YearMonth
import java.util.Date

fun main(){
    operators()
    ifs()
    ifs2()
    Grades()
    greater()
    incr()
    incrs()
    digits()

}




fun operators(){
    val physics:Int = 70
    val geography:Int= 60
    val modulus: Int = (physics+geography)/2

    println("You have passed due to $modulus")
}

fun ifs(){
    val xtigi:Int=78
    val vdfg:Int=78
    if (xtigi > vdfg){
        println("success")

    }

    else if ( xtigi == vdfg){
        println("no winner")
        }


    else {
        println("failure")
    }

}

fun ifs2() {
    val positive: Int = -4
    if (positive > 0) {
        println("Positive")
    } else if (positive == 0) {
        println("Zero")
    } else {
        println("number is negative")
    }


}
fun Grades() {
    val Math: Int = 56
    val Eng: Int = 76
    val Kisw: Int = 88
    val Bio: Int = 62
    val pHY: Int = 70
    val Hist: Int = 90
    val bussiness: Int = 85

    val average: Int = (Math + Eng + Kisw + Bio + pHY + Hist + bussiness) / 7

    if (average > 81) {
        println("A")
    } else if (average > 75) {
        println("B+")
    } else if (average > 70) {
        println("B")
    } else if (average > 50) {
        println("B-")
    } else {
        (println("Failure"))
    }
}








fun greater(){
    val a:Int=90
    val b:Int=90
    val c:Int=30

//val greatestnumber= maxOf(number3,number2,number)
//    println("This is the greatest no $greatestnumber")

    if (a >= b && a >= c)
    {println("$a is greater")}
    else if(b >= a && b >= c)
    {println("$b is greater")}
    else

    {
        println("$c is the greatest")}






}

fun incr(){
    var grades:Int=-9
    while (grades<10){
        println(grades)
        grades++
    }

}

fun incrs(){
    var date=LocalDate.now()
    var time=LocalTime.now()
    var day=date.dayOfWeek
    var month=date.month

    println("The date is $date and the time is $time the day is $day while the month is $month")

}

fun digits(){
    var digit:Int=-900

    if (digit>-10 && digit<10){
                println("1 digit")

            }
    else if (digit<-10 && digit<100){
        println("2 digits")
    }
    else if (digit>-100 && digit<1000){
        println("3 digits")}
    else{
        println("above 3 digits")}



}

