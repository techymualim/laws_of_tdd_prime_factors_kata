package PrimeFactorsTest
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class PrimeFactorsTest {
@Test
// in kotlin function starts with FUN
fun factor(){
assertThat(factorsOf(1),`is`(emptyList()))
    assertThat(factorsOf(2),`is`(listOf(2)))
    assertThat(factorsOf(4),`is`(listOf(2,2)))
    assertThat(factorsOf(9),`is`(listOf(3,3)))
    assertThat(factorsOf(2*2*3*3*5*7*11*13),`is`(listOf(2,2,3,3,5,7,11,13)))

}

    private fun factorsOf(n:Int): List<Int>{
        var remainder=n
        val factors= mutableListOf<Int>()
        var divisor=2
        while(remainder>1){
            while(remainder%divisor ==0){
                factors.add(divisor)
                remainder /=divisor
            }
            divisor++
        }
//        if(remainder>1){
//            while(remainder%2==0){
//                factors.add(2)
//                remainder/=2
//            }
//
//        }
//        if(remainder>1)
//            factors.add(remainder)
        return factors
    }
}