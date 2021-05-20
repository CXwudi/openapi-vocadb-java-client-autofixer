package mikufan.cx.vocadbapiclientfixer.coroutinetest

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis


/**
 * @date 2021-05-20
 * @author CX无敌
 */
class Test {
  @Test
  fun testCoroutine() = runBlocking<Unit> {
    val time = measureTimeMillis {
      var one = 0
      var two = 0
      val j1 = launch { one = doSomethingUsefulOne() }
      val j2 = launch { two = doSomethingUsefulTwo() }
      j1.join()
      j2.join()
      println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
  }

  suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
  }

  suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
  }
}